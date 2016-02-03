package io.hedwig.alg.basic.tree;

public interface RotatingTree<E> extends BinaryTree<E> {

    void rotateLeft();

    void rotateRight();

}