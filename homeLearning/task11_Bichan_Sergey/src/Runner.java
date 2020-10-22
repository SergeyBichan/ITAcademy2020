import cpu.Cpu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        Cpu cpu1 = new Cpu("Ryzen 5 5600X", 4.6);
        Cpu cpu2 = new Cpu("Ryzen 7 5800X", 4.7);
        Cpu cpu3 = new Cpu("Ryzen 9 5900X", 4.7);
        Cpu cpu4 = new Cpu("Ryzen 9 5950X", 4.9);
        Cpu cpu5 = new Cpu("Intel Core i9-10900F", 5.1);
        Cpu cpu6 = new Cpu("Intel Core i7-10700K", 5.1);
        Cpu cpu7 = new Cpu("Intel Core i7-10700KF", 5.1);
        Cpu cpu8 = new Cpu("Intel Core i7-10700", 4.8);
        Cpu cpu9 = new Cpu("Intel Core i5-10600K", 4.5);
        Cpu cpu10 = new Cpu("Intel Core i3-10300", 4.4);

        ArrayList<Cpu> col = new ArrayList<>();
        col.add(cpu1);
        col.add(cpu2);
        col.add(cpu3);
        col.add(cpu4);
        col.add(cpu5);
        col.add(cpu6);
        col.add(cpu7);
        col.add(cpu8);
        col.add(cpu9);
        col.add(cpu10);

        Collection<Cpu> streamFromCol = col.stream().filter(c -> c.getFrequency() >= 4.8).collect(Collectors.toList());
        System.out.println("Cool CPU's are: " + streamFromCol);

        Collection<Cpu> collectionWithSkip = col.stream().skip(2).collect(Collectors.toList());
        System.out.println(collectionWithSkip);

        Collection<Cpu> collectionWithDistinct = col.stream().distinct().collect(Collectors.toList());
        System.out.println(collectionWithDistinct);

        Collection<String> collectionWithMap = col.stream()
                .map((s) -> "\n" + s.getName() + "_1 " +
                        s.getFrequency() + "_1")
                .collect(Collectors.toList());
        System.out.println(collectionWithMap);




    }


}
