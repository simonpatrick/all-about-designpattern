package io.hedwig.alg.basic.tree.impl;

import io.hedwig.alg.basic.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleTree<E> implements Tree<E> {

    private final List<Tree<E>> children = new ArrayList<Tree<E>>();
    private E data;
    private Tree<E> parent;

    @Override
    public void addChild(Tree<E> child) {
        child.setParent(this);
        children.add(child);
    }

    @Override
    public void removeChild(Tree<E> tree) {
        children.remove(tree);
    }

    @Override
    public List<Tree<E>> getChildren() {
        return Collections.unmodifiableList(children);
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

}
