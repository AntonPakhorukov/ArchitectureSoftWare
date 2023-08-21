package ISP_04;
/**
 * Класс "Car" имплементирует 2 интерфейса
 */
public class Car implements TrunkVolume, QuantityWheel {
    /**
     * Класс содержит поля марка и модель,
     * а так же размеры багажника
     */
    String brand;
    String model;

    private int length, height, weight;
    private int wheel = 4;

    /**
     * Метод добавления размеров багажного отделения
     * @param length длина багажного отделения
     * @param height высота багажного отделения
     * @param weight ширина багажного отделения
     */
    public void setSizeTrunk(int length, int height, int weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    /**
     * Метод выдает информацию об автомобиле
     * @return данные об автомобиле
     */
    public String getInfoCar() {
        return "Brand: " + brand + ", Model: " + model;
    }

    /**
     * Переопределен метод расчета объема багажного отделения
     * @return размер багажного отделения в литрах
     */
    @Override
    public int trunkVolume() {
        return (height * weight * length) / 1000;
    }

    /**
     * Метод возвращает количество колес у ТС
     * @return количество колес
     */
    @Override
    public int wheel() {
        return wheel;
    }
}
