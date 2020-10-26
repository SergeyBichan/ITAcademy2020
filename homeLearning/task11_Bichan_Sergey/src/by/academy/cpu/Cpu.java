package by.academy.cpu;

import java.util.Objects;

public class Cpu {
    private String name;
    private double frequency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cpu)) return false;
        Cpu cpu = (Cpu) o;
        return Double.compare(cpu.getFrequency(), getFrequency()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFrequency());
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency + 100;
    }

    public Cpu() { }

    public Cpu(String name, double frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "\nCpu{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
