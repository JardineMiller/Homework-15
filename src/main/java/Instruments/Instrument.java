package Instruments;

public abstract class Instrument {
    protected String colour;
    protected String material;
    protected InstrumentType type;
    protected double buyPrice;
    protected double sellPrice;

    public Instrument(String colour, String material, InstrumentType type, double buyPrice, double sellPrice) {
        this.colour = colour;
        this.material = material;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

}
