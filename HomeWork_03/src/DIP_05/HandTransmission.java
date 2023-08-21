package DIP_05;
/**
 * Класс ручной коробки передач
 */
public class HandTransmission implements Transmission{
    /**
     * Определен способ переключения ручной коробки передач
     */
    @Override
    public void switchingTransmission() {
        System.out.println("Водитель переключил передачу");
    }
}
