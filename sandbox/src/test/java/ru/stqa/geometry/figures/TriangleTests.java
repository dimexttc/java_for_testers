package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void calculateArea(){
       var s=new Triangle(12,10,10);
       double result=s.area();
        Assertions.assertEquals(4,result);
    }

    @Test
    void calculatePerimeter(){
        var p=new Triangle(12,10,10);
        double result=p.perimeter();
        Assertions.assertEquals(32,result);
    }
}
