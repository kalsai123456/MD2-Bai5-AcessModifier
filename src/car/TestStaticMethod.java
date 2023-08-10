package car;

public class TestStaticMethod {
    public static void main(String[] args) {
        Car car1 = new Car("Vinfast","electric");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Audi","Ron-97");
        System.out.println(Car.numberOfCar);
        System.out.println(car1);
    }
}
