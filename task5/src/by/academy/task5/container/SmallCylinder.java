package by.academy.task5.container;

import static by.academy.task5.constant.Constant.RADIUS_MIN;

public class SmallCylinder extends Container {


    public SmallCylinder(String name, int height, double volumeFact, int density) {
        super(name, height, volumeFact, density);
    }

    @Override
    public double VolumeCalculation() {
        return (float)Math.PI * Math.pow(RADIUS_MIN/2, 2) * height;
    }
}
