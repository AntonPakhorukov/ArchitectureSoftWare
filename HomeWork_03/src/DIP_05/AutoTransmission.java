package DIP_05;

/**
 * Класс автоматической коробки передач
 */
public class AutoTransmission implements Transmission{
    /**
     * Определен способ переключения автоматической коробки передач
     */
    @Override
    public void switchingTransmission() {
        System.out.println("Коробка автоматически переключила передачу");
    }
}
