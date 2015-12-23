package io.hedwig.alg.algorithm.datastructure.queue;

public interface IQueue<AT> {
	public void enqueue(AT item);
	public AT dequeue();
	public AT peekFront();
	public boolean isEmpty();
}
