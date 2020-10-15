import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("D:\\ITAcademy2020\\notes.txt"))
        {
            System.out.printf("File size: %d bytes \n", fin.available());
            int i = -1;
            while((i =fin.read())!=-1)

            {
                System.err.println((char) i);
            }
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
