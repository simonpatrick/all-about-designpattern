package io.hedwig.alg.algorithm.datastructure.tree;

public class TreeSymmetric {
	
	public boolean isSymmetric(BinaryTreeNode<Integer> root) {
		if (root.getLeft().getValue() == root.getRight().getValue()) {
			return isSymmetric(root.getLeft()) && isSymmetric(root.getRight());
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
