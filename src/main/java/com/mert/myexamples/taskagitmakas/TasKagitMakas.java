package com.mert.myexamples.taskagitmakas;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class TasKagitMakas {

public String tas= "tas";
public String kagit= "kagit";
public  String makas = "makas";

public String[] oyunDizisi = {"taş","kağıt","makas"};
public String duzeltmeSecim;
public String robotSecimi;
    int oyuncu = 0;
    int pc = 0;



public void tasKagitMakasOyunu() {
    do {
        System.out.println("Oyuncu, lütfen bir secim yapınız -->> taş, kağıt veya makas");
        String secim = new Scanner(System.in).nextLine();
        if((secim.equals("taş"))|| (secim.equals("kağıt"))|| (secim.equals("makas"))) {
            duzeltmeSecim = secim.replace("ş", "s").replace("ğ", "g"
                    .replace("ı", "i"));

            Random random = new Random();
            int index = random.nextInt(oyunDizisi.length);
            String robotSecimi = oyunDizisi[index];
            System.out.println("PC " + robotSecimi + " seçti");

            if ((duzeltmeSecim.equals(tas) && robotSecimi.equals("makas")) || (duzeltmeSecim.equals(kagit) && robotSecimi.equals("taş"))
                    || (duzeltmeSecim.equals(makas) && robotSecimi.equals("kağıt"))) {
                oyuncu++;
                System.out.println("Oyuncu Kazandı!!!");
                System.out.println("Skor->> Oyuncu:" + oyuncu + " robot:" + pc);
            } else if ((duzeltmeSecim.equals(kagit) && robotSecimi.equals("kağıt")) || (duzeltmeSecim.equals(tas) && robotSecimi.equals("taş")) ||
                    (duzeltmeSecim.equals(makas) && robotSecimi.equals("makas"))) {
                System.out.println("Kazanan Olmadı ");
            } else {
                pc++;
                System.out.println("PC Kazandı!!!");
                System.out.println("Skor->> Oyuncu:" + oyuncu + " robot:" + pc);
            }
        }else {
            System.out.println("Lütfen geçerli bir seçim yapınız!!!");
        }

    } while (oyuncu !=3 && pc != 3);
    System.out.println("*******************************************");
    if (oyuncu ==3){
    System.out.println("Skor->> Oyuncu:" + oyuncu + " robot:" + pc);
    System.out.println("Tebrikler Oyuncu Kazandı");
    System.out.println("*******************************************");}
    else {
        System.out.println("Üzgünüm PC kazandı");
        System.out.println("Skor->> Oyuncu:" + oyuncu + " robot:" + pc);
        System.out.println("*******************************************");
    }
}

}



