package com.Stanislav_Stoianov;

import com.Stanislav_Stoianov.Interfaces.Shape;

import java.util.Objects;
/**
 * This class represents a node, which has data parameter and link to next element.
 */

 class Node {
    /**
     * The data of the node.
     */
    private Shape data;

    /**
     * The link to next element of the node.
     */
    private Node next;

    /**
     * Constructor by default
     */
    public Node(){
        this.data = null;
        this.next = null;
    }

    /**
     * Constructor by parameters
     * @param data
     * @param next
     */
    public Node(Shape data, Node next) {
        this.data = data;
        this.next = next;
    }

     /**
     *Setter of the Node class
     * @param data
     * @param next
     */
    public void setNode(Shape data, Node next){
        this.data = data;
        this.next = next;
    }

    /**
     * Setter of the data
     * @param data
     */
    public void setData(Shape data) {
        this.data = data;
    }

    /**
     * @return the value of the Shape
     */
    public Shape getData() {
        return data;
    }

    /**
     * @return the value of the Node class
     */
    public Node getNext() {
        return next;
    }

    /**
     * Setter of the next Node element in the list
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * @return of the current Node
     */
    public Node getNode(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(data, node.data) &&
                Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    @Override
    public String toString() {
        return
 //               "Node{" +
 //               "data=" +
                        "" + data
 //                       + ", next=" + next +
 //               '}'
;
    }
}
