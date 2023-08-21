package OCP_02;

/**
 * Класс Автобус наследуется от ТС
 */
public class Bus extends Vehicle{
    public Bus(int capacityPeople, String type) {
        super(capacityPeople, type);
    }

    /**
     * Переопределен метод максимальной вместимости с учетом класса ТС
     * @return максимальную вместимость
     */
    @Override
    public int maxCapacityPeople() {
        return super.maxCapacityPeople() * 2;
    }
}
