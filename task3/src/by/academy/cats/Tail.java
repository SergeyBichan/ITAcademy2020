package by.academy.cats;

public class Tail {
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public Tail(){

    }

    @Override
    public String toString() {
        return "Tail{" +
                "colour='" + colour + '\'' +
                '}';
    }

    public Tail(String colour) {
        this.colour = colour;
    }
}
