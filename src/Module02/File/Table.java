package Module02.File;

import java.util.*;

public class Table {

    public static void main(String[] args) {
        List<File> Files = new ArrayList<>();
        Files.add(new Textfile("Text", "Some text", 35));
        Files.add(new Audiofile("Audio", "Some lectures", 15));
        Files.add(new Imagefile("Image", "Some photos", 123));


        for (File f : Files) {
            System.out.println(f.getName() + " | " + f.getInstance() + " | " + f.getQuantity());
        }


    }
}
