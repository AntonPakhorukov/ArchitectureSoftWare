package ISP_04;

/**
 * Класс "MotorBike" имплементирует только один интерфейс QuantityWheel,
 * так как у мотоцикла нет багажника (есть бардачок)
 */
public class MotorBike implements QuantityWheel {
    /**
     * Класс так же имеет поля бренд и модель, количество колес
     */
    String brand;
    String model;
    private int wheel = 2;
    public MotorBike(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    /**
     * Метод возвращает количество колес у мотоцикла
     * @return количество колес
     */
    @Override
    public int wheel() {
        return wheel;
    }
}
