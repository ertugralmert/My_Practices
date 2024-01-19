package com.mert.examples.methods;

public class StringileVerilenIfadeyiIstenilenSekildeYazma {
    /**
     * Güzel örnek tekrar et
     * Adana adlı şehrin plaka kodu : 01
     * Adıyaman adlı şehrin plaka kodu : 02
     */

    public static void main(String[] args) {
        String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya";
        plakaYazma(sehirler);


    } // main method sonu

    public static void plakaYazma(String sehir){
        String[] plakaDuzenleme = sehir.split(";");

        for ( int i = 0; i < plakaDuzenleme.length; i++){
            String yeni = plakaDuzenleme[i].substring(0,plakaDuzenleme[i].indexOf("-"));
            String cumle = plakaDuzenleme[i].substring(plakaDuzenleme[i].indexOf("-")+1,plakaDuzenleme[i].length());
            System.out.println(cumle+ " adlı şehrin plaka kodu : "+yeni);

        }

    }


} // class sonu
