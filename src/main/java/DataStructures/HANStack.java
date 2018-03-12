package DataStructures;

/**
 * Created by bobkuipers on 08/03/2018.
 */
public class HANStack<T> {
    private HANLinkedLIst<T> stack = new HANLinkedLIst<T>();

    public T pop(){
        return stack.removeFirst();
    }

    public T top(){
        return stack.get(0);
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public int getSize(){
        return stack.getSize();
    }
}
