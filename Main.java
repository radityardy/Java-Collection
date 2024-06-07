package com.enigmacamp;

import com.enigmacamp.shape.Circle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle(10)); //Memory 1
        circleList.add(new Circle(5));// Memory 2
        circleList.add(new Circle(1));// Memory 3
        circleList.add(new Circle(4));// Memory 4
        circleList.add(new Circle(5));// Memory 5
        circleList.add(new Circle(2));// Memory 6
        circleList.add(new Circle(3));// Memory 7


        for (Circle circle : circleList) {
            System.out.println(circle);
        }
        System.out.println("Size: "+ circleList.size());

        Circle target = new Circle(10); // Memory 8
        System.out.println("Contain: " + circleList.contains(target));

        // Pass by Value
        String a = "Radit";
        String b = a;
        b = "Yanto";

        System.out.println(a);
        System.out.println(b);

        // Pass by Reference
        Circle circleA = new Circle(4);
        Circle circleB = circleA;
        circleB.setR(10);

        System.out.println(circleA);
        System.out.println(circleB);

        System.out.println("Hash Set");
        Set<Circle> circleSet = new HashSet<>();
        circleSet.add(new Circle(10)); //Memory 1
        circleSet.add(new Circle(5));// Memory 2
        circleSet.add(new Circle(1));// Memory 3
        circleSet.add(new Circle(4));// Memory 4
        circleSet.add(new Circle(5));// Memory 5
        circleSet.add(new Circle(2));// Memory 6
        circleSet.add(new Circle(3));// Memory 7


        for (Circle circle : circleSet) {
            System.out.println(circle);
        }
        System.out.println("Size: "+ circleSet.size());
        System.out.println("Contain: " + circleSet.contains(new Circle(10)));


    }
}
