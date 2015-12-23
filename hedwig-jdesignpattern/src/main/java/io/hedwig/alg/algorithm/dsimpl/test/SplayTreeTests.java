package io.hedwig.alg.algorithm.dsimpl.test;

import com.hedwig.algorithm.dsimpl.BinarySearchTree;
import com.hedwig.algorithm.dsimpl.SplayTree;
import com.hedwig.algorithm.dsimpl.test.common.JavaCollectionTest;
import com.hedwig.algorithm.dsimpl.test.common.TreeTest;
import com.hedwig.algorithm.dsimpl.test.common.Utils;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;


public class SplayTreeTests {

    @Test
    public void testSplayTree() {
        Utils.TestData data = Utils.generateTestData(1000);

        String bstName = "Splay Tree";
        BinarySearchTree<Integer> bst = new SplayTree<Integer>();
        Collection<Integer> bstCollection = bst.toCollection();

        assertTrue(TreeTest.testTree(bst, Utils.Type.Integer, bstName,
                data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(bstCollection, Utils.Type.Integer, bstName,
                data.unsorted, data.sorted, data.invalid));
    }

}
