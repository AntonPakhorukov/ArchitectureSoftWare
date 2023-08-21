package DIP_05;
/**
 * SOLID
 * DIP - принцип инверсии зависимостей
 */
public class Main {
    private static Transmission autoTransmission = new AutoTransmission();
    private static Transmission handTransmission = new HandTransmission();
    public static void main(String[] args) {
        Car audi = new Car("Audi", "Q8",  autoTransmission);
        System.out.println(audi.getInfoCar());
        audi.switchingTransmission();
        Car toyota = new Car("Toyota", "Prado", handTransmission);
        System.out.println(toyota.getInfoCar());
        toyota.switchingTransmission();
    }
}
