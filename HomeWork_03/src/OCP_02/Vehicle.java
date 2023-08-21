package OCP_02;
/**
 * Создаем базовый класс Транспорт
 */
public class Vehicle {
    /**
     * Базовый класс имеет приватные поля вместимость человек и тип ТС
     */
    private int capacityPeople;
    private String type;

    public int getCapacityPeople() {
        return capacityPeople;
    }
    public String getType() {
        return type;
    }
    public Vehicle(int capacityPeople, String type) {
        this.capacityPeople = capacityPeople;
        this.type = type;
    }

    /**
     * А так же имеет единственный метод максимальной вместимости человек
     * @return максимальная вместимость людей
     */
    public int maxCapacityPeople(){
        return capacityPeople;
    }
}
