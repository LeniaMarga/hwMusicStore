package items;

public enum ItemType {
GUITARSTRINGS("Guitar Strings"),
MUSICBOOK("Music Book"),
SPEAKER("Speaker"),
EQUIPEMENT("Equipment");

private String name;

    ItemType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
