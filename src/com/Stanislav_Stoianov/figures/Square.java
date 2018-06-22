package com.Stanislav_Stoianov.figures;

import com.Stanislav_Stoianov.Interfaces.Shape;
import java.util.Objects;

/**
 * This class represents a class Square.
 */
public class Square implements Shape {
    /**
     * The side of the class.
     */
    private double side;

    /**
     * Constructor by default.
     */
    public Square(double s) {
        this.side = s;
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }

    @Override
    public boolean equals(Object o) {
           if (o == null || getClass() != o.getClass()) return false;
           Square square = (Square) o;
           return Double.compare(square.side, side) == 0;
       }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
