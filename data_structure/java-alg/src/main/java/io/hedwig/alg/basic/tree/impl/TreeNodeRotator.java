package io.hedwig.alg.basic.tree.impl;


import io.hedwig.alg.basic.tree.BinaryTree;
import io.hedwig.alg.basic.tree.RotatingTree;

public class TreeNodeRotator<E> {

    private final RotatingTree<E> node;

    public TreeNodeRotator(RotatingTree<E> node) {
        this.node = node;
    }

    public void rotateLeft() {
        final BinaryTree<E> rightChild = node.getRightChild();
        if (rightChild == null) {
            throw new NullPointerException();
        }
        node.setRightChild(null);
        if (node.isRoot()) {
            rightChild.setParent(null);
        } else {
            final RotatingTree<E> parent = (RotatingTree<E>) node.getParent();
            if (node.equals(parent.getRightChild())) {
                parent.setRightChild(rightChild);
            } else {
                parent.setLeftChild(rightChild);
            }
        }
        if (rightChild.getLeftChild() != null) {
            node.setRightChild(rightChild.getLeftChild());
        }
        rightChild.setLeftChild(node);
    }

    public void rotateRight() {
        final BinaryTree<E> leftChild = node.getLeftChild();
        if (leftChild == null) {
            throw new NullPointerException();
        }
        node.setLeftChild(null);
        if (node.isRoot()) {
            leftChild.setParent(null);
        } else {
            final RotatingTree<E> parent = (RotatingTree<E>) node.getParent();
            if (node.equals(parent.getRightChild())) {
                parent.setRightChild(leftChild);
            } else {
                parent.setLeftChild(leftChild);
            }
        }
        if (leftChild.getRightChild() != null) {
            node.setLeftChild(leftChild.getRightChild());
        }
        leftChild.setRightChild(node);
    }

}
