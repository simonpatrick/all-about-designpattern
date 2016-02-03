package io.hedwig.alg.basic.tree.impl;

import io.hedwig.alg.basic.tree.Tree;
import io.hedwig.alg.basic.tree.Trie;

import java.util.*;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (2013/10/11, 23:50)
 */
public class SimpleTrie<E extends Comparable<E>> implements Trie<E> {

    private static int count = 0;
    private final List<E> links;
    private final Map<E, Trie<E>> children;
    private E data;
    private boolean marked;
    private Tree<E> parent;

    public SimpleTrie() {
        count++;
        links = new ArrayList<E>();
        children = new HashMap<E, Trie<E>>();
        marked = false;
    }

    @Override
    public List<E> getLinks() {
        return Collections.unmodifiableList(links);
    }

    @Override
    public void addLink(E link, Trie<E> child) {
        if (!links.contains(link)) {
            links.add(link);
        }
        child.setParent(this);
        children.put(link, child);
        Collections.sort(links);
    }

    @Override
    public void removeLink(E link) {
        links.remove(link);
        children.remove(link);
    }

    @Override
    public Trie<E> find(List<E> query) {
        if (query.isEmpty()) {
            return null;
        }
        final E key = query.get(0);
        if (children.containsKey(key)) {
            final Trie<E> child = children.get(key);
            if (query.size() == 1 && child.isDataNode()) {
                return child;
            } else {
                return child.find(query.subList(1, query.size()));
            }
        }
        return null;
    }

    @Override
    public List<List<E>> list() {
        if (children.isEmpty()) {
            final ArrayList<List<E>> lists = new ArrayList<List<E>>();
            final ArrayList<E> list = new ArrayList<E>();
            lists.add(list);
            list.add(getData());
            return lists;
        }
        final ArrayList<List<E>> lists = new ArrayList<List<E>>();
        for (E link : links) {
            final Trie<E> trie = children.get(link);
            final List<List<E>> subLists = trie.list();
            if (getData() == null) {
                lists.addAll(subLists);
                continue;
            }
            if (isDataNode()) {
                subLists.add(0, new ArrayList<E>());
            }
            for (List<E> subList : subLists) {
                final ArrayList<E> item = new ArrayList<E>();
                item.add(getData());
                item.addAll(subList);
                lists.add(item);
            }
        }
        return lists;
    }

    @Override
    public void addChild(Tree<E> tree) {
        addLink(tree.getData(), (Trie<E>) tree);
    }

    @Override
    public void removeChild(Tree<E> tree) {
        removeLink(tree.getData());
    }

    @Override
    public List<Tree<E>> getChildren() {
        final ArrayList<Tree<E>> list = new ArrayList<Tree<E>>();

        for (E link : links) {
            list.add(children.get(link));
        }
        return list;
    }

    @Override
    public E getData() {
        return data;
    }

    @Override
    public void setData(E data) {
        this.data = data;
    }

    @Override
    public Tree<E> getParent() {
        return parent;
    }

    @Override
    public void setParent(Tree<E> parent) {
        this.parent = parent;
    }

    @Override
    public boolean isRoot() {
        return parent == null;
    }

    @Override
    public Tree<E> getRoot() {
        Tree<E> node = this;
        while (!node.isRoot()) {
            node = node.getParent();
        }
        return node;
    }

    private void mark() {
        marked = true;
    }

    @Override
    public boolean isDataNode() {
        return children.isEmpty() || marked;
    }

    @Override
    public Trie<E> getChild(E link) {
        if (links.contains(link)) {
            return children.get(link);
        }
        return null;
    }

    public static <E extends Comparable<E>> Trie<E> getTrie(Collection<List<E>> lists, boolean mergeNodes) {
        return getTrie(lists, mergeNodes ? new HashMap<Collection<List<E>>, Trie<E>>() : null);
    }

