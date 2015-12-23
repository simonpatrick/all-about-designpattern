package io.hedwig.alg.algorithm.dsimpl.test;

import com.hedwig.algorithm.dsimpl.TreeMap;
import com.hedwig.algorithm.dsimpl.test.common.JavaMapTest;
import com.hedwig.algorithm.dsimpl.test.common.MapTest;
import com.hedwig.algorithm.dsimpl.test.common.Utils;
import com.hedwig.algorithm.dsimpl.test.common.Utils.Type;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TreeMapTests {

    @Test
    public void testTreeMap() {
        Utils.TestData data = Utils.generateTestData(1000);

        String mapName = "TreeMap";
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();
        java.util.Map<String,Integer> jMap = map.toMap();

        assertTrue(MapTest.testMap(map, Type.String, mapName,
                data.unsorted, data.invalid));
        assertTrue(JavaMapTest.testJavaMap(jMap, Type.Integer, mapName,
                data.unsorted, data.sorted, data.invalid));
    }
}
