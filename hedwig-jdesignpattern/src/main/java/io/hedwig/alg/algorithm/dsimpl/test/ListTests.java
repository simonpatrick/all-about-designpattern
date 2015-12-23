package io.hedwig.alg.algorithm.dsimpl.test;

import com.hedwig.algorithm.dsimpl.List;
import com.hedwig.algorithm.dsimpl.test.common.JavaCollectionTest;
import com.hedwig.algorithm.dsimpl.test.common.ListTest;
import com.hedwig.algorithm.dsimpl.test.common.Utils;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;


public class ListTests {

    @Test
    public void testArrayList() {
        Utils.TestData data = Utils.generateTestData(1000);

        String aName = "List [array]";
        List.ArrayList<Integer> aList = new List.ArrayList<Integer>();
        Collection<Integer> aCollection = aList.toCollection();

        assertTrue(ListTest.testList(aList, aName,
                data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(aCollection, Utils.Type.Integer, aName,
                data.unsorted, data.sorted, data.invalid));
    }

    @Test
    public void testLinkedList() {
        Utils.TestData data = Utils.generateTestData(1000);

        String lName = "List [linked]";
        List.LinkedList<Integer> lList = new List.LinkedList<Integer>();
        Collection<Integer> lCollection = lList.toCollection();

        assertTrue(ListTest.testList(lList, lName,
                                      data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(lCollection, Utils.Type.Integer, lName,
                                                      data.unsorted, data.sorted, data.invalid));
    }
}
