public class StringLesson {
    public static void main(String[] args) {
        String s5 = "      12,22";
        char x = "Hello World".charAt(4);
        System.out.println(x);




        String s = "abe";
        //String s1= s.substring(5,6);
        String s2= "abd";
        String s10 = new String("Bill");
        s10.intern(); //из кучи в пулл(?!?!?)

        byte[] bytes = s.getBytes();
        System.out.println(s.compareTo(s2));

        System.out.println(s.getBytes());

        for (int i = 0; i < bytes.length ; i++) {
            System.out.println("array " + bytes[i]);
        }

//        System.out.println(s5.endsWith("ld"));
//        System.out.println(s5.replace("1", "155"));  //replaceAll()

        System.out.println(s5.trim());


    }
}
