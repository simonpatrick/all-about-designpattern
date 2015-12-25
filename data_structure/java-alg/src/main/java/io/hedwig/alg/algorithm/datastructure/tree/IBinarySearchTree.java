package io.hedwig.alg.algorithm.datastructure.tree;

public interface IBinarySearchTree {

	boolean find(int key);
	void insert(int key, double value);
	void delete(int key);
	void traverse();
	
}
