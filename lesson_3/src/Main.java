public class Main {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        double c = (double) a / (double) b;


        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(c);
        System.out.println(a % b);
        System.out.println(b == a); //

        System.out.println(1 < a && b < 6);

//        int i = 1;
//        int m = 2 * i++ + 1;
//        System.out.println(m);

        int i = 2;
        int m = 2 * --i;
        System.out.println(m);


        double x = Math.round(1.4); //округление (ceil, floor)
        System.out.println(x);

        Cat cat = new Cat("kj[");
        cat.getName();

        int x1 = 23;

        if (x1 % 2 == 0) {
            System.out.println("Число " + x + " является четным!");
        } else {
            System.out.println("Число " + x + " является нечетным!");
        }

        int x3 = 9;


        switch (x3){
            case 1:
                System.out.println("x = " + 1);
                break;
            case 2:
                System.out.println("x = " + 3);
                break;
            case 3:
                System.out.println("x = " + 4);
                break;
            default:
                System.out.println("такого x = " + x3 + " значения не существует!");




        }


    }
}
