package ru.stqa.geometry.figures;

import java.awt.*;

public record Triangle(double a, double b, double c) {

    public static void printTriangleArea(Triangle s) {
        String text=String.format("площадь треугольника со сторонами %f , %f , %f= %f",s.a,s.b,s.c,s.area());
        System.out.println(text);
    }

    public static void printTrianglePerimeter(Triangle s) {
        String text=String.format("периметр треугольника со сторонами %f , %f , %f= %f",s.a,s.b,s.c,s.perimeter());
        System.out.println(text);
    }

    public  double area() {
        return Math.sqrt((this.a+this.b+this.c)/2);
    }

    public  double perimeter(){
        return this.a+this.b+this.c;
    }


}

