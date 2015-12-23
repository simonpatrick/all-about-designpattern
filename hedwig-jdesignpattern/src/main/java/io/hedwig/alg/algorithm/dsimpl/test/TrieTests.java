package io.hedwig.alg.algorithm.dsimpl.test;

import com.hedwig.algorithm.dsimpl.Trie;
import com.hedwig.algorithm.dsimpl.test.common.JavaCollectionTest;
import com.hedwig.algorithm.dsimpl.test.common.TreeTest;
import com.hedwig.algorithm.dsimpl.test.common.Utils;
import com.hedwig.algorithm.dsimpl.test.common.Utils.Type;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;


public class TrieTests {

    @Test
    public void testTrie() {
        Utils.TestData data = Utils.generateTestData(1000);

        String bstName = "Trie";
        Trie<String> bst = new Trie<String>();
        Collection<String> bstCollection = bst.toCollection();

        assertTrue(TreeTest.testTree(bst, Type.String, bstName,
                data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(bstCollection, Type.String, bstName,
                data.unsorted, data.sorted, data.invalid));
    }
}
