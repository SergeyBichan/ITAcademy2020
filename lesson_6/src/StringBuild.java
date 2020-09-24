public class StringBuild {
    private static final String SPACE = " ";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(SPACE).append("World").append("!");

        String result = String.valueOf(sb);
        System.out.println(result);
    }
}
