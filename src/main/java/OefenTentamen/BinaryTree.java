package OefenTentamen;

/**
 * Created by bobkuipers on 09/03/2018.
 */
public class BinaryTree<T extends Comparable<T>> {
    T value;

    BinaryTree<T> leftNode;
    BinaryTree<T> rightNode;

    public T find(T toSearchValue){
        if(value.compareTo(toSearchValue) == 0) {
            return value;
        } else if(value.compareTo(toSearchValue) > 0){
            if(leftNode == null)
                return null;
            return leftNode.find(toSearchValue);
        } else if(value.compareTo(toSearchValue) < 0){
            if(rightNode == null)
                return null;
            return rightNode.find(toSearchValue);
        } return null;
    }

    public void insertSortedArray(Object[] sortedArray){
        int middleOfArray = sortedArray.length/2;

        value = (T) sortedArray[middleOfArray];

    }

}
