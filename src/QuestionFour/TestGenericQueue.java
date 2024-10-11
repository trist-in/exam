package QuestionFour;

import QuestionThree.GenericQueue;
import QuestionThree.Node;
import org.junit.Assert.*;
import org.junit.Test;

public class TestGenericQueue {
    /*TODO write 3 tests, one for enqueue, one for dequeue, and one for peek.
        Hint: enqueue and dequeue are effectively mutators for the queue and should be tested as such.
     */

    @Test
    public void test_Enqueue_Int_10(){
        E test = 10;
        Node<E> testNode = new Node<>(test);
        E expected = "10";

        E output = testNode.toString();


        assertEquals(expected, output);
    }

    @Test
    public void test_Dequeue_size2(){
        E test1 = 10;
        Node<E> testNode2 = new Node<>(test1);
        E test2 = 20;
        testNode2.enqueue(test2);

        E expected = 10;

        E output = testNode2.dequeue();

        assertEquals(expected, output);
    }

    @Test
    public void test_peek_head_sizeOne_int(){
        E test = 10;
        Node<E> testNode3 = new Node<>(test);

        E expected = "10";

        E output = testNode3.toString();

        assertEquals(expected, output);
    }


}
