package com.mert.myexamples.OOP_Bank_Example.entity;

public class VadesizHesap  extends Hesap{
    public VadesizHesap() {
    }

    public VadesizHesap(Long id, Long bankId, String hesapAdi, String hesapCinsi, double hesaptakiPara) {
        super(id, bankId, hesapAdi, hesapCinsi, hesaptakiPara);
    }
}
