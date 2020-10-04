package by.academy.task5.container;

import static by.academy.task5.constant.Constant.RADIUS_MAX;

public class Square extends Container {

    public Square(String name, int height, double volumeFact, int density) {
        super(name, height, volumeFact, density);
    }

    @Override
    public double VolumeCalculation() {
         double a = RADIUS_MAX/(Math.sqrt(2));

        return (Math.pow(a,2)) * height;
    }
}
