import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderrrr {
    public static void main(String[] args) {
        try {
            InputStreamReader isReader = new InputStreamReader(System.in);
            BufferedReader bReader = new BufferedReader(isReader);
            System.out.println("Enter anything...");
            String data = bReader.readLine();
            System.out.println("You entered...." + data);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
