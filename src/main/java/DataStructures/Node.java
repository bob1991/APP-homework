package DataStructures;

/**
 * Created by bobkuipers on 26/02/2018.
 */
public class Node<T> {
    protected T element;
    protected Node next;

    public Node(T element, Node next) {
        this.element = element;
        this.next = next;
    }

    public boolean hasNext(){
        if(next != null){
            return false;
        }
        return true;
    }

    public int length(){
        int i = 0;
        Node element = this;
        while (element.hasNext()){
            i++;
            element = next;
        }
        return i;
    }



}
