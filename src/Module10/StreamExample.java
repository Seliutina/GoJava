package Module10;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamExample {

    public static void main(String[] args)  throws IOException {

    FileInputStream in = null;
    FileOutputStream out = null;

        try {
        in = new FileInputStream("D:\\GoJavaOnline\\Character.txt");
        out = new FileOutputStream("Character1.txt");
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null){
                out.close();
            }
    }
}
}

