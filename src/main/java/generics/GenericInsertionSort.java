package generics;
/**
 * Created by bobkuipers on 22/02/2018.
 */
public class GenericInsertionSort<T extends Comparable<T>>  {

    public void genericInsertionSort(T[] list){
        for(int i = 0; i < list.length;i++){
            T toBeInserted = list[i];

            int j = i;

            while(j > 0 && toBeInserted.compareTo(list[j - 1]) < 1){
                list[j] = list[j-1];
                j--;
            }
            list[j] = toBeInserted;
        }
    }
}
