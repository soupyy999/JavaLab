import java.io.*;

public class FileExample {

    public static void main(String[] args) {

        try {
        
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello this is file handling");
            fw.close();

        
            FileReader fr = new FileReader("test.txt");
            int i;
            while((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
            fr.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}