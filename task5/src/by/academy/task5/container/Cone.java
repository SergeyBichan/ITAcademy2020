package by.academy.task5.container;

import static by.academy.task5.constant.Constant.DENSITY_1000;

public class Cone extends Container {



    public Cone(int height, int width, String name, int diagonal) {
        super(height, width, name, diagonal);
    }

    @Override
    public double VolumeCalculation() {
        return (height/3) * Math.PI * Math.pow(diagonal,2);

    }





    }

