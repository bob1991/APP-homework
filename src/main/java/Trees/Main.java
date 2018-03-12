package Trees;

/**
 * Created by bobkuipers on 09/03/2018.
 */
public class Main {

    public static void main(String[] args){
        BinaryTree<Integer> searchTree = new BinaryTree<Integer>();
        searchTree.value = 5;

        searchTree.leftNode = new BinaryTree<Integer>();
        searchTree.leftNode.value = 3;
        searchTree.rightNode = new BinaryTree<Integer>();
        searchTree.rightNode.value = 7;


        searchTree.leftNode.leftNode = new BinaryTree<Integer>();
        searchTree.leftNode.leftNode.value = 1;
        searchTree.leftNode.rightNode = new BinaryTree<Integer>();
        searchTree.leftNode.rightNode.value = 2;

        searchTree.rightNode.rightNode = new BinaryTree<Integer>();
        searchTree.rightNode.rightNode.value = 11;
        searchTree.rightNode.leftNode = new BinaryTree<Integer>();
        searchTree.rightNode.leftNode.value = 9;

        searchTree.rightNode.rightNode.rightNode = new BinaryTree<Integer>();
        searchTree.rightNode.rightNode.rightNode.value = 15;
        searchTree.rightNode.rightNode.leftNode = new BinaryTree<Integer>();
        searchTree.rightNode.rightNode.leftNode.value = 12;

        System.out.print(searchTree.find(15));

    }
}
