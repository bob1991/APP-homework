package test.sortingAlgoritTest;

import org.junit.Test;
import sortingAlgorit.Insertionsort;
import sortingAlgorit.MergeSort;
import sortingAlgorit.Quicksort;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by bobkuipers on 21/02/2018.
 */
public class SortingTest {
    MergeSort mergeSort = new MergeSort();
    Insertionsort insertionSort = new Insertionsort();
    Quicksort quicksort = new Quicksort();

    int[] unsortedArray = {6, 5, 3, 4, 1, 9, 2, 7};

    int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 9};


    @Test
    public void insertionSortTest(){
        insertionSort.insertionSort(unsortedArray);

        assertArrayEquals(sortedArray,unsortedArray);
    }

    @Test
    public void mergeSortTest(){
        mergeSort.mergeSort(unsortedArray);

        assertArrayEquals(sortedArray,unsortedArray);
    }

    @Test
    public void quickSortTest(){
        quicksort.sort(unsortedArray);

        assertArrayEquals(sortedArray,unsortedArray);
    }
}
