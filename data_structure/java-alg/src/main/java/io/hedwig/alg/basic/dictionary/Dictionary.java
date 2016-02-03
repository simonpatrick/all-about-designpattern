package io.hedwig.alg.basic.dictionary;

/**
 * Created by patrick on 16/2/3.
 */
public interface Dictionary<K,V> {
    void insert(K key,V value);
    void delete(K key);
    V find(K key);
}
