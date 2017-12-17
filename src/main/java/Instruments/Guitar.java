package Instruments;

public class Guitar extends Instrument implements IPlay {
    private int numOfStrings;

    public Guitar(String colour, String material, InstrumentType type, double buyPrice, double sellPrice, int numOfStrings) {
        super(colour, material, type, buyPrice, sellPrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play(String song) {
        return "Strumming away to " + song + " on the guitar!";
    }
}
