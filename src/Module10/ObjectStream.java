package Module10;

import Module09.CaesarCodeRunner;
import java.io.*;


public class ObjectStream {
    public static void main(String[] args) throws IOException {
        CaesarCodeRunner CCR = new CaesarCodeRunner();

       FileOutputStream fout = new FileOutputStream("Caesar.txt");
        try {
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(CCR);
            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fout.close();
        }
    }
}
