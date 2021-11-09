package exercises;

import java.util.Arrays;

/***
 * Smallest int that doesn't appear on array
 */
public class SmallestInt {

    public int solution(int [] arr) {
        int smallestInt = 1;
        int arrayLength = arr.length;
        if (arrayLength == 0) {
            return smallestInt;
        }

        Arrays.sort(arr);

        if (arr[0] > 1) {
            return smallestInt;
        }
        if (arr[arrayLength-1] <= 0) {
            return smallestInt;
        }

        for (int j : arr) {
            if (j == smallestInt) {
                smallestInt++;
            }
        }
        return smallestInt;
    }
}
