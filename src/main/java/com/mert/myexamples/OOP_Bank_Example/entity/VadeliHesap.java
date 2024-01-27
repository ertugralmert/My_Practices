package com.mert.myexamples.OOP_Bank_Example.entity;

public class VadeliHesap extends Hesap{


    double vadeTutari;
    double faizTutari;

    public double faizGetirisi (double hesaptakiPara, double vadeTutari){
        double faizgetiri = hesaptakiPara*vadeTutari;
        return faizgetiri;
    }

    public VadeliHesap() {

    }

    public VadeliHesap(Long id, Long bankId, String hesapAdi, String hesapCinsi, double hesaptakiPara, double vadeTutari, double faizTutari) {
        super(id, bankId, hesapAdi, hesapCinsi, hesaptakiPara);
        this.vadeTutari = vadeTutari;
        this.faizTutari = faizTutari;
    }

    public double getVadeTutari() {
        return vadeTutari;
    }

    public void setVadeTutari(double vadeTutari) {
        this.vadeTutari = vadeTutari;
    }

    public double getFaizTutari() {
        return faizTutari;
    }

    public void setFaizTutari(double faizTutari) {
        this.faizTutari = faizTutari;
    }
}
