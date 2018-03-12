package DataStructures;

/**
 * Created by bobkuipers on 08/03/2018.
 */
public class HANArrayList<T> {
    T[] list = (T[]) new Object[10];
    int iterator = 0;

    public void add(T elementToAdd){
        if(list.length-1 == iterator){
            Object[] temp = list;
            list = (T[]) new Object[list.length*2];
            for(int i = 0; i < temp.length;i++){
                list[i] = (T) temp[i];
            }
        }
        list[iterator] = elementToAdd;
        iterator++;
    }

    public T get(int index){
        return list[index];
    }

    public void set(T elementToAdd, int index){
        T temp[] = list;
        if(list.length -1 == iterator || list.length - 1 < index){
            list = (T[]) new Object[list.length*2];
            for(int j = 0; j < temp.length;j++){
                list[j] = temp[j];
            }
        }
        for(int i = index-1;i < iterator;i++){
            list[i+ 1] = temp[i];
        }
        list[index] = elementToAdd;
    }

}
