package by.academy;

import by.academy.cpu.Cpu;

import java.util.*;
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

        List<Cpu> streamFromCol = col.stream().filter(c ->
                c.getFrequency() >= 4.8).collect(Collectors.toList());
        System.out.println("Cool CPU's are: " + streamFromCol);

        List<Cpu> collectionWithSkip = col.stream()
                .skip(2).collect(Collectors.toList());
        System.out.println(collectionWithSkip);

        List<Cpu> collectionWithDistinct = col.stream().distinct()
                .collect(Collectors.toList());
        System.out.println(collectionWithDistinct);


        List<String> collectionWithMap = col.stream()
                .map((s) -> "\n" + s.getName() + "_1 " +
                        s.getFrequency() + "_1")
                .collect(Collectors.toList());
        System.out.println(collectionWithMap);


        List<Cpu> collectionWithPeek = col.stream()
                .peek((p) -> System.out.print
                        ("\n" + (1 + p.getFrequency()) + " = " + p.getName() + "dfk "))
                .collect(Collectors.toList());


        List<Cpu> collectionWithLimit =
                col.stream().limit(2).collect(Collectors.toList());
        System.out.println(collectionWithLimit);

        List<Cpu> collectionWithSorted = col.stream()
                .sorted(Comparator.comparing(Cpu::getFrequency))
                .collect(Collectors.toList());
        System.out.println(collectionWithSorted);


        Optional<Cpu> collectionWithFindFirst = streamFromCol.stream().findFirst();
        System.out.println(collectionWithFindFirst);

        List<Cpu> findFirstCpu = Collections.singletonList (col.stream ().findFirst ().orElse (cpu1));
        System.out.println (findFirstCpu + "\n\n");

        List<Cpu> findAnyCpu = Collections.singletonList(col.stream().findAny().orElse(cpu3));
        System.out.println(findAnyCpu + "\n\n");



















    }


}
