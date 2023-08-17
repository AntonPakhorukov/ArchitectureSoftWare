public class GlassGenerator extends ItemFabric{
    @Override
    public GameItem createItem() {
        System.out.println("Создал новый сундук");
        return new GlassReward();
    }
}
