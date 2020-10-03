package by.academy.task5.container;

import static by.academy.task5.constant.Constant.RADIUS_MIN;

public class SmallCylinder extends Container {
    public SmallCylinder(int height, String name, double volumeFact, int density) {
        super(height, name, volumeFact, density);
    }

    @Override
    public double VolumeCalculation() {
        return Math.PI * Math.pow(RADIUS_MIN/2, 2) * height;
    }
}
