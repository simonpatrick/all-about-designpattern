package io.hedwig.alg.algorithm.dsimpl.test;

import com.hedwig.algorithm.dsimpl.Stack;
import com.hedwig.algorithm.dsimpl.test.common.JavaCollectionTest;
import com.hedwig.algorithm.dsimpl.test.common.StackTest;
import com.hedwig.algorithm.dsimpl.test.common.Utils;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;


public class StackTests {

    @Test
    public void testArrayStack() {
        Utils.TestData data = Utils.generateTestData(1000);

        String aName = "Stack [array]";
        Stack.ArrayStack<Integer> aStack = new Stack.ArrayStack<Integer>();
        Collection<Integer> aCollection = aStack.toCollection();

        assertTrue(StackTest.testStack(aStack, aName,
                data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(aCollection, Utils.Type.Integer, aName,
                data.unsorted, data.sorted, data.invalid));
    }

    @Test
    public void testLinkedStack() {
        Utils.TestData data = Utils.generateTestData(1000);

        String lName = "Stack [linked]";
        Stack.LinkedStack<Integer> lStack = new Stack.LinkedStack<Integer>();
        Collection<Integer> lCollection = lStack.toCollection();

        assertTrue(StackTest.testStack(lStack, lName,
                                       data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(lCollection, Utils.Type.Integer, lName,
                                                     data.unsorted, data.sorted, data.invalid));
    }
}
