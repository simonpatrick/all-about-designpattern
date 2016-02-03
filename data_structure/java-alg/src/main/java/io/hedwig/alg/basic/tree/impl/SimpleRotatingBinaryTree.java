package io.hedwig.alg.basic.tree.impl;


import io.hedwig.alg.basic.tree.RotatingTree;

public class SimpleRotatingBinaryTree<E> extends SimpleBinaryTree<E> implements RotatingTree<E> {

    private final TreeNodeRotator<E> rotator;

    public SimpleRotatingBinaryTree() {
        this(null);
    }

    public SimpleRotatingBinaryTree(E data) {
        super(data);
        this.rotator = new TreeNodeRotator<E>(this);
    }

    @Override
    public void rotateLeft() {
        rotator.rotateLeft();
    }

    @Override
    public void rotateRight() {
        rotator.rotateRight();
    }

    public static void main(String[] args) throws Exception {
        final SimpleRotatingBinaryTree<Integer> n1 = new SimpleRotatingBinaryTree<Integer>(3);
        final SimpleRotatingBinaryTree<Integer> n2 = new SimpleRotatingBinaryTree<Integer>(4);
        final SimpleRotatingBinaryTree<Integer> n3 = new SimpleRotatingBinaryTree<Integer>(2);
        n1.setLeftChild(n3);
        n1.setRightChild(n2);
        n2.setRightChild(new SimpleRotatingBinaryTree<Integer>(5));
        System.out.println(n1);
        n2.rotateLeft();
        System.out.println(n1);
        ((RotatingTree<Integer>) n2.getParent()).rotateRight();
        System.out.println(n1);
    }

}
