package io.hedwig.alg.learnalg.trees.tree2Json;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by patrick on 15/7/16.
 *
 * @version $Id$
 */


public class TreeNode {
    private TreeNode current;
    private List<TreeNode> children= Lists.newArrayList();
    private TreeNode parent;
    private String name;

    public TreeNode(List<TreeNode> children, TreeNode parent, String name) {
        this.children = children;
        this.parent = parent;
        this.name = name;
    }

    public TreeNode() {
    }
    public TreeNode(String name){
        this.name=name;
    }

    private boolean isRoot(){
        return parent==null?true:false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode("root");
        TreeNode c1= new TreeNode();
        c1.setParent(root);
        TreeNode c2 = new TreeNode();
        c1.getChildren().add(c2);
        c2.setParent(c1);
        System.out.println(root);

    }

    public TreeNode getCurrent() {
        return current;
    }

    public void setCurrent(TreeNode current) {
        this.current = current;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("current", current)
                .add("children", children)
                .add("parent", parent)
                .add("name", name)
                .toString();
    }
}
