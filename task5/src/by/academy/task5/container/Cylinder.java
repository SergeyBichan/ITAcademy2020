package by.academy.task5.container;

import static by.academy.task5.constant.Constant.RADIUS_MAX;

public class Cylinder extends Container {


    public Cylinder(String name, int height, double volumeFact, int density) {
        super(name, height, volumeFact, density);
    }

    @Override
    public double VolumeCalculation() {
        return (float)Math.PI * Math.pow((RADIUS_MAX/2), 2) * height;
    }
}
