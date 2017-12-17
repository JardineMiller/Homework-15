package Instruments;

import ShopStuff.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private int numOfStrings;

    public Guitar(String name, String colour, String material, InstrumentType type, double buyPrice, double sellPrice, int numOfStrings) {
        super(name, colour, material, type, buyPrice, sellPrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play(String song) {
        return "strumming away to '" + song + "' on the guitar!";
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
