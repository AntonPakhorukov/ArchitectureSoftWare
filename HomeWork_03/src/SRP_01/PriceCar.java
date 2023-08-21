package SRP_01;
/**
 * Класс PriceCar имеет поля год выпуска автомобиля и текущий год,
 * а так же имеет всего один метод расчета текущей стоимости автомобиля с учетом
 * периода эксплуатации
 */
public class PriceCar {
    /**
     * Дата выпуска автомобиля
     */
    private int yearOfIssue;
    /**
     * Текущая дата
     */
    private int currentDate;

    /**
     * Метод расчета стоимости автомобиля с учетом его эксплуатации
     * @param startPrice Цена нового автомобиля
     * @param yearOfIssue Года выпуска
     * @param currentDate Текущий год
     * @return Актуальная стоимость автомобиля
     */
    public int getPriceCar(int startPrice, int yearOfIssue, int currentDate) {
        if (yearOfIssue - currentDate == 1) {
            return (int) (startPrice * 0.9);
        } else if (yearOfIssue - currentDate == 2) {
            return (int) (startPrice * 0.8);
        } else if (yearOfIssue - currentDate > 2 && yearOfIssue - currentDate < 6) {
            return (int) (startPrice * 0.75);
        }
        return (int) (startPrice * 0.7);
    }
}
