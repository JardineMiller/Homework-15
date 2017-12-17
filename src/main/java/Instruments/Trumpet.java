package Instruments;

public class Trumpet extends Instrument implements IPlay {
    private int numOfValves;

    public Trumpet(String colour, String material, InstrumentType type, double buyPrice, double sellPrice, int numOfValves) {
        super(colour, material, type, buyPrice, sellPrice);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    public String play(String song) {
        return "Jazzing along to " + song;
    }
}
