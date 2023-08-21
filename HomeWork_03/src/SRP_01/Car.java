package SRP_01;
/**
 * Класс Car содержит поля и выводит информацию на экран
 */
public class Car {
    private String brand;
    private String model;
    private int startPrice;

    public int getStartPrice() {
        return startPrice;
    }

    public Car(String brand, String model, int startPrice) {
        this.brand = brand;
        this.model = model;
        this.startPrice = startPrice;
    }
    public String getInfoCar() {
        return "Brand: " + brand + ", Model: " + model;
    }
}
