package com.enigmacamp.shape;

import java.util.Objects;

public class Circle {
    private Integer r;
    private final Double PI = 3.14;

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Circle(Integer r) {
        this.r = r;
    }

    public Double getSurface() {
        return PI * r * r;
    }

    public Double getRound() {
        return 2 * PI * r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(r, circle.r) && Objects.equals(PI, circle.PI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", PI=" + PI +
                '}';
    }
}
