package io.hedwig.alg.basic.tree.impl;

import io.hedwig.alg.basic.tree.BinaryTree;
import io.hedwig.alg.basic.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchTree<E extends Comparable<E>> extends SimpleBinaryTree<E> {

    public BinarySearchTree() {
    }

    public BinarySearchTree(E data) {
        setData(data);
    }

    public void insert(E data) {
        if (getData() == null && getLeftChild() == null && getRightChild() == null) {
            setData(data);
        } else if (getData() == null) {
            throw new NullPointerException();
        } else if (getData().compareTo(data) > 0) {
            if (getLeftChild() == null) {
                setLeftChild(new BinarySearchTree<E>());
            }
            ((BinarySearchTree<E>) getLeftChild()).insert(data);
        } else {
            if (getRightChild() == null) {
                setRightChild(new BinarySearchTree<E>());
            }
            ((BinarySearchTree<E>) getRightChild()).insert(data);
        }

    }

    private void transplant(Tree<E> first, Tree<E> second) {
        if (second != null) {
            if (!second.isRoot()) {
                final BinarySearchTree<E> parent = (BinarySearchTree<E>) second.getParent();
                if (second.equals(parent.getLeftChild())) {
                    parent.setLeftChild(null);
                } else {
                    parent.setRightChild(null);
                }
            }
            second.setParent(first.getParent());
        }
        if (!first.isRoot()) {
            final BinarySearchTree<E> parent = (BinarySearchTree<E>) first.getParent();
            if (first.equals(parent.getLeftChild())) {
                parent.setLeftChild((BinaryTree<E>) second);
            } else {
                parent.setRightChild((BinaryTree<E>) second);
            }
        }
    }

    public void delete(E data) {
        final BinarySearchTree<E> node = find(data);
        if (node == null) {
            return;
        }
        if (node.getLeftChild() == null) {
            transplant(node, node.getRightChild());
        } else if (node.getRightChild() == null) {
            transplant(node, node.getLeftChild());
        } else {
            final BinarySearchTree<E> minimum = ((BinarySearchTree<E>) node.getRightChild()).getMinimum();
            if (minimum.getParent() == null || !minimum.getParent().equals(node)) {
                transplant(minimum, minimum.getRightChild());
                minimum.setRightChild(node.getRightChild());
            }
            transplant(node, minimum);
            minimum.setLeftChild(node.getLeftChild());
        }
        if (isRoot() && node.isRoot()) {
            final BinarySearchTree<E> root = (BinarySearchTree<E>) getSuccessor(node.getData()).getRoot();
            setRightChild(root.getRightChild());
            setLeftChild(root.getLeftChild());
            setParent(null);
            setData(root.getData());
            root.setParent(null);
            root.setLeftChild(null);
            root.setRightChild(null);
            return;
        }
        node.setRightChild(null);
        node.setLeftChild(null);
    }

    public BinarySearchTree<E> getMinimum() {
        if (getLeftChild() == null) {
            return this;
        }
        return ((BinarySearchTree<E>) getLeftChild()).getMinimum();
    }

    public BinarySearchTree<E> getMaximum() {
        if (getRightChild() == null) {
            return this;
        }
        return ((BinarySearchTree<E>) getRightChild()).getMaximum();
    }

    public BinarySearchTree<E> find(E data) {
        if (getData() == null) {
            throw new NullPointerException();
        }
        if (getData().equals(data)) {
            return this;
        } else if (getData().compareTo(data) > 0) {
            if (getLeftChild() == null) {
                return null;
            }
            return ((BinarySearchTree<E>) getLeftChild()).find(data);
        } else {
            if (getRightChild() == null) {
                return null;
            }
            return ((BinarySearchTree<E>) getRightChild()).find(data);
        }
    }

    public BinarySearchTree<E> getSuccessor(E data) {
        final BinarySearchTree<E> tree = find(data);
        if (tree == null) {
            return null;
        }
        if (tree.getRightChild() != null) {
            BinarySearchTree<E> result = (BinarySearchTree<E>) tree.getRightChild();
            while (result.getLeftChild() != null) {
                result = (BinarySearchTree<E>) result.getLeftChild();
            }
            return result;
        } else if (!tree.isRoot()) {
            BinarySearchTree<E> node = (BinarySearchTree<E>) tree.getParent();
            if (tree.equals(node.getLeftChild())) {
                return node;
            } else {
                while (!node.isRoot() && ((BinarySearchTree<E>) node.getParent()).getRightChild().equals(node)) {
                    node = (BinarySearchTree<E>) node.getParent();
                }
                if (node.isRoot()) {
                    return null;
                }
                node = (BinarySearchTree<E>) node.getParent();
                return node;
            }
        }
        return null;
    }

    private BinarySearchTree<E> getPredecessor(E data) {
        final BinarySearchTree<E> tree = find(data);
        if (tree == null) {
            return null;
        }
        if (tree.getLeftChild() != null) {
            BinarySearchTree<E> result = (BinarySearchTree<E>) tree.getLeftChild();
            while (result.getRightChild() != null) {
                result = (BinarySearchTree<E>) result.getRightChild();
            }
            return result;
        } else if (!tree.isRoot()) {
            BinarySearchTree<E> node = (BinarySearchTree<E>) tree.getParent();
            if (tree.equals(node.getRightChild())) {
                return node;
            } else {
                while (!node.isRoot() && ((BinarySearchTree<E>) node.getParent()).getLeftChild().equals(node)) {
                    node = (BinarySearchTree<E>) node.getParent();
                }
                if (node.isRoot()) {
                    return null;
                }
                node = (BinarySearchTree<E>) node.getParent();
                return node;
            }
        }
        return null;
    }

    public static <E extends Comparable<E>> BinarySearchTree<E> getBinarySearchTree(List<E> items) {
        if (items.isEmpty()) {
            return null;
        }
        final BinarySearchTree<E> root = new BinarySearchTree<E>(items.remove(0));
        while (!items.isEmpty()) {
            root.insert(items.remove(0));
        }
        return root;
    }

    public static void main(String[] args) throws Exception {
        BinarySearchTree<Integer> binarySearchTree = getBinarySearchTree(new ArrayList<Integer>(Arrays.asList(9, 4, 1, 2, 3, 7, 5, 12, 10, 11, 8, 0)));
        System.out.println(binarySearchTree);
        binarySearchTree.delete(9);
        System.out.println(binarySearchTree);
        System.out.println("binarySearchTree.getMinimum() = " + binarySearchTree.getMinimum());
        System.out.println("binarySearchTree.getMaximum() = " + binarySearchTree.getMaximum());
        System.out.println("binarySearchTree.find(7) = " + binarySearchTree.find(7));
        System.out.println("binarySearchTree.find(19) = " + binarySearchTree.find(19));
        System.out.println("binarySearchTree.getSuccessor(7) = " + binarySearchTree.getSuccessor(7));
        System.out.println("binarySearchTree.getSuccessor(8) = " + binarySearchTree.getSuccessor(8));
        System.out.println("binarySearchTree.getSuccessor(0) = " + binarySearchTree.getSuccessor(0));
        System.out.println("binarySearchTree.getPredecessor(8) = " + binarySearchTree.getPredecessor(8));
        System.out.println("binarySearchTree.getPredecessor(10) = " + binarySearchTree.getPredecessor(10));
    }

}
