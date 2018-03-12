package generics;

/**
 * Created by bobkuipers on 25/02/2018.
 */
public class GenericQuickSort<T extends Comparable<T>> {

    public void sort(T[] unsortedList){
        quicksort(unsortedList,0,unsortedList.length - 1);
    }

    private void quicksort(T[] unsortedList, int low, int high) {
        int i = low, j = high;
        T pivot = unsortedList[low + (high - low) / 2];

        while(i <= j) {
            while (unsortedList[i].compareTo(pivot) < 0){
                i++;
            }
            while (unsortedList[j].compareTo(pivot) > 0){
                j--;
            }

            if(i <= j) {
                exchange(i, j, unsortedList);
                i++;
                j--;
            }
        }

        if(low < j){
            quicksort(unsortedList,low, j);
        }
        if(i < high){
            quicksort(unsortedList,i,high);
        }
    }

    private void exchange(int i, int j, T[] unsortedList) {
        T temp = unsortedList[i];
        unsortedList[i] = unsortedList[j];
        unsortedList[j] = temp;
    }

}
