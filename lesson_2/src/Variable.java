public class Variable {

        static byte a = 12;         //Глобальные переменные
        short b = 256;
        int c = 1659;
        long d = 456;
        float e = 23.34f;
        double f = 567.45;
        char g = 'r';
        String s = "fsdfee";

    public static void main(String[] args) {        //если убрать static станут доступны переменные везде
        byte al = 12;         //Локальные переменные
        short bl = 256;
        int cl = 1659;
        long dl = 456;
        float el = 23.34f;
        double fl = 567.45;
        char gl = 'r';
        String sl = "fsdfee";

        Integer integer = 123;
        Integer integer1 = null;
        Integer integer2 = new Integer(123);


        Cat cat = new Cat();
        Cat cat1 = new Cat("Барс", 55);
        cat.setAge(5);
        cat.setName("Ворс");

        System.out.println(al);
        System.out.println(a);

        System.out.println("Возраст кота: " + cat.getAge());
    }

    public void getR(){

    }

}
