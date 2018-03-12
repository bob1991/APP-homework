package DataStructures;

/**
 * Created by bobkuipers on 26/02/2018.
 */
public class HANQue<T> {
    private T[] que = (T[]) new Object[10];
    private int elementToReturn = 0;

    private int iterator = 0;

    public void enQueue(T element){
        if(iterator == que.length - 1) iterator = 0;
        if(iterator == elementToReturn - 1) return;
        que[iterator] = element;
        iterator++;
    }

    public T deQueue(){
        if(elementToReturn == que.length-1){
            elementToReturn = 0;
        }
        T element = que[elementToReturn];
        que[elementToReturn] = null;
        elementToReturn++;
        return element;
    }

    public T getFront(){
        return que[elementToReturn];
    }

    public int getIterator() {
        return iterator;
    }

}
