package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\T.txt");
        Scanner a = new Scanner(file);
        Shape s = new Shape();
        Point p;
        int x, y;
        while (a.hasNextInt()) {
            x = a.nextInt();
            y = a.nextInt();
            p = new Point(x, y);
            s.addPoint(p);
        }

        System.out.println(s.calculatePerimeter(s));
    }
}