package sorting;

import java.util.Arrays;

public class Sorting {
    public static int[] sort(int[] unsorted){
        //insertion sort basically finds the correct value to place at an index/position, one at a time
        //Starts from the 1st index, and finds the minimum value and inserts it into the 1st
        //The iteration continues till the n-1 index, where n is the size of the array.
        // n-1 because by the time it gets to the nth index, the right value has been inserted already
        for (int i = 0; i < unsorted.length -1; i ++){
            int least = unsorted[i];
            // we need 2 loops to keep track of the sorted and unsorted portions
            //The second loop sorted the unsorted portion
            // I indicates the 1st index of the unsorted sub array
            for (int k = i; k < unsorted.length; k++ ){
                if (unsorted[k] < least){
                    unsorted[i] = unsorted[k];
                    unsorted[k] = least;
                    least = unsorted[i];
                }
            }
        }
        return unsorted;
    }
}
