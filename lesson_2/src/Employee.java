public class Employee {
    private static double salary;

    static final String DEPARTMENT = "Разработка ";

    public static void main(String[] args) {
        salary = 1000;
        System.out.println(DEPARTMENT + "средняя зарплата: " + salary);
    }
}
