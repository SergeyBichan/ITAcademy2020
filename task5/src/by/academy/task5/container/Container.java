package by.academy.task5.container;


public abstract class Container implements containerInterface {
    int height;
    String name;
    int diagonal;

    @Override
    public String toString() {
        return "Container{" +
                "height=" + height +
               ", name='" + name + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }


    public Container(int height, String name, int diagonal) {
        if (height <= 100 && height >= 10) {
            this.height = height;
            this.name = name;
            this.diagonal = diagonal;
        } else {
            System.out.println("Не корректный ввод");
        }
    }

    @Override
    public double MassCalculation(int density) {
        return VolumeCalculation() * density;
    }
}
