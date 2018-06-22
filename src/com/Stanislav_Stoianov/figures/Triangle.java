package com.Stanislav_Stoianov.figures;

import com.Stanislav_Stoianov.Interfaces.Shape;
import java.util.Objects;

public class Triangle implements Shape {

    /**
     * The first side of the class.
     */
    private double a;

    /**
     * The second side of the class.
     */
    private double b;

    /**
     * The third side of the class.
     */
    private double c;

    /**
     * Constructor by default.
     */
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Triangle trinagle = (Triangle) o;
            return Double.compare(trinagle.a, a) == 0 &&
                    Double.compare(trinagle.b, b) == 0 &&
                    Double.compare(trinagle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "Trinagle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
