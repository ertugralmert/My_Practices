package com.mert.examples.methods;

public class DizideAdetBulupKarsilastirma {

    /**
     * void method ile return methodlar arasında farklar
     * void method da geri dönüş olmaz. başka yerde kullanamayız.
     * return moethodlarda alınan sonucu istediğimiz yerde kullanabiliriz
     */

    // dizi içerisinde 1 ve 4 ün adetini bulalalım. 1 sayısının adeti 4 sayısının adetinden büyük ise bize true değil
    // false dönsün
    // -> yani dizide kaçtane 4 ve 1 var onu bulup 1 lerin sayısı 4 lerden fazla ise false dönecek
    public static void main(String[] args) {

        int[] sayilar = {1,4,4,1,5,6,4,4,1,8};
        // -> tek method ile çözüm
        adetBulma(sayilar);
        System.out.println(adetBulma()); // -> output : true  çünkü 4 daha fazla

        // -> iki method ile çözüm
        adetBul(sayilar); // bak burada önce method ismini yazdım ve kırmızı ampul çıktı ona tıklarsam
        // otomatik taslak bir method oluşturur.





    }



    /**
     * ******************tek method ile çözüm*****
     * burada VarArgs ile bir method oluşturduk dizi methodu gibi düşünebiliriz.
     * oluşturduğumuz dizide birler ve dörtleri sayması için int değişken atadık
     * atanılan bu değişkenler her if komutunda eşit durumunda 1'er arttırıldı.
     * sonuc dörtler birlerden büyük ise true , değilse false olarak vermesi için tasarlandı
     * oluşturduğumuz methodun parantezine main methoddaki sayilar dizisini yazdığımızda sonuca ulaşırız
     * @param dizi
     * @return
     */
    public static boolean adetBulma(int ...dizi){
        int birler = 0;
        int dortler = 0;
        for ( int i = 0 ; i<dizi.length; i++){
            if ( dizi[i] == 1){
                birler++;
            }else if ( dizi[i]==4){
                dortler++;
            }
        } if (birler > dortler){
            return false;
        }else return true;

    }
//**************************************************2. yol -> ikili method
    /**
     * kırmızı ampulê basılarak otomatik method oluşturuldu
     * @param sayilar
     */

    public static void adetBul(int[] sayilar) {
        int sayac1 = 0;
        int sayac4 = 0;
        for (int i = 0; i < sayilar.length; i++){
            if (sayilar[i] == 1){
                sayac1++;

            }else if (sayilar[i] ==4){
                sayac4++;
            }
        }
        System.out.println("1lerin adedi: " + sayac1);
        System.out.println("4lerin adedi:  "+ sayac4);
        System.out.println(kontrol(sayac1,sayac4));
    }

    /**
     * ikinci method oluşturdul. ilk method'ta sayac1 ve sayac2 de aldık
     * @param sayac1
     * @param sayac4
     * @return
     */
    public static boolean kontrol(int sayac1,int sayac4){
        if (sayac1>sayac4){
            return true;
        }else {
            return false;
        }
    }
}
