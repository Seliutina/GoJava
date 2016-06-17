package Module05;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
     int[] array1 =  {28, 1031, 597, 472, 120, -50, 21, 865, 198, 67, -250, 624, 12, 452, 3};
        Arrays.sort(array1);
        for(int x : array1) {
            System.out.println(x);
             x++;
        }

        System.out.println("Minimal element of array1 equals " + array1 [0]);
        System.out.println("Maximal element of array1 equals " + array1 [14]);
    }
}
