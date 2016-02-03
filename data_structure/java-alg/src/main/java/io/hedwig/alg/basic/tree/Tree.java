package io.hedwig.alg.basic.tree;

import java.util.List;

public interface Tree<E> {

    void addChild(Tree<E> child);

    void removeChild(Tree<E> child);

    List<Tree<E>> getChildren();

    E getData();

    void setData(E data);

    Tree<E> getParent();

    void setParent(Tree<E> parent);

    boolean isRoot();

    Tree<E> getRoot();

}
