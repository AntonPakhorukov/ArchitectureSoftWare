public class GoldGenerator extends ItemFabric{
    @Override
    public GameItem createItem (){
        System.out.println("Создал новый сундук");
        return new GoldReward();
    }
}
