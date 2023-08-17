public abstract class ItemFabric {
    public void openReward () {
        GameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract GameItem createItem();
}
