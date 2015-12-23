package io.hedwig.alg.algorithm.dsimpl.test;

import com.hedwig.algorithm.dsimpl.HashArrayMappedTrie;
import com.hedwig.algorithm.dsimpl.test.common.JavaMapTest;
import com.hedwig.algorithm.dsimpl.test.common.MapTest;
import com.hedwig.algorithm.dsimpl.test.common.Utils;
import com.hedwig.algorithm.dsimpl.test.common.Utils.Type;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HashArrayMappedTreeTests {

    @Test
    public void testHAMT() {
        Utils.TestData data = Utils.generateTestData(1000);

        String mapName = "HAMT";
        HashArrayMappedTrie<Integer,String> map = new HashArrayMappedTrie<Integer,String>();
        java.util.Map<Integer,String> jMap = map.toMap();

        assertTrue(MapTest.testMap(map, Type.Integer, mapName,
                data.unsorted, data.invalid));
        assertTrue(JavaMapTest.testJavaMap(jMap, Type.Integer, mapName,
                data.unsorted, data.sorted, data.invalid));
    }
}
