package com.cv.document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexander.kryvenko on 15.08.2017.
 */
public class Node {

    private static final int NODE_WEIGHT = 2;

    private Integer openTag;
    private Integer closeTag;

    private Node parent;
    private List<Node> child = new ArrayList();

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void addChild(Node parent) {
        this.child.add(parent);
    }

    public void setOpenTag(Integer openTag) {
        this.openTag = openTag;
    }

    public void setCloseTag(Integer closeTag) {
        this.closeTag = closeTag;
    }

    public Integer getOpenTag() {
        return openTag;
    }

    public Node getParent() {
        return parent;
    }

    public int getBalancedBranchLength() {

        if (!isBalanced()) return 0;

        int result = NODE_WEIGHT;
        for (Node el : this.child) {
            result += el.getBalancedBranchLength();
        }

        return result;
    }

    private boolean isBalanced() {
        if (openTag == null || closeTag == null || !openTag.equals(-closeTag))
            return false;

        boolean isBalanced = true;
        for (Node el : this.child) {
            isBalanced &= el.isBalanced();
            if (!isBalanced) return false;
        }

        return isBalanced;
    }

    public List<Node> getChild() {
        return child;
    }
}
