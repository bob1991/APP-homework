package DataStructures;


/**
 * Created by bobkuipers on 26/02/2018.
 */
public class IntegerArrayList {
    Integer[] list = new Integer[10];
    int iterator = 0;

    public void add(int elementToAdd){
        if(list.length-1 == iterator){
            Integer[] temp = list;
            list = new Integer[list.length*2];
            for(int i = 0; i < temp.length;i++){
                list[i] = temp[i];
            }
        }
        list[iterator] = elementToAdd;
        iterator++;
    }

    public int get(int index){
        return list[index];
    }

    public void set(int elementToAdd, int index){
        Integer temp[] = list;
        if(list.length -1 == iterator || list.length - 1 < index){
            list = new Integer[list.length*2];
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
