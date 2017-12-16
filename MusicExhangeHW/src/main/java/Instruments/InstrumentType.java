package Instruments;

public enum InstrumentType {

    KEYBOARD("Keyboard"),
    VIOLIN("Violin"),
    GUITAR("Guitar"),
    PIANO("Piano"),
    SAXOPHONE("Saxophone"),
    TRUMPET("Trumpet");


    private String name;

    InstrumentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
