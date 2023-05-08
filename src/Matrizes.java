import java.security.SecureRandom;
import java.util.*;
// import java.util.Arrays;
// import java.util.ArrayList;


public class Matrizes {
    public static void main(String[] args) {
        
        final int LINES = 3;
        final int COLUMN = 5;
        int numbers [][] = new int[LINES][COLUMN];
        int othersNumbers [][] = {{2,3,4,55,2},{60,34,23,11,44},{10,29,38,48,41}};

        for(int indiceLine = 0; indiceLine < LINES; indiceLine++){
            for(int indiceColumn = 0; indiceColumn < COLUMN; indiceColumn++){
                numbers[indiceLine][indiceColumn] = new SecureRandom().nextInt(100);
            }
        }

        // for(int indiceLine = 0; indiceLine < LINES; indiceLine++){
        //     for(int indiceColumn = 0; indiceColumn < COLUMN; indiceColumn++){
        //         System.out.printf("%2d | ",numbers[indiceLine][indiceColumn]);
        //     }
        //     System.out.printf("%n");
        // }

        for(int show [] : numbers){
            System.out.printf("%s", Arrays.toString(show)); 
            System.out.printf("%n");
        }

        // print 2d
        System.out.printf("%n%s\n\n",Arrays.deepToString(othersNumbers));

        for(int showOther [] : othersNumbers){
            for(int test:showOther){
            System.out.printf("%02d | ", test);
        }
        System.out.printf( "%n");
        }
    }
    
}
