package Instruments;

import ShopStuff.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {
    private int numOfValves;

    public Trumpet(String name, String colour, String material, InstrumentType type, double buyPrice, double sellPrice, int numOfValves) {
        super(name, colour, material, type, buyPrice, sellPrice);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    public String play(String song) {
        return "jazzing along to '" + song + "' to the trumpet";
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
