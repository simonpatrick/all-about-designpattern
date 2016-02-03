package io.hedwig.alg.basic;


public class ImmutableEntry<K, V> implements Entry<K, V> {

    private final K key;
    private final V value;

    public ImmutableEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }


    @Override
    public String toString() {
        return (key == null ? "null" : "'" + key.toString().replace("\n", "\\n").replaceAll("(^|[^\\\\])\'", "$1\\\\\'") + "'") + ":" + value;
    }
}
