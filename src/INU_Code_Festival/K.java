package INU_Code_Festival;

class Car {
    private final String brand;
    private final String model;

    Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand ='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
public class K {
    public static void main(String[] args) {
        Car car = new Car("현대", "SUV");

        System.out.println(car); // 출력 : Car{brand ='현대', model='SUV'}
    }
}
