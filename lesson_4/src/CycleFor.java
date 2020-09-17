public class CycleFor {
    public static void main(String[] args) {
        int n = 10;
        int k = 1;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0) {
                System.out.println(k + ":" + i);
                k++;
            }

        }
    }
}
