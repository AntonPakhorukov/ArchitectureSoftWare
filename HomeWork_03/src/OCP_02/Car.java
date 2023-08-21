package OCP_02;
/**
 * Класс легковой автомобиль наследуется от ТС
 */
public class Car extends Vehicle{
    public Car(int capacityPeople, String type) {
        super(capacityPeople, type);
    }
    /**
     * Переопределен метод максимальной вместимости с учетом класса ТС
     * @return максимальную вместимость
     */
    @Override
    public int maxCapacityPeople() {
        return (int)(super.maxCapacityPeople() * 1.25);
    }
}
