package Instruments;

public class Piano extends Instrument implements IPlay {
    private String pianoType;

    public Piano(String colour, String material, InstrumentType type, double buyPrice, double sellPrice, String pianoType) {
        super(colour, material, type, buyPrice, sellPrice);
        this.pianoType = pianoType;
    }

    public String getPianoType() {
        return pianoType;
    }

    public String play(String song) {
        return "playing '" + song + "' on the piano";
    }
}
