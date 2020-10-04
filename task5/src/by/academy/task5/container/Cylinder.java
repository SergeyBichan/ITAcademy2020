package by.academy.task5.container;

import static by.academy.task5.constant.Constant.RADIUS_MAX;

public class Cylinder extends Container {
    public Cylinder(int height, String name, double volumeFact, int density) {
        super(height, name, volumeFact, density);
    }

    @Override
    public double VolumeCalculation() {
        return (float)Math.PI * Math.pow((RADIUS_MAX/2), 2) * height;
    }
}
