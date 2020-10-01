package by.academy.task5.container;


import static by.academy.task5.constant.Constant.DENSITY_1000;

public abstract class Container implements containerInterface {
    int height;
    int width;
    String name;
    int diagonal;

    @Override
    public String toString() {
        return "Container{" +
                "height=" + height +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }




    public Container(int height, int width, String name, int diagonal) {
        this.height = height;
        this.width = width;
        this.name = name;
        this.diagonal = diagonal;
    }

    @Override
    public double MassCalculation(int density) {
        return VolumeCalculation() * density;
    }
}
