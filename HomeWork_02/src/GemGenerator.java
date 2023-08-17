public class GemGenerator extends ItemFabric{

    @Override
    public GameItem createItem() {
        System.out.println("Создал новый сундук");
        return new GemReward();
    }
}
