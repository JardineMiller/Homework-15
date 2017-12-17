package ShopStuff;

public class GuitarStrings extends Item implements ISell {

    public GuitarStrings(double buyPrice, double sellPrice, String description) {
        super(buyPrice, sellPrice, description);
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
