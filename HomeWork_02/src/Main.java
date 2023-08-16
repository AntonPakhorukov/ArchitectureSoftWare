import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());

        for (int i = 0; i < 10; i++) {
            int index  = Math.abs(random.nextInt() %2 == 0 ? 0 : 1);
            ItemGenerator itemGenerator = generatorList.get(index);
            itemGenerator.openReward();
        }
    }
}

/**
 * Создаем прообраз фабрики, который будет у нас наследоваться
 * По сути ItemGenerator - это и есть фабричный метод, он был прототипирован
 * нашим генератором и модули создаются по его подобию,
 * но привязаны к конкретному продукту
 *
 * Продукты по сути являются модулями
 */
abstract class ItemGenerator {
    /**
     * Метод открытия сундука
     */
    public void openReward () {
        GameItem gameItem = createItem();
        gameItem.open();
    }

    /**
     * Используем интерфейс как объект в прообразе фабрики,
     * то есть он позволит генерировать наши продукты
     * @return возвращает наши продукты
     */
    public abstract GameItem createItem();
}

/**
 * Создаем интерфейс, который будет реализовываться в фабрике,
 * производит продукт
 */
interface GameItem{
    void open();
}

/**
 * Создаем одну фабрику => фабрика по производству золота
 * наследует абстрактный класс ItemGenerator
 */
class GoldGenerator extends ItemGenerator {

    /**
     * Так как мы наследуемся от ItemGenerator, то нам нужно переопределить метод
     * @return возвращает продукт - золото
     */
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
/**
 * Создаем награду - золото
 */
class GoldReward implements GameItem{

    /**
     * Переопределяем метод, достаем золото
     */
    @Override
    public void open() {
        System.out.println("Gold");
    }
}

/**
 * Создаем еще одну фабрику, которая будет создавать бриллианты
 */
class GemGenerator extends ItemGenerator {
    /**
     * Переопределили метод создания продукта
     * @return возвращает новый продукт - бриллиант
     */
    @Override
    public GameItem createItem() {
        return new GenReward();
    }
}

/**
 * Создаем другой продукт, бриллианты
 */
class GenReward implements GameItem{

    /**
     * Переопределяем метод, достаем бриллианты
     */
    @Override
    public void open() {
        System.out.println("Gen");
    }
}