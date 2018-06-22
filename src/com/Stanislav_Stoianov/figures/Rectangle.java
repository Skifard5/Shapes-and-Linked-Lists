package com.Stanislav_Stoianov.figures;

import com.Stanislav_Stoianov.Interfaces.Shape;
import java.util.Objects;

/**
 * This class represents a class Circle.
 */
public class Rectangle implements Shape {

    /**
     * The height of the class.
     */
    private double height;

    /**
     * The width of the class.
     */
    private double width;

    /**
     * Constructor by default.
     */
    public Rectangle(double h, double w) {
        this.height = h;
        this.width = w;
    }

    @Override
    public double getPerimeter() {
        return 2.0*(this.width + this.height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Rectangle rectangle = (Rectangle) o;
            return Double.compare(rectangle.height, height) == 0 &&
                    Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }
}
