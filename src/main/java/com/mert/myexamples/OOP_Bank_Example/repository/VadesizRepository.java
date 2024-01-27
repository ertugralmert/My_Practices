package com.mert.myexamples.OOP_Bank_Example.repository;

import com.mert.myexamples.OOP_Bank_Example.entity.Hesap;
import com.mert.myexamples.OOP_Bank_Example.entity.VadeliHesap;
import com.mert.myexamples.OOP_Bank_Example.entity.VadesizHesap;

public class VadesizRepository  extends BaseRepository{

    Hesap[] vadesizler = new Hesap[100];
    int size = 0;

    public void add(Hesap para){
        vadesizler[size++] = para;
    }

    public void printList(){
        for ( int i = 0; i< size; i++){
            System.out.println(vadesizler[i]);
        }
    }
}
