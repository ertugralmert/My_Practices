package com.mert.myexamples.OOP_Bank_Example.entity;

public class Hesap {

    Long id;

    Long bankId;
    String hesapAdi;
    String hesapCinsi;

    double hesaptakiPara;

    public Hesap() {
    }

    public Hesap(Long id, Long bankId, String hesapAdi, String hesapCinsi, double hesaptakiPara) {
        this.id = id;
        this.bankId = bankId;
        this.hesapAdi = hesapAdi;
        this.hesapCinsi = hesapCinsi;
        this.hesaptakiPara = hesaptakiPara;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getHesapAdi() {
        return hesapAdi;
    }

    public void setHesapAdi(String hesapAdi) {
        this.hesapAdi = hesapAdi;
    }

    public String getHesapCinsi() {
        return hesapCinsi;
    }

    public void setHesapCinsi(String hesapCinsi) {
        this.hesapCinsi = hesapCinsi;
    }

    public double getHesaptakiPara() {
        return hesaptakiPara;
    }

    public void setHesaptakiPara(double hesaptakiPara) {
        this.hesaptakiPara = hesaptakiPara;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hesap{");
        sb.append("id=").append(id);
        sb.append(", bankId=").append(bankId);
        sb.append(", hesapAdi='").append(hesapAdi).append('\'');
        sb.append(", hesapCinsi='").append(hesapCinsi).append('\'');
        sb.append(", hesaptakiPara=").append(hesaptakiPara);
        sb.append('}');
        return sb.toString();
    }
}
