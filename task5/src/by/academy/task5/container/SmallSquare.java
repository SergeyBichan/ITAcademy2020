package by.academy.task5.container;

import static by.academy.task5.constant.Constant.RADIUS_MIN;

public class SmallSquare extends Container {


    public SmallSquare(String name, int height, double volumeFact, int density) {
        super(name, height, volumeFact, density);
    }

    @Override
    public double VolumeCalculation() {
        double a = RADIUS_MIN/(Math.sqrt(2));

        return (Math.pow(a,2)) * height;
    }
}
