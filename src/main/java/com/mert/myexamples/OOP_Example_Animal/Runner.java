package com.mert.myexamples.OOP_Example_Animal;

import com.mert.myexamples.OOP_Example_Animal.entity.Animal;
import com.mert.myexamples.OOP_Example_Animal.entity.Cat;
import com.mert.myexamples.OOP_Example_Animal.entity.Dog;

/**
 * Bu projede Animal class'ını Inheritance class olarak kullandık.
 * Cat ve Dog class'larını kalıtım özelliğinde yararlanarak extends ile Animal class'ından miras aldık.
 * Animal class'ında oluşturduğumu methodu  override edip revize ettik.
 * Sonrasında Runner Class içinde Polimorphsim ile object oluşturup gerekli methodu çağırdık.
 */
public class Runner {

    public static void main(String[] args) {

        Animal kopek = new Dog();
        Animal kedi = new Cat();

        kopek.makeSound();
        kedi.makeSound();
        /**
         * Hav Hav
         * Mivav!
         */
    }
}
