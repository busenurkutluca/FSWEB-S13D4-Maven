package org.example;


import com.sun.jdi.PathSearchingVirtualMachine;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);


        // 0,0 noktasına göre uzaklık
        System.out.println("distance(0,0)= " + first.distance());

        // İkinci noktaya göre uzaklık
        System.out.println("distance(second)= " + first.distance(second));

        // (2,2) noktasına göre uzaklık
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        // (0,0) noktasına göre uzaklık
        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());






    }
}
