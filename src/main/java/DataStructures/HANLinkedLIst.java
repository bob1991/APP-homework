package DataStructures;

/**
 * Created by bobkuipers on 26/02/2018.
 */
public class HANLinkedLIst<T> {
    private Node<T> header = null;
    private int length = 0;

    public void addFirst(T value){
        header = new Node<T>(value,header);
        length++;
    }

    public T removeFirst(){
        if(header == null){
            throw new IndexOutOfBoundsException();
        }

        T removed = header.element;
        header = header.next;
        length--;
        return removed;
    }

    public void insert(int index, T value){
        if(index == 0){
            addFirst(value);
            return;
        }
        if(index > length || index < 0){
            throw new  IndexOutOfBoundsException();
        }

        int i = 0;
        Node element = header;
        while (i != index-1){
            element = element.next;
            i++;
        }
        element.next = new Node(value,element.next);
        length++;
    }

    public void delete(int index){
        if(index >= length || index < 0){
            throw new IndexOutOfBoundsException();
        }

        if(index == 0){
            removeFirst();
        }

        int i = 0;
        Node element = header;
        while (i != index-1){
            element = element.next;
            i++;
        }
        if(element.next == null) {
            throw new IndexOutOfBoundsException();
        }
        element.next = element.next.next;
        length--;
    }

    public T get(int index){
        int i = 0;
        Node<T> element = header;
        while (i != index){
            if(element.next == null){
                throw new IndexOutOfBoundsException();
            }
            element = element.next;
            i++;
        }
        return element.element;
    }

    public int getSize() {
        return length;
    }
}
