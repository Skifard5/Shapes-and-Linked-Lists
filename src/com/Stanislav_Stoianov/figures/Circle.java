package com.Stanislav_Stoianov.figures;

import com.Stanislav_Stoianov.Interfaces.Shape;
import java.util.Objects;

/**
 * This class represents a class Circle.
 */
public class Circle implements Shape {

    /**
     * The radius of the class.
     */
    private double radius;

    /**
     * Constructor by default.
     */
    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getPerimeter() {
        return 2.0*Math.PI*this.radius;
    }

    @Override
    public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass())
                return false;
            Circle circle = (Circle) o;
            return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
