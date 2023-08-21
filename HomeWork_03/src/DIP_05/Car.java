package DIP_05;
/**
 * Класс "Car" содержит поле коробки передач
 */
public class Car {
    /**
     * Класс содержит
     */
    private String brand;
    private String model;
    private Transmission transmission;
    public Transmission getTransmission() {
        return transmission;
    }
    public Car(String brand, String model, Transmission transmission) {
        this.brand = brand;
        this.model = model;
        this.transmission = transmission;
    }
    public void switchingTransmission() {
        this.transmission.switchingTransmission();
    }

    public String getInfoCar() {
        return "Brand: " + brand + ", Model: " + model;
    }
}
