package com.Stanislav_Stoianov;
/**
 * @date   09/06/2018
 * @author  Stanisalv Stoianov
 * @version 1.0
 */

import com.Stanislav_Stoianov.Interfaces.Shape;
import com.Stanislav_Stoianov.figures.Circle;
import com.Stanislav_Stoianov.figures.Rectangle;
import com.Stanislav_Stoianov.figures.Square;
import com.Stanislav_Stoianov.figures.Triangle;

import java.util.LinkedList;

/**
 * This application implements class ShapeLinkedList that is similar to
 * classical LinkedList but it specialized for classes: Circle, Rectangle, Square, Triangle through
 * Shape Interface. Also through Shape interface there is an implementation of perimeter functionality.
 */

public class Main {

    public static void main(String[] args) {

        /**
         * Check the functionality of a Rectangle class(perimeter).
         */
        Shape tt1 = new Rectangle( 2.0, 5.0);
        System.out.println(tt1.getPerimeter());

        /**
         * Check the functionality of a Triangle class(perimeter).
         */
        Shape tt2 = new Triangle(3.0, 4.0, 5.0);
        System.out.println(tt2.getPerimeter());

        /**
         * Check the functionality of a Circle class(perimeter).
         */
        Shape tt3 = new Circle(98);
        System.out.println(tt3.getPerimeter());

        /**
         * Check the functionality of a Square class(perimeter).
         */
        Shape tt4 = new Square(5);
        System.out.println(tt4.getPerimeter());

        Shape q1 = new Circle(999);
        Shape q2 = new Circle(999);

        /**
         * Check the functionality of Circle(as example) class(equals).
         */
        System.out.println("result is "+ q1.equals(q2));
        System.out.println("--------------------------------------------");
/*

        ShapeLinkedList test = new ShapeLinkedList();
        test.insertAtBeginning(tt1);
//        test.print();
        test.insertAtBeginning(tt2);
//        test.print();
        test.insertAtBeginning(tt3);
        test.print();
        test.insertAtEnd(tt4);
        test.insertAtEnd(tt1);
        test.print();
        System.out.println();
        test.insertAtIndex(4, tt2);
        test.print();

    //    System.out.println("The second elemnt is    " + test.findAtIndex(2));
    //    System.out.println(test.print(2));

        System.out.println();
        test.deleteAtIndex(4);
        test.print();
        test.deleteData(q2);
        test.print();
       */
/////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////
    /**
    * Standard check of the test in accordance with classical LinkedList
    */
        LinkedList test22 = new LinkedList();
        Circle jj2 = new Circle(88);
        Triangle kk2 = new Triangle(3, 44, 44);
        Square zz2 = new Square(3);
        Rectangle qwer2 = new Rectangle(3, 4);
        Circle index2 = new Circle(3);

        test22.addFirst(jj2);
        test22.addFirst(zz2);
        test22.addFirst(kk2);
        test22.addFirst(qwer2);
        test22.add(2, index2);
        test22.remove(kk2);

        System.out.println(test22.toString());
        System.out.println(test22.get(2));
        System.out.println(test22.size());


        LinkedList sll2 = new LinkedList();
        int[] values2 = {2, 1, 3, 5, 1, 4, 5, 3, 5, 7, 1, 2, 8, 9};

        Circle c12 = new Circle(values2[0]);
        Circle c22 = new Circle(values2[1]);

        Square sq12 = new Square(values2[2]);
        Square sq22 = new Square(values2[3]);

        Triangle t12 = new Triangle(values2[4], values2[5], values2[6]);
        Triangle t22 = new Triangle(values2[7], values2[8], values2[9]);

        Rectangle r12 = new Rectangle(values2[10], values2[11]);
        Rectangle r22 = new Rectangle(values2[12], values2[13]);

        sll2.addFirst(r12);
        sll2.addFirst(r22);
        sll2.addFirst(c12);
        sll2.addFirst(c22);
        sll2.addLast(sq12);
        sll2.addLast(sq22);
        sll2.addLast(t12);
        sll2.addLast(t22);

        for (int i = 0; i < sll2.size(); i++) {
            System.out.println(sll2.get(i));
        }


        System.out.println();
        sll2.remove(sll2.getLast());
        for (int i = 0; i < sll2.size(); i++) {
            System.out.println(sll2.get(i));
        }


        System.out.println();
        sll2.remove(sq22);
        for (int i = 0; i < sll2.size(); i++) {
            System.out.println(sll2.get(i));
        }

/////////////////////////////////////////////////////////////////////////////////////////////////////////

System.out.println("-----------------------------------------------------------------------------");
        /**
         * Standard check of the test in accordance with ShapeLinkedList
         */

        ShapeLinkedList test = new ShapeLinkedList();
        Circle jj = new Circle(88);
        Triangle kk = new Triangle(3, 44, 44);
        Square zz = new Square(3);
        Rectangle qwer = new Rectangle(3, 4);
        Circle index = new Circle(3);

        test.insertAtBeginning(jj);
        test.insertAtBeginning(zz);
        test.insertAtBeginning(kk);
        test.insertAtBeginning(qwer);
        test.insertAtIndex(2, index);
        test.deleteData(kk);

        System.out.println(test.toString());
        System.out.println(test.findAtIndex(2));
        System.out.println(test.length());


        ShapeLinkedList sll = new ShapeLinkedList();
        int[] values = {2, 1, 3, 5, 1, 4, 5, 3, 5, 7, 1, 2, 8, 9};

        Circle c1 = new Circle(values[0]);
        Circle c2 = new Circle(values[1]);

        Square sq1 = new Square(values[2]);
        Square sq2 = new Square(values[3]);

        Triangle t1 = new Triangle(values[4], values[5], values[6]);
        Triangle t2 = new Triangle(values[7], values[8], values[9]);

        Rectangle r1 = new Rectangle(values[10], values[11]);
        Rectangle r2 = new Rectangle(values[12], values[13]);

        sll.insertAtBeginning(r1);
        sll.insertAtBeginning(r2);
        sll.insertAtBeginning(c1);
        sll.insertAtBeginning(c2);
        sll.insertAtEnd(sq1);
        sll.insertAtEnd(sq2);
        sll.insertAtEnd(t1);
        sll.insertAtEnd(t2);

        for (int i = 0; i < sll.length(); i++) {
            System.out.println(sll.print(i));
        }
        System.out.println();
        sll.deleteData(sll.tail().getData());
        for (int i = 0; i < sll.length(); i++) {
            System.out.println(sll.print(i));
        }
        System.out.println();
        sll.deleteData(sq2);
        for (int i = 0; i < sll.length(); i++) {
            System.out.println(sll.print(i));
        }
    }
}
