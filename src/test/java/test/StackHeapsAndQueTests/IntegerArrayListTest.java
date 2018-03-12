package test.StackHeapsAndQueTests;

import DataStructures.IntegerArrayList;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by bobkuipers on 26/02/2018.
 */
public class IntegerArrayListTest {
    IntegerArrayList sut = new IntegerArrayList();


    @Test
    public void testAdd(){
        sut.add(12);

        assertEquals(sut.get(0),12);
    }

    @Test
    public void testForduplicationOfArray(){

        for(int i = 0; i < 800;i++){
            sut.add(i);
        }
        assertEquals(sut.get(30), 30);

    }

    @Test
    public void testForSet(){
        sut.add(1);
        sut.add(2);
        sut.add(3);

        sut.set(5,1);

        assertEquals(sut.get(1),5);
    }

    @Test
    public void testForSetWithDoublingOfArray(){
        sut.add(1);
        sut.add(2);
        sut.add(3);
        sut.add(1);
        sut.add(2);
        sut.add(3);
        sut.add(1);
        sut.add(2);
        sut.add(3);


        sut.set(5,11);

        assertEquals(sut.get(11),5);
    }
}
