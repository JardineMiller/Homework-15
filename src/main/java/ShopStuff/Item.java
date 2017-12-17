package ShopStuff;

public abstract class Item {
    protected double buyPrice;
    protected double sellPrice;
    protected String description;

    public Item(double buyPrice, double sellPrice, String description) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.description = description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }
}
