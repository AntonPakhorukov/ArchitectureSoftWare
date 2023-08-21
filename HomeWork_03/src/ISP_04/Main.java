package ISP_04;
/**
 * SOLID
 * ISP - принцип разделения интерфейсов
 * Нам не нужно в один интерфейс писать все методы
 */
public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "X6");
        bmw.setSizeTrunk(100, 40, 150);
        System.out.printf("Количество колес у %s = %d\n", bmw.brand, bmw.wheel());
        System.out.printf("Объем багажника у %s = %d литров\n", bmw.brand, bmw.trunkVolume());
        MotorBike bike = new MotorBike("Kawasaki", "ZZR");
        System.out.printf("Количество колес у %s = %d\n", bike.brand, bike.wheel());
    }
}
