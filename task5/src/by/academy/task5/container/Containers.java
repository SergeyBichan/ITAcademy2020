package by.academy.task5.container;

public abstract class Containers implements containerInterface {
    String form;
    String name;
    int height;
    int width;
    int bigContainer;
    int smallContainer;
    int densityLow = 1000;
    int densityHigh = 2000;

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getBigContainer() {
        return bigContainer;
    }

    public void setBigContainer(int bigContainer) {
        this.bigContainer = bigContainer;
    }

    public int getSmallContainer() {
        return smallContainer;
    }

    public void setSmallContainer(int smallContainer) {
        this.smallContainer = smallContainer;
    }

    public int getDensityLow() {
        return densityLow;
    }

    public void setDensityLow(int densityLow) {
        this.densityLow = densityLow;
    }

    public int getDensityHigh() {
        return densityHigh;
    }

    public void setDensityHigh(int densityHigh) {
        this.densityHigh = densityHigh;
    }
}
