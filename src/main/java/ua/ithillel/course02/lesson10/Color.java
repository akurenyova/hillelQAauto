package ua.ithillel.course02.lesson10;

public enum Color {
    WHITE(0Xffffff) {
        public String toString() {
            return "White as snow";
        }
    },
    GREY(0X606361) {
        public String toString() {
            return "Grey as mouse";
        }
    },
    GREEN(0X03fc0f) {
        public String toString() {
            return "Green as grass";
        }
    },
    BLUE(0X03fcf8) {
        public String toString() {
            return "Blue as sea";
        }
    },
    RED(0Xfc030f) {
        public String toString() {
            return "Red as poppy";
        }
    },
    YELLOW(0Xfcf403) {
        public String toString() {
            return "Yellow as chick";
        }
    };

    private int hexFormat;

    Color(int hexFormat) {
        this.hexFormat = hexFormat;
    }

    public int getHexFormat() {
        return hexFormat;
    }
}
