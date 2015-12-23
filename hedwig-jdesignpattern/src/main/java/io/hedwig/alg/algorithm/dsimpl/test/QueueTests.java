package io.hedwig.alg.algorithm.dsimpl.test;

import com.hedwig.algorithm.dsimpl.Queue;
import com.hedwig.algorithm.dsimpl.test.common.JavaCollectionTest;
import com.hedwig.algorithm.dsimpl.test.common.QueueTest;
import com.hedwig.algorithm.dsimpl.test.common.Utils;
import com.hedwig.algorithm.dsimpl.test.common.Utils.Type;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;


public class QueueTests {

    @Test
    public void testArrayQueue() {
        Utils.TestData data = Utils.generateTestData(100);

        String aName = "Queue [array]";
        Queue.ArrayQueue<Integer> aQueue = new Queue.ArrayQueue<Integer>();
        Collection<Integer> aCollection = aQueue.toCollection();

        assertTrue(QueueTest.testQueue(aQueue, aName,
                data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(aCollection, Type.Integer, aName,
                data.unsorted, data.sorted, data.invalid));
    }

    @Test
    public void testLinkedQueue() {
        Utils.TestData data = Utils.generateTestData(100);

        String lName = "Queue [linked]";
        Queue.LinkedQueue<Integer> lQueue = new Queue.LinkedQueue<Integer>();
        Collection<Integer> lCollection = lQueue.toCollection();

        assertTrue(QueueTest.testQueue(lQueue, lName,
                                       data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(lCollection, Type.Integer, lName,
                                                     data.unsorted, data.sorted, data.invalid));
    }
}
