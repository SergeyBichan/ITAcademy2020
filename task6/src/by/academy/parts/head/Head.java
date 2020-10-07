package by.academy.parts.head;

public abstract class Head {
    String name;
    int size;

    public int getSize() {
        return size;
    }

    public Head(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Head{" +
                "name='" + name + '\'' +
                '}';
    }
}
