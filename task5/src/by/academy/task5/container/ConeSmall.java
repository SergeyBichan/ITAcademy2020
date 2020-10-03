package by.academy.task5.container;

import static by.academy.task5.constant.Constant.RADIUS_MAX;
import static by.academy.task5.constant.Constant.RADIUS_MIN;

public class ConeSmall extends Container {
    public ConeSmall(int height, String name, double volumeFact, int density) {
        super(height, name, volumeFact, density);
    }

    @Override
    public double VolumeCalculation() {
        return ((double)(height / 3) * Math.PI * Math.pow(RADIUS_MIN/2, 2));

    }
}
