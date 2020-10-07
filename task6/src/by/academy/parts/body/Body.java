package by.academy.parts.body;

public abstract class Body {
    String name = "";
    int size;

    public int getSize() {
        return size;
    }

    public Body(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Body{" +
                "name='" + name + '\'' +
                '}';
    }
}
