package sortingAlgorit;

/**
 * Created by bobkuipers on 21/02/2018.
 */
public class MergeSort {

    public int[] mergeSort(int[] a) {
        int[] tempArray = new int[a.length];

       return mergeSort(a,tempArray,0,a.length - 1);
    }

    private static int[] mergeSort(int[] a, int[] tmpArray, int left, int right) {
        if (left < right){
            int center = (left + right) / 2;
            mergeSort(a,tmpArray,left,center);
            mergeSort(a,tmpArray,center+1,right);
            return merge(a,tmpArray,left,center,right);
        }
        return a;
    }

    private static int[] merge(int[] a, int[] tmpArray, int left, int center, int right) {
        for(int i = left; i <= right; i++){
            tmpArray[i] = a[i];
        }

        int i = left;
        int j = center + 1;
        int k = left;

        while(i <= center && j <= right){
            if(tmpArray[i] < tmpArray[j]){
                a[k] = tmpArray[i];
                i++;
            }
            else {
                a[k] = tmpArray[j];
                j++;
            }
            k++;
        }

        while (i <= center){
            a[k] = tmpArray[i];
            i++;
            k++;
        }
        return a;

    }
}
