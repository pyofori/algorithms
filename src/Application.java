import sorting.Sorting;

import java.util.Arrays;

public class Application {
    public static void main(String [] args){
        //init unsorted array
        int [] unsorted = {10, 4, 55, 76, 32, 64, 2,5 , 6, 8, 1};
        int [] sorted = Sorting.sort(unsorted);
        System.out.println(Arrays.toString(sorted));
    }
}
