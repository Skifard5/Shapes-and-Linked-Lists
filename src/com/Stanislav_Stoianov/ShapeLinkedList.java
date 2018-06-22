package com.Stanislav_Stoianov;

import com.Stanislav_Stoianov.Interfaces.Shape;

/**
 * This class represents a ShapeLinkedList, which has size and links to first and last elements.
 */
public class ShapeLinkedList {

    /**
     * The link to the first element of the class.
     */
    public Node head;

    /**
     * The quantity of elements in the class.
     */
    private int size;

    /**
     * The link to the last element of the class.
     */
    private  Node last;

    /**
     * Constructor by default.
     */
    public ShapeLinkedList() {
        size = 0;
        head = new Node();
    }

    /**
     * The method checks if there are no elements in list.
     * @return true if the list is empty
     */
    public boolean isEmpty(){
        return head == null;
    }

    /**
     * The method inserts data at the end of the list gets.
     * @param data - Shape
     */
    public void insertAtEnd(Shape data){
    //Check that there is minimum one element i the list
        if(head == null) {
        insertAtBeginning(data);
        size++;
        return;
    }
    // Create new temp Node with new data
    Node temp = new Node(data, null);
    //Set last element
    last.setNext(temp);
    last = last.getNext();
    size++;
    }

    /**
     * The method inserts data at the beginning of the list gets.
     * @param data - Shape
     */
    public void insertAtBeginning(Shape data){
        //Check that there is minimum one element i the list
        if (isEmpty()){
            last = null;
        System.out.println("The List was empty, now there is one element only in this List");
        }
        else
            tail();
        //Set first element
        head = new Node(data, head);
        size++;
    }

    /**
     * The method sets and returns the last element of the list.
     * @return  last - Node
     */
    public Node tail(){
        //Set minimum possible last element of the list
        last = head.getNext();
        for (int i = 0; i < size-2; i++) {
            last = last.getNext();
        }
        return last;
    }

    /**
     * The method returns the quantity of elements of this list.
     * @return  size - int
     */
    public int length(){
        return  size;}

    /**
     * The method inserts the element in the list to the direct place, which method gets.
     * @param data - Shape
     */
    void insertAtIndex(int idx, Shape data){
        Node temp = new Node();
        temp.setData(data);
        Node current = head;
        // crawl to the requested index or the last element in the list,
        // whichever comes first
        for (int i = 1; i < idx && current.getNext() != null; i++) {
            current = current.getNext();
        }
        // set the new node next-node reference to this node next-node
        // reference
        temp.setNext(current.getNext());
        // now set this node next-node reference to the new node
        current.setNext(temp);
        size++;// increment the number of elements variable
    }

    /**
     * The method searches and returns the element by it's index of the list which it gets.
     * @param idx - int
     * @return  temp - Node
     */
    Node findAtIndex(int idx){
       //Check for IndexOutOfBoundsException
        if (head == null) throw new IndexOutOfBoundsException();

        Node temp = head;
        for (int k = 0; k < idx-1; k++) temp = temp.getNext();
        //Check for IndexOutOfBoundsException
        if( temp == null) throw new IndexOutOfBoundsException();

        return temp.getNext();

    }

    /**
     * The method deletes the element by it's index of the list which it gets
     * @param idx - int
     */
    void deleteAtIndex(int idx){
        Node temp = head;
        for(int i=0; i< idx - 1 && temp.getNext() != null; i++) {
            temp = temp.getNext();
        }
        //reset sequence of the list excludes the element, which was deleted
        temp.setNext(temp.getNext().getNext());
        size--;

    }

    /**
     * The method deletes the element by it's data which it gets.
     * @param s - Shape.
     */
    void deleteData(Shape s) {
        //Check for IndexOutOfBoundsException
        if (head == null) throw new IndexOutOfBoundsException();
        Node temp = head;
        //search and check the equality between elements
    if(head.getData().equals(s)){
        head = head.getNext();
        size--;
        return;
    }
        for(int i=0; i < size; i++){
            //search and check the equality between elements
            if(temp.getData().equals(s))
                deleteAtIndex(i);
            if(i > size) {
                System.out.println("The element " + s + " was not found in this Shape Linked List");
                return;
            }
            temp = temp.getNext();
        }
    }

    /**
     * The method helps to print the data of list to console by index which it gets.
     * @param index - int
     * @return "temp" - String.
     */
    public String print(int index){
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.getNext();
        }
        return temp.toString();
    }

    @Override
    public String toString() {
       Node temp = head;
        String res = "[";
        for (int i = 0; i < size-1; i++) {
        res = res + temp.getData().toString()+", ";
        temp = temp.getNext();
        }

        return res + temp.getData().toString() + "]";
    }

    /**
     * The additional method helps to print the data of list.
     * Was used during development only and could be useful in an additional future development.
     */
    public void print(){
    System.out.println("\nThis ShapeLinkedList includes next elements: ");
    Node current = head;
        for (int i = 0; i < size; i++){
            System.out.println(current.getNext());
              current = current.getNext();}
    }
}
