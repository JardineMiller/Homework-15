package ShopStuff;

public class SheetMusic extends Item implements ISell {
    public SheetMusic(double buyPrice, double sellPrice, String description) {
        super(buyPrice, sellPrice, description);
    }

    public double calculateMarkup(double buyPrice, double sellPrice) {
        return sellPrice - buyPrice;
    }
}
