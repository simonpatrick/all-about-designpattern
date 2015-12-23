package io.hedwig.designpattern.structural.adapter;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

import static org.junit.Assert.*;

public class IterationEnumeratorTest {

    static final ArrayList<String> CITIES = new ArrayList<String>() {{
        add("San Jose");
        add("San Diego");
        add("San Luis Obispo");
    }};

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }
    };

    @Test
    public void testHasMoreElements() throws Exception {
        Iterator iterator = CITIES.iterator();
        Enumeration<String> cities = new IterationEnumerator(iterator);
        assertEquals(true, cities.hasMoreElements());
    }

    @Test
    public void testNextElement() throws Exception {
        Iterator iterator = CITIES.iterator();
        Enumeration<String> cities = new IterationEnumerator(iterator);
        assertEquals("San Jose", cities.nextElement());
        assertEquals("San Diego", cities.nextElement());
    }

}