package by.academy.task5.container;

import static by.academy.task5.constant.Constant.RADIUS_MAX;

public class Cone extends Container {


    public Cone(String name,int height, int volumeFact, int density) {
        super(name, height, volumeFact, density);
    }

    @Override
    public double VolumeCalculation() {
        return (height / 3) * Math.PI * Math.pow(RADIUS_MAX/2, 2);

    }



}

