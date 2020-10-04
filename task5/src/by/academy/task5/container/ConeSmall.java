package by.academy.task5.container;


import static by.academy.task5.constant.Constant.RADIUS_MIN;

public class ConeSmall extends Container {


    public ConeSmall(String name, int height, double volumeFact, int density) {
        super(name, height, volumeFact, density);
    }

    @Override
    public double VolumeCalculation() {
        return ((height / 3) * Math.PI * Math.pow(RADIUS_MIN/2, 2));

    }
}
