public class First {
    private static int a = 4;

    public static int getB() {
        return Second.b;
    }

    public static class Second {
        private static int b = 5;
        protected static int getA() {
            return First.a;
        }

        public static void setA(int a) {
            First.a = a;
        }
    }
}
