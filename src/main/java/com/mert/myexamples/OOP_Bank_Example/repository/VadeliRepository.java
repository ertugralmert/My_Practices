package com.mert.myexamples.OOP_Bank_Example.repository;

import com.mert.myexamples.OOP_Bank_Example.entity.Hesap;

public class VadeliRepository extends BaseRepository{

    Hesap[] vadeliler = new Hesap[100];
    int size = 0;

    public void add(Hesap para){
        vadeliler[size++] = para;
    }

    public void printList(Hesap vadeliHesap){
        for ( int i = 0; i< size; i++){
            System.out.println(vadeliler[i]);
        }
    }



}
