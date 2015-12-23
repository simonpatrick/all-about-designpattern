package io.hedwig.alg.algorithm.dsimpl.test;

import com.hedwig.algorithm.dsimpl.BinaryHeap;
import com.hedwig.algorithm.dsimpl.test.common.HeapTest;
import com.hedwig.algorithm.dsimpl.test.common.JavaCollectionTest;
import com.hedwig.algorithm.dsimpl.test.common.Utils;
import com.hedwig.algorithm.dsimpl.test.common.Utils.Type;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class BinaryHeapTests {

    @Test
    public void testMinHeap() {
        Utils.TestData data = Utils.generateTestData(100);

        String aNameMin = "Min-Heap [array]";
        BinaryHeap.BinaryHeapArray<Integer> aHeapMin = new BinaryHeap.BinaryHeapArray<Integer>(BinaryHeap.Type.MIN);
        Collection<Integer> aCollectionMin = aHeapMin.toCollection();
        assertTrue(HeapTest.testHeap(BinaryHeap.Type.MIN, aHeapMin, Type.Integer, aNameMin,
                data.unsorted, data.sorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(aCollectionMin, Utils.Type.Integer, aNameMin,
                data.unsorted, data.sorted, data.invalid));

        String tNameMin = "Min-Heap [tree]";
        BinaryHeap.BinaryHeapTree<Integer> tHeapMin = new BinaryHeap.BinaryHeapTree<Integer>(BinaryHeap.Type.MIN);
        Collection<Integer> tCollectionMin = tHeapMin.toCollection();
        assertTrue(HeapTest.testHeap(BinaryHeap.Type.MIN, tHeapMin, Utils.Type.Integer, tNameMin,
                                     data.unsorted, data.sorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(tCollectionMin, Type.Integer, tNameMin,
                                                     data.unsorted, data.sorted, data.invalid));
    }

    @Test
    public void testMaxHeap() {
        Utils.TestData data = Utils.generateTestData(1000);

        String aNameMax = "Max-Heap [array]";
        BinaryHeap.BinaryHeapArray<Integer> aHeapMax = new BinaryHeap.BinaryHeapArray<Integer>(BinaryHeap.Type.MAX);
        Collection<Integer> aCollectionMax = aHeapMax.toCollection();
        assertTrue(HeapTest.testHeap(BinaryHeap.Type.MAX, aHeapMax, Type.Integer, aNameMax,
                                     data.unsorted, data.sorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(aCollectionMax, Type.Integer, aNameMax,
                                                 data.unsorted, data.sorted, data.invalid));

        String lNameMax = "Max-Heap [tree]";
        BinaryHeap.BinaryHeapTree<Integer> tHeapMax = new BinaryHeap.BinaryHeapTree<Integer>(BinaryHeap.Type.MAX);
        Collection<Integer> tCollectionMax = tHeapMax.toCollection();
        assertTrue(HeapTest.testHeap(BinaryHeap.Type.MAX, tHeapMax, Type.Integer, lNameMax,
                                     data.unsorted, data.sorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(tCollectionMax, Type.Integer, lNameMax,
                                                 data.unsorted, data.sorted, data.invalid));
    }
}
