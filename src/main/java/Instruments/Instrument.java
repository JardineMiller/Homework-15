package Instruments;

public abstract class Instrument {
    protected String name;
    protected String colour;
    protected String material;
    protected InstrumentType type;
    protected double buyPrice;
    protected double sellPrice;

    public Instrument(String name, String colour, String material, InstrumentType type, double buyPrice, double sellPrice) {
        this.name = name;
        this.colour = colour;
        this.material = material;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return colour + " " + material + " " + name;
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
