package io.hedwig.alg.basic.hastable;

public class SimpleHashTable<K, V> implements HashTable<K, V> {

    private final Object[] keys;
    private final Object[] objects;
    private final HashFunction function;

    public SimpleHashTable(HashFunction function) {
        this.function = function;
        keys = new Object[function.getLength()];
        objects = new Object[function.getLength()];
    }

    public SimpleHashTable() {
        this.function = new DivisionHashFunction(20);
        keys = new Object[function.getLength()];
        objects = new Object[function.getLength()];
    }
    @Override
    public int getSize() {
        return function.getLength();
    }

    @Override
    public void insert(K key, V value) {
        final int hash = function.hash(key.hashCode());
        if (keys[hash] != null && !keys[hash].equals(key)) {
            throw new Error("Data collision error for " + key + " and " + keys[hash]);
        }
        keys[hash] = key;
        objects[hash] = value;
    }

    @Override
    public void delete(K key) {
        final int hash = function.hash(key.hashCode());
        if (keys[hash] == null || !keys[hash].equals(key)) {
            throw new Error("No data error");
        }
        keys[hash] = null;
        objects[hash] = null;
    }

    @Override
    public V find(K key) {
        final int hash = function.hash(key.hashCode());
        if (keys[hash] != null && keys[hash].equals(key)) {
            //noinspection unchecked
            return (V) objects[hash];
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        final SimpleHashTable<Integer, String> hashTable = new SimpleHashTable<Integer, String>(new DivisionHashFunction(2));
        System.out.println("setting 100");
        hashTable.insert(100, "test");
        System.out.println("setting 101");
        hashTable.insert(101, "another test");
        System.out.println("98: " + hashTable.find(98));
        System.out.println("100: " + hashTable.find(100));
        System.out.println("101: " + hashTable.find(101));
        System.out.println("setting 100");
        hashTable.insert(100, "test 2");
        System.out.println("100: " + hashTable.find(100));
        System.out.println("deleting 101");
        hashTable.delete(100);
        System.out.println("100: " + hashTable.find(100));
        System.out.println("setting 2");
        hashTable.insert(2, "something");
        System.out.println("2: " + hashTable.find(2));
        System.out.println("100: " + hashTable.find(100));
        System.out.println("101: " + hashTable.find(101));
        try {
            System.out.println("setting 4");
            hashTable.insert(4, "something");
        } catch (Error e) {
            System.out.println("error: " + e.getMessage());
        }
    }

}
