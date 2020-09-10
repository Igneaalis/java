package app;

/**
 * Implements Bubble sort algorithm.
 */
public class Bubble_Sort {
    /**
     * @param arr array of integers to be sorted via bubble sort algorithm.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // swap arr[j] and arr[j+1]
                    var temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * @param arr array of integers to be printed in sysout.
     */
    public static void printArray(int[] arr)
    {
        for (var i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Example of using bubble sort algorithm.
     */
    public static void main() {
        int[] testCase = {64, 34, 25, 12, 22, 11, 90};
        Bubble_Sort.printArray(testCase);
        Bubble_Sort.bubbleSort(testCase);
        Bubble_Sort.printArray(testCase);
    }
}
