package SRP_01;
/**
 * SOLID
 * SRP - Принцип единственной ответственности
 */
public class Main {
    private static PriceCar price = new PriceCar();
    public static void main(String[] args) {
        Car car = new Car("Land Rover", "Range Rover", 4000000);
        System.out.println(car.getInfoCar());
        System.out.printf("currentPrice = %d", price.getPriceCar(car.getStartPrice(), 2015, 2023));
    }
}
