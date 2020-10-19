import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Integer> cl = new ArrayList<>();
        Collection<String> coll = new ArrayList<>();
        //coll.stream();
        cl.add(1);
        cl.add(2);
        cl.add(14);
        cl.add(13);
        cl.add(3);
        cl.add(4);
        cl.add(5);
//        Stream<Integer> integerStream = cl.stream().filter(n-> n % 2 == 0);
//        List<Integer> i = integerStream.collect(Collectors.toList());
//        List<Integer> in = integerStream.collect(Collectors.toList());               Закрывать можно только один раз!

        List<Integer> i = cl.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(i.toString());

    }

}
