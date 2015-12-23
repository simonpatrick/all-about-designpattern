package io.hedwig.alg.algorithm.dsimpl.test;

import com.hedwig.algorithm.dsimpl.SkipListMap;
import com.hedwig.algorithm.dsimpl.test.common.JavaMapTest;
import com.hedwig.algorithm.dsimpl.test.common.MapTest;
import com.hedwig.algorithm.dsimpl.test.common.Utils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class SkipListMapTests {

    @Test
    public void testSkipListMap() {
        Utils.TestData data = Utils.generateTestData(1000);

        String mapName = "SkipListMap";
        SkipListMap<String,Integer> map = new SkipListMap<String,Integer>();
        java.util.Map<String,Integer> jMap = map.toMap();

        assertTrue(MapTest.testMap(map, Utils.Type.String, mapName,
                data.unsorted, data.invalid));
        assertTrue(JavaMapTest.testJavaMap(jMap, Utils.Type.Integer, mapName,
                data.unsorted, data.sorted, data.invalid));
    }

}
