package by.academy.task5.container;


public abstract class Container implements containerInterface {

    int height;
    String name;
    int volumeFact;
    int density;



    @Override
    public String toString() {
        return "Container{" +
                "name='" + name +
                ", height=" + height +
                ", density=" + density +
                ", volumeFact=" + volumeFact +
                ", mass="
                + MassCalculation() +
                '}'  +  "\n";
    }


    public Container(String name, int height, double volumeFact, int density) {
        if (height <= 100 && height >= 10) {
            this.volumeFact = (int) volumeFact;
            this.height = height;
            this.name = name;
            this.density = density;
        } else {
            System.out.println("Не корректный ввод");
        }
    }

    @Override
    public double MassCalculation() {
        return VolumeFact() * density;
    }

    private double VolumeFact() {
        return VolumeCalculation() /100 * volumeFact;
    }
}
