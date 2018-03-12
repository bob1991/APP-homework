package generics;

/**
 * Created by bobkuipers on 25/02/2018.
 */
public class GenericMergeSort<T extends Comparable<T>> {

    public void genericMergeSort(T[] unsorted) {
        T[] tempArray = (T[]) new Comparable[unsorted.length];
        genericMergeSort(unsorted, (T[]) tempArray,0,unsorted.length - 1);

    }

    private void genericMergeSort(T[] unsorted, T[] tempArray, int left, int right) {
        if(left < right){
            int center = (left + right) /2;
            genericMergeSort(unsorted,tempArray,left,center);
            genericMergeSort(unsorted,tempArray,center+1,right);
            merge(unsorted,tempArray,left,center,right);
        }
    }

    private void merge(T[] unsorted, T[] tempArray, int left, int center, int right) {
        for(int i = left; i <= right;i++){
            tempArray[i] = unsorted[i];
        }

        int i = left;
        int j= center + 1;
        int k = left;

        while(i <= center && j <= right){
            if(tempArray[i].compareTo(tempArray[j]) < 0){
                unsorted[k] = tempArray[i];
                i++;
            }else {
                unsorted[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while (i <= center){
            unsorted[k] = tempArray[i];
            i++;
            k++;
        }

    }
}
