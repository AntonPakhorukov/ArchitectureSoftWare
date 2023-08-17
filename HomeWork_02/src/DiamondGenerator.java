public class DiamondGenerator extends ItemFabric{
    @Override
    public GameItem createItem() {
        System.out.println("Создал новый сундук");
        return new DiamondReward();
    }
}
