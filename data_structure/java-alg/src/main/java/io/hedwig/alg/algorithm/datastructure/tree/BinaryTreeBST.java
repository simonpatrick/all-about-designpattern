/* 
 * Cracking the coding interview (5th edition)
 * Chapter 4 - Trees and Graphs
 * 
 * Question 4.5
 * Implement a function to check if a binary tree is a binary search tree.
 * 
 * Solution - pg 225
 * 
 */
package io.hedwig.alg.algorithm.datastructure.tree;

public class BinaryTreeBST {

	public boolean isBST(BinaryTreeNode<Integer> root) {
		if (root == null) return true;
		boolean leftValid = 
				root.getLeft() == null ? true : max(root.getLeft()) <= root.getValue();
		boolean rightValid = 
				root.getRight() == null ? true : max(root.getRight()) > root.getValue();
		if (leftValid && rightValid) {
			return isBST(root.getLeft()) && isBST(root.getRight());
		}
		return false;
	}
	
	public Integer max(BinaryTreeNode<Integer> node) {
		while (node.getRight() != null) {
			node = node.getRight();
		}
		return node.getValue();
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(3);
		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(5);
		BinaryTreeNode<Integer> node3 = new BinaryTreeNode<Integer>(0);
		BinaryTreeNode<Integer> node4 = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> node5 = new BinaryTreeNode<Integer>(-1);
		BinaryTreeNode<Integer> node6 = new BinaryTreeNode<Integer>(4);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node3.setLeft(node5);
		node2.setLeft(node6);
		BinaryTreeBST bst = new BinaryTreeBST();
		System.out.println(bst.isBST(root));
	}

}
