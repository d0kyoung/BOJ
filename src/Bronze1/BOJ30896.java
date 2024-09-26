package Bronze1;

import java.util.*;

public class BOJ30896 {

    static int N;
    static int[][] players;
    static int minDifference = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        players = new int[N][2];

        for (int i = 0; i < N; i++) {
            players[i][0] = scanner.nextInt(); // A_i (teamwork score)
            players[i][1] = scanner.nextInt(); // B_i (ability score)
        }

        // Use backtracking to split teams
        divideTeams(0, new ArrayList<>(), new ArrayList<>());

        System.out.println(minDifference);

        scanner.close();
    }

    static void divideTeams(int index, List<Integer> team1, List<Integer> team2) {
        if (index == N) {
            if (!team1.isEmpty() && !team2.isEmpty()) {
                int abilityTeam1 = calculateAbility(team1);
                int abilityTeam2 = calculateAbility(team2);
                int difference = Math.abs(abilityTeam1 - abilityTeam2);
                minDifference = Math.min(minDifference, difference);
            }
            return;
        }

        // Include current player in team1
        team1.add(index);
        divideTeams(index + 1, team1, team2);
        team1.remove(team1.size() - 1);

        // Include current player in team2
        team2.add(index);
        divideTeams(index + 1, team1, team2);
        team2.remove(team2.size() - 1);
    }

    static int calculateAbility(List<Integer> team) {
        int minTeamwork = Integer.MAX_VALUE;
        int sumAbilities = 0;

        for (int idx : team) {
            minTeamwork = Math.min(minTeamwork, players[idx][0]);
            sumAbilities += players[idx][1];
        }

        return minTeamwork * sumAbilities;
    }
}



//1. 각 사람마다 팀워크 점수 A, 실력 점수 B가 있음 모두 int형
//2. 팀 S의 능력 = 팀원 중 가장 낮은 팀워크 점수 X 모든 팀원의 실력 점수의 합
//    (1) 팀워크 점수를 오름차순으로 정렬 1,2,3,4
//    (2) 1번째가 팀워크 점수가 가장 작은 사람
//    (3) 다른 한명은 팀워크 점수가 k번째로 작은 사람
//    (4) 이 경우 1~
//구해야 하는 것 : 두 팀의 능력 차이가 최소가 되게 나눴을 때 능력 차이를 출력한다.
