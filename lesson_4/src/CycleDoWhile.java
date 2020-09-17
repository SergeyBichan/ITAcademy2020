public class CycleDoWhile {
    public static void main(String[] args) {
        int s = 50;
        int i = 0;
        do {
            s = s - 4;
            i++;

        }
        while (i < 4 && i > 0);
        System.out.println("s = " + s + " i = " + i);


    }
}

