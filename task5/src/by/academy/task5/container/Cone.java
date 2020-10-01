package by.academy.task5.container;

import static by.academy.task5.constant.Constant.RADIUS_MAX;

public class Cone extends Container {


    public Cone(int height, String name, int diagonal) {
        super(height, name, diagonal);
    }

    @Override
    public double VolumeCalculation() {
        return (height / 3) * Math.PI * Math.pow(RADIUS_MAX, 2);

    }


}

