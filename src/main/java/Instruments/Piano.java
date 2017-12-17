package Instruments;

import ShopStuff.ISell;

public class Piano extends Instrument implements IPlay, ISell {
    private String pianoType;

    public Piano(String name, String colour, String material, InstrumentType type, double buyPrice, double sellPrice, String pianoType) {
        super(name, colour, material, type, buyPrice, sellPrice);
        this.pianoType = pianoType;
    }

    public String getPianoType() {
        return pianoType;
    }

    public String play(String song) {
        return "playing '" + song + "' on the piano";
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