    public static <E extends Comparable<E>> Trie<E> getTrie(Collection<List<E>> lists, HashMap<Collection<List<E>>, Trie<E>> cache) {
        if (cache != null) {
            for (Collection<List<E>> key : cache.keySet()) {
                boolean matches = true;
                for (List<E> list : lists) {
                    boolean found = false;
                    for (List<E> cachedList : key) {
                        if (cachedList.equals(list)) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        matches = false;
                        break;
                    }
                }
                if (matches) {
                    final Trie<E> trie = cache.get(key);
                    final SimpleTrie<E> result = new SimpleTrie<E>();
                    for (E link : trie.getLinks()) {
                        result.addLink(link, trie.getChild(link));
                    }
                    return result;
                }
            }
        }
        final Map<E, Collection<List<E>>> mapped = new HashMap<E, Collection<List<E>>>();
        final SimpleTrie<E> root = new SimpleTrie<E>();
        for (List<E> list : lists) {
            if (list.isEmpty()) {
                root.mark();
                continue;
            }
            final E first = list.get(0);
            final List<E> rest = list.subList(1, list.size());
            final Collection<List<E>> collection;
            if (mapped.containsKey(first)) {
                collection = mapped.get(first);
            } else {
                collection = new HashSet<List<E>>();
                mapped.put(first, collection);
            }
            collection.add(rest);
        }
        for (Map.Entry<E, Collection<List<E>>> entry : mapped.entrySet()) {
            final Trie<E> trie = getTrie(entry.getValue(), cache);
            trie.setData(entry.getKey());
            root.addLink(entry.getKey(), trie);
        }
        if (cache != null) {
            cache.put(lists, root);
        }
        return root;
    }

    public static Trie<Character> getStringTrie(Collection<String> strings, boolean mergeNodes) {
        final HashSet<List<Character>> lists = new HashSet<List<Character>>();
        for (String string : strings) {
            final ArrayList<Character> characters = new ArrayList<Character>(string.length());
            for (int i = 0; i < string.length(); i++) {
                characters.add(string.charAt(i));
            }
            lists.add(characters);
        }
        return getTrie(lists, mergeNodes);
    }

    @Override
    public String toString() {
        return "node:" + data;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Creating the large list");
        final ArrayList<List<Integer>> integerLists = getLists();
        long time = System.currentTimeMillis();
        System.out.println("Building trie");
        final Trie<Integer> trie = getTrie(integerLists, true);
        System.out.println("Total nodes: " + count);
        System.out.println("Build time: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        System.out.println("List time: " + (System.currentTimeMillis() - time));
        final List<Integer> integers = integerLists.get(new Random().nextInt(integerLists.size()));
        time = System.currentTimeMillis();
        final Trie<Integer> theTrie = trie.find(integers);
        System.out.println("Find time: " + (System.currentTimeMillis() - time));
        System.out.println(integers);
        System.out.println(theTrie.getData());
        printNode(theTrie);
//        for (int i = 0; i < lists.size(); i++) {
//            List<?> list = lists.get(i);
//            final Object[] characters = list.toArray();
//            final char[] chars = new char[characters.length];
//            for (int j = 0; j < characters.length; j++) {
//                chars[j] = (Character) characters[j];
//            }
//            System.out.println((i + 1) + ": " + new String(chars));
//        }
    }

    private static void printNode(Trie<?> node) {
        if (!node.isRoot() && !node.getParent().isRoot()) {
            printNode((Trie<?>) node.getParent());
            System.out.print(",");
        }
        System.out.print(node.getData());
        if (node.getChildren().isEmpty()) {
            System.out.println();
        }
    }

    private static ArrayList<List<Integer>> getLists() {
        final ArrayList<List<Integer>> lists = new ArrayList<List<Integer>>();
        int count = 0;
        for (int i = 0; i < 100; i ++) {
            final int length = new Random().nextInt(10);
            count += length;
            final ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < length; j ++) {
                list.add(new Random().nextInt(10));
            }
            lists.add(list);
        }
        System.out.println("Total items: " + count);
        return lists;
    }

    private static <E extends Comparable<E>> void printTrie(Trie<E> trie) {
        System.out.print(trie.getData());
        System.out.print("[");
        boolean first = true;
        for (Tree<E> tree : trie.getChildren()) {
            if (!first) {
                System.out.print(",");
            }
            first = false;
            printTrie((Trie<?>) tree);
        }
        System.out.print("]");
        if (trie.isRoot()) {
            System.out.println();
        }
    }

}
