package io.hedwig.alg.basic.dictionary;

import io.hedwig.alg.basic.Entry;
import io.hedwig.alg.basic.ImmutableEntry;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by patrick on 16/2/3.
 */
public class SortedDictionary<K extends Comparable<K>,V>
        implements Dictionary<K,V>,Iterable<Entry<K,V>> {
    private final List<Entry<K,V>> entries = new ArrayList<>();

    @Override
    public void insert(K key, V value) {
        int index = entries.size();
        for (int i = 0; i < entries.size(); i++) {
            final Entry<K, V> entry = entries.get(i);
            if (entry.getKey().compareTo(key) == 0) {
                entries.set(i, new ImmutableEntry<>(key, value));
                return;
            }
            if (entry.getKey().compareTo(key) > 0) {
                index = i;
                break;
            }
        }
        entries.add(index, new ImmutableEntry<>(key, value));
    }

    @Override
    public void delete(K key) {

        for (Entry<K, V> entry : entries) {
            if(entry.getKey().equals(key)){
                entries.remove(key);
                break;
            }
        }
    }

    @Override
    public V find(K key) {
        if(entries.isEmpty()) return null;
        int start =0;
        int end = entries.size()-1;
        while(start!=end){
            int prob=(start+end)/2;
            final Entry<K,V> current = entries.get(prob);
            if(current.getKey().equals(key)) return current.getValue();
            if(current.getKey().compareTo(key)<0){
                start=prob;
            }else{
                end=prob;
            }
        }
        if(entries.get(start).getKey().equals(key)) return entries.get(start).getValue();
        return null;
    }

    @Override
    public Iterator<Entry<K, V>> iterator() {
        return entries.listIterator();
    }

    @Override
    public void forEach(Consumer<? super Entry<K, V>> action) {
        entries.forEach(action);
    }

    @Override
    public Spliterator<Entry<K, V>> spliterator() {
        throw new RuntimeException("not support yet,please don't use it");
    }
}
