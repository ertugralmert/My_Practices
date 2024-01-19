package com.mert.myexamples.methods;

import java.util.Scanner;

public class TurkceKarekterIngilizceKarakterine {

    // > Türkçe karakterleri ingilizce karakterlere çevirme
    /**
     * İ, ı,ş,Ş,Ç,ç,Ğ,ğ,ü;Ü,ö,Ö
     * Dışarıdan bir kelime girilecek bu kelime içerisinde geçen Türkçe karakterleri ing karakterlere dönüştüreceğiz
     * array kullanılabilir.
     *
     */

    public static void main(String[] args) {
        System.out.println("Program Started");

      translate();

        System.out.println("Program Finished");
        /** Output:
         * Bir kelime giriniz
         * ÇİğDEM
         * CIgDEM
         * Program Finished
         */


    } // main method sonu


    public static void translate(){
        System.out.println("Bir kelime giriniz");
        String kelime = new Scanner(System.in).nextLine();
        System.out.println(kelime
                .replace('Ö','O')
                .replace('ö','o')
                .replace('Ü','U')
                .replace('ü','u')
                .replace('ğ','g')
                .replace('Ğ','G')
                .replace('Ç','C')
                .replace('ç','c')
                .replace('ş','s')
                .replace('Ş','S')
                .replace('ı','i')
                .replace('İ','I')
        );
    }
} // class sonu

