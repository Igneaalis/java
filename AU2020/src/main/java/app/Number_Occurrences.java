package app;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.LongStream;

public class Number_Occurrences {
    /**
     * @param arr          array to intersect
     * @param intersection number to get an intersection with array
     * @return array without intersection number
     */
    public static long[] check_occurrences(long[] arr, long intersection) {
        return LongStream.of(arr)
                .filter(i -> i != intersection)
                .toArray();
    }

    /**
     * Example of intersection of a number from [0; 9] interval with long[30] array which contains numbers from [0; 29] interval
     */
    public static void main() {
        var rand = new Random();
        var testCase = rand.longs(30, 0, 10).toArray();
        var intersection = rand.nextInt(10);
        System.out.println(Arrays.toString(testCase) + " intersects with number: " + intersection);
        var result = check_occurrences(testCase, intersection);
        System.out.println(Arrays.toString(result));
    }
}
