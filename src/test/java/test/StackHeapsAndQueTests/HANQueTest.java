package test.StackHeapsAndQueTests;

import DataStructures.HANQue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bobkuipers on 26/02/2018.
 */
public class HANQueTest {
    private HANQue<Integer> sut = new HANQue<Integer>();

    @Test
    public void addingTest(){
        sut.enQueue(new Integer(5));
        int test = sut.deQueue();
        assertEquals(test,5);
    }

    @Test
    public void restartingFromFront(){
        for(int i = 0; i < 10; i++){
            sut.enQueue(new Integer(5));
        }

        for(int i = 0; i < 5; i++){
            sut.deQueue();
        }

        for(int i = 0; i < 3; i++){
            sut.enQueue(new Integer(2));
        }

        assertEquals(4,sut.getIterator());
    }


    @Test
    public void getThridItem(){
        for(int i = 0; i < 10; i++){
            sut.enQueue(new Integer(5));
        }

        for (int i = 0; i < 5; i++){
            sut.deQueue();
        }

        sut.enQueue(new Integer(3));

        int result = sut.deQueue();

        assertEquals(result,5);
    }

}
