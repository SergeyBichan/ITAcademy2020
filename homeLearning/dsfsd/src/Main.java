import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //Map<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(0,"Milk");
//        hashMap.put(1,"Milk");
//        hashMap.put(2,"Milk");
//        hashMap.put(3,"Milk");
//        hashMap.put(4,"Milk");
//        hashMap.put(5,"Milk");
//        hashMap.put(6,"Milk");
//        hashMap.put(7,"Milk");
//        System.out.println(hashMap.toString());


//        System.out.println(hashMap);
//
//        PrintWriter writer = new PrintWriter("note.txt", "UTF-8");
//        writer.println(hashMap);
//        //writer.println("The second line");
//        writer.close();

        /*** Change the path ***/
        String outputFilePath = "note.txt";
        //create new HashMap
        HashMap<Integer, String> hMapNumbers = new HashMap<Integer, String>();
        //key-value pairs
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            hMapNumbers.put(in.nextInt(), in.nextLine());
        }
        //new file object
        File file = new File(outputFilePath);
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(file))) {
            //create new BufferedWriter for the output file

            //iterate map entries
            for (Map.Entry<Integer, String> entry : hMapNumbers.entrySet()) {

                //put key and value separated by a colon
                bf.append(entry.getKey() + ":" + entry.getValue());
                //new line
                bf.newLine();
            }

            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //always close the writer
    }


}

