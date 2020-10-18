import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter(new FileWriter("note.txt", true));
        writer.append(' ');
        String data;
        data = in.nextLine();
        writer.append(data);
        writer.close();
    }
}
