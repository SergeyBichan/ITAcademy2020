import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args){
        String text = "Hello World!";
        try(FileOutputStream fos = new FileOutputStream("D:\\ITAcademy2020\\notes.txt"))
        {
            //перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer,0,buffer.length);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}
