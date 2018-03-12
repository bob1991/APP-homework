package sortingAlgorit;

/**
 * Created by bobkuipers on 23/02/2018.
 */
public class Insertionsort {

    public  int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int toBeInserted = a[i];

            int j = i;
            while (j > 0 && toBeInserted < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }

            a[j] = toBeInserted;
        }
        return a;
    }
}
