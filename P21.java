import java.io.*;
import java.util.*;

public class P21 {
    public static void main(String[] args) throws IOException {
        File f = new File("./123.txt");
        System.out.println(f.exists()); // checking is file exists or not

        if (!f.exists()) {
            System.out.println("creating new file...");
            f.createNewFile();
        }
        System.out.println("file already exitst");
        System.out.println("appending new data to file");
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter b = new BufferedWriter(fw);
        Random rand = new Random(1000);
        b.write("\n");
        for (int i = 0; i < 150; i++) {
            int p = rand.nextInt(100);
            System.out.print(p + " ");
            b.write(String.valueOf(p));
            b.write(" ");
            System.out.print(" ");
        }

        b.close(); // writing to disk

    }
}