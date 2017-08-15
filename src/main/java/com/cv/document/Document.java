package com.cv.document;

import java.util.List;

/**
 * Created by alexander.kryvenko on 15.08.2017.
 */
public class Document {
    private Node root;
    private Node currentNode;

    public Document() {
        addRootNode();
    }

    public List<Node> getNodes() {
        return root.getChild();
    }

    public void addNode(Integer addNode) {
        addNode(addNode, null);
    }

    private void addRootNode() {
        Node node = new Node();
        node.setOpenTag(0);
        node.setCloseTag(0);

        root = node;
        currentNode = node;
    }

    private Node addNode(Integer openTag, Integer closeTag) {
        Node node = new Node();

        node.setParent(currentNode);
        node.setOpenTag(openTag);
        node.setCloseTag(closeTag);

        currentNode.addChild(node);
        currentNode = node;

        return node;
    }

    public void closeNode(Integer tag) {
        Node node = getParentByName(tag);
        if (node != null) {
            node.setCloseTag(tag);
            currentNode = node.getParent();
        } else {
            addNode(null, tag);
        }
    }

    private Node getParentByName(Integer endTag) {

        return getParentByType(currentNode, endTag);
    }

    private Node getParentByType(Node node, Integer type) {
        if (node == null)
            return null;

        if (node.getOpenTag() != null && node.getOpenTag().equals(-type)) {
            return node;
        }

        return getParentByType(node.getParent(), type);
    }
}
