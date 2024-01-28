package com.mert.myexamples.OOP_Example_Shape;

import com.mert.myexamples.OOP_Example_Shape.entity.Circle;
import com.mert.myexamples.OOP_Example_Shape.entity.Rectangle;
import com.mert.myexamples.OOP_Example_Shape.entity.Shape;

public class Runner {

    // -> draw method üstüne gelindiğinde kod ile ilgili açıklama mevcut!
    public static void main(String[] args) {

        Shape s1 = new Rectangle();
        Shape s2 = new Circle();

        s1.draw();
        s2.draw();

        /**
         * Output:
         * Diktörtgen çiziliyor.
         * Daire Çiziliyor.
         */


    }
}
