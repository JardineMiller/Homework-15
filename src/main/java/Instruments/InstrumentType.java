package Instruments;

public enum InstrumentType {
    GUITAR("Instruments.Guitar"),
    DRUMS("Guitars"),
    KEYBOARD("Keyboard"),
    STRINGS("Strings"),
    WOODWIND("Woodwind"),
    BRASS("Brass");

    private final String type;

    InstrumentType(String type) {
        this.type = type;
    }

    public String getPrettyType() {
        return type;
    }
}
