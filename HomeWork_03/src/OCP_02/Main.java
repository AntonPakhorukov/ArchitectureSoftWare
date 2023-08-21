package OCP_02;
/**
 * Solid
 * OCP - принцип открытости / закрытости
 * открыты для расширений, но закрыты для модификаций
 */
public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(3, "Truck");
        Car car = new Car(4, "sedan");
        Bus bus = new Bus(23, "bus");
        /**
         * Легко масштабируется, при этом закрыт для модификаций
         */
        System.out.printf("Максимальная вместимость грузовика = %d\n", truck.maxCapacityPeople());
        System.out.printf("Максимальная вместимость седана = %d\n", car.maxCapacityPeople());
        System.out.printf("Максимальная вместимость автобуса = %d\n", bus.maxCapacityPeople());
    }
}
