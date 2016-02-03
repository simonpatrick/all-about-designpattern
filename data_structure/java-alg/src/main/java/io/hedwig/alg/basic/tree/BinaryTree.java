package io.hedwig.alg.basic.tree;

public interface BinaryTree<E> extends Tree<E> {

    BinaryTree<E> getLeftChild();

    BinaryTree<E> getRightChild();

    void setLeftChild(BinaryTree<E> leftChild);

    void setRightChild(BinaryTree<E> rightChild);

}
