package io.hedwig.alg.basic.tree.impl;

import io.hedwig.alg.basic.tree.BinaryTree;
import io.hedwig.alg.basic.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class SimpleBinaryTree<E> implements BinaryTree<E> {

    private BinaryTree<E> parent;
    private BinaryTree<E> leftChild;
    private BinaryTree<E> rightChild;
    private E data;

    public SimpleBinaryTree() {
    }

    public SimpleBinaryTree(E data) {
        setData(data);
    }

    @Override
    public void addChild(Tree<E> child) {
        if (leftChild == null && rightChild == null) {
            setLeftChild((BinaryTree<E>) child);
        } else if (leftChild != null && rightChild == null) {
            setRightChild((BinaryTree<E>) child);
        }
    }

    @Override
    public void removeChild(Tree<E> child) {
        if (child == null) {
            throw new NullPointerException();
        }
        if (child.equals(leftChild)) {
            if (leftChild != null) {
                leftChild.setParent(null);
            }
            leftChild = null;
        } else if (child.equals(rightChild)) {
            if (rightChild != null) {
                rightChild.setParent(null);
            }
            rightChild = null;
        }
    }

    @Override
    public List<Tree<E>> getChildren() {
        final ArrayList<Tree<E>> list = new ArrayList<Tree<E>>();
        list.add(leftChild);
        list.add(rightChild);
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
        this.parent = (BinaryTree<E>) parent;
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

    @Override
    public BinaryTree<E> getLeftChild() {
        return leftChild;
    }

    @Override
    public BinaryTree<E> getRightChild() {
        return rightChild;
    }

    @Override
    public void setLeftChild(BinaryTree<E> leftChild) {
        this.leftChild = leftChild;
        if (leftChild != null) {
            leftChild.setParent(this);
        }
    }

    @Override
    public void setRightChild(BinaryTree<E> rightChild) {
        this.rightChild = rightChild;
        if (rightChild != null) {
            rightChild.setParent(this);
        }
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getData());
        if (leftChild != null || rightChild != null) {
            builder.append("[");
            builder.append(leftChild == null ? "*" : leftChild);
            builder.append(",");
            builder.append(rightChild == null ? "*" : rightChild);
            builder.append("]");
        }
        return builder.toString();
    }
}
