package com.mert.myexamples.OOP_Bank_Example.repository;

import com.mert.myexamples.OOP_Bank_Example.entity.Bank;

public class BankRepository extends BaseRepository {

    Bank[] bankalar = new Bank[100];
    int size = 0;

    public void add(Bank banka){
        bankalar[size++] = banka;
    }

    public void printList(){
        for ( int i = 0; i< size; i++){
            System.out.println(bankalar[i]);
        }
    }



}
