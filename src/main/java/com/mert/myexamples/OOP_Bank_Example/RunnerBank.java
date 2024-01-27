package com.mert.myexamples.OOP_Bank_Example;

import com.mert.myexamples.OOP_Bank_Example.entity.Bank;
import com.mert.myexamples.OOP_Bank_Example.entity.Hesap;
import com.mert.myexamples.OOP_Bank_Example.entity.VadeliHesap;
import com.mert.myexamples.OOP_Bank_Example.entity.VadesizHesap;
import com.mert.myexamples.OOP_Bank_Example.repository.BankRepository;
import com.mert.myexamples.OOP_Bank_Example.repository.VadeliRepository;
import com.mert.myexamples.OOP_Bank_Example.repository.VadesizRepository;

public class RunnerBank {

    public static void main(String[] args) {


        Hesap vadesizHesap = new VadesizHesap();

        Bank banka = new Bank();


        banka.setBankaAdi("Akbank");
        banka.setId(1L);
        banka.setYillikKartUcreti(250);
        banka.setAltinAlisFiyat(100);
        banka.setDolarAlisFiyat(30);
        banka.setEuroAlisFiyat(32);
        banka.setAltinSatisFiyat(90);
        banka.setDolarSatisFiyat(28);
        banka.setEuroSatisFiyat(30);

        vadesizHesap.setBankId(1L);
        vadesizHesap.setId(1L);
        vadesizHesap.setHesapAdi("Vadesiz TL");
        vadesizHesap.setHesapCinsi("Dolar");
        vadesizHesap.setHesaptakiPara(30_000);

        Hesap vadeliHesap = new VadeliHesap(1L,1L,"Vadeli TL",
                "TL",50_000,6,2.51);

        BankRepository bankList = new BankRepository();
        bankList.add(banka);
        bankList.printList();

        VadesizRepository vadesizList = new VadesizRepository();
        vadesizList.add(vadesizHesap);
        vadesizList.printList();

        VadeliRepository vadeliList = new VadeliRepository();
        vadeliList.add(vadeliHesap);
        vadeliList.printList(vadeliHesap);


    }

    /** OUTPUT:
     * Bank{id=1, bankaAdi='Akbank', dolarAlisFiyat=30.0, dolarSatisFiyat=28.0, euroAlisFiyat=32.0, euroSatisFiyat=30.0, altinAlisFiyat=100.0, altinSatisFiyat=90.0, yillikKartUcreti=250.0}
     * Hesap{id=1, bankId=1, hesapAdi='Vadesiz TL', hesapCinsi='Dolar', hesaptakiPara=30000.0}
     * Hesap{id=1, bankId=1, hesapAdi='Vadeli TL', hesapCinsi='TL', hesaptakiPara=50000.0}
     */


}
