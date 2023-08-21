package OCP_02;
/**
 * Класс грузовик наследуется от ТС
 */
public class Truck extends Vehicle{
    public Truck(int capacityPeople, String type) {
        super(capacityPeople, type);
    }
    /**
     * Переопределен метод максимальной вместимости с учетом класса ТС
     * @return максимальную вместимость
     */
    @Override
    public int maxCapacityPeople() {
        return super.maxCapacityPeople();
    }
}
