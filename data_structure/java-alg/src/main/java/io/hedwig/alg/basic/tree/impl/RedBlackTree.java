package io.hedwig.alg.basic.tree.impl;


import io.hedwig.alg.basic.tree.RotatingTree;

public class RedBlackTree<E extends Comparable<E>> extends BinarySearchTree<E> implements RotatingTree<E> {

    public static enum Color {
        RED, BLACK
    }

    private final TreeNodeRotator<E> rotator;
    private Color color;

    public RedBlackTree() {
        this(null);
    }

    public RedBlackTree(E data) {
        super(data);
        this.rotator = new TreeNodeRotator<E>(this);
        this.color = Color.BLACK;
    }

    @Override
    public void rotateLeft() {
        rotator.rotateLeft();
    }

    @Override
    public void rotateRight() {
        rotator.rotateRight();
    }

    public Color getColor() {
        return color;
    }

}
