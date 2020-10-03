package by.academy.task5.container;


public abstract class Container implements containerInterface {
    int height;
    String name;
    int volumeFact;
    int density;

    @Override
    public String toString() {
        return "Container{" +
                "height=" + height +
                ", name='" + name + '\'' +
                ", density=" + density +
                ", volumeFact=" + volumeFact +
                '}';
    }


    public Container(int height, String name, double volumeFact, int density) {
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
        return VolumeFact(volumeFact) * density;
    }

    private double VolumeFact(int volumeFact) {
        return VolumeCalculation() * volumeFact / 100;
    }
}
