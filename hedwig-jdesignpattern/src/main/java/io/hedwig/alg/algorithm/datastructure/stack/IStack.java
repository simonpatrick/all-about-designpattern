package io.hedwig.alg.algorithm.datastructure.stack;

public interface IStack<T> {
	
	public void push(T obj);
	public T pop();
	public T peek();
	public boolean isEmpty();

}
