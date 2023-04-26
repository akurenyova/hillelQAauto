package org.example.lesson09;

public enum Size {
    SMALL("S", 10, 20),
    MEDIUM("M", 15, 25),
    LARGE("L", 30, 40),
    EXTRA_LARGE("XL", 35, 45);

    private String shortName;
    private int width;
    private int length;

    Size(String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;
    }

    public String getShortName() {
        return shortName;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "\"" + shortName + "\" or \""
                + name() + "\""
                + " size: width = " + width
                + ", length = " + length;
    }
}
