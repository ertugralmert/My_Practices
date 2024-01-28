package com.mert.myexamples.OOP_Example_Shape.entity;

public class Shape {
    /**
     * Bu main class yani Inheritance kullanıp extends olacak class diyebiliriz.
     * Buradaki Rectangle ve Shape class için ortak olan şekil çizme methodu var.
     * Shape class'ını kullanıp Rectange & Circle class'larında extends Shape komutunu kullanıp kalıtım yapıp miras
     * alacağız.
     * Shape class için de ortak method yazıp Override yapacağız.
     * Sonrasında sout ifadesini bize uygun olarak değiştireceğiz.
     * Runner class'ta Polimorphism yani çok biçimcilik yapcağız.
     * Shape Class'ını kullanıp Rectangle ve Circle class'ından nesne oluşturacağız.
     */

    public void draw() {
        System.out.println("Bir şekil çiziliyor");
    }


}
