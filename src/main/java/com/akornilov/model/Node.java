package com.akornilov.model;

public class Node {

    protected static int couunt = 0;
    public Node parent;

    /**
     * Constructs a new Node
     *
     * @param parent This node's parent
     * @param parent_cost The cost between these nodes
     * @param distances The 2D array of distance between locations
     * @param active_set The set of all points (including this node) that are being calculated
     * @param index The location index of this node
     */
    public Node() {
    }

    public Node[] generateChildren() {
        Node[] node = new Node[0];

        return node;
    }


    /**
     * Get the lower bound cost of this node
     *
     * @return Lower bound cost
     */
    public double getLowerBound() {

        return Double.MAX_VALUE;
    }

}
