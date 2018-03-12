package test.StackHeapsAndQueTests;

import DataStructures.HANLinkedLIst;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by bobkuipers on 26/02/2018.
 */
public class LinkedListTest {
    HANLinkedLIst<Integer> sut = new HANLinkedLIst<Integer>();

    @Test
    public void addFirstTest(){
        sut.addFirst(1);

        int result = sut.get(0);

        assertEquals(result,1);
    }

    @Test
    public void removeFirstTest(){
        sut.addFirst(1);
        sut.removeFirst();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeFirstTestArrayOutOfBound(){
        sut.removeFirst();
    }

    @Test
    public void insertTest(){
        for(int i = 0; i < 5; i++) {
            sut.addFirst(5);
        }

        sut.insert(2,15);

        int realValue = sut.get(2);

        assertEquals(realValue,15);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void insertBelowZero(){
        sut.insert(-5,15);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void aboveArrayLengthTest(){
        sut.insert(15,15);
    }

    @Test
    public void deleteTest(){
        for(int i = 0; i < 5; i++) {
            sut.addFirst(5);
        }
        //insert at index 3
        sut.insert(3,15);
        //delete index 2 so that value at 3 comes to index 2
        sut.delete(2);
        //get index 2
        int result = sut.get(2);
        assertEquals(result,15);
    }
}
