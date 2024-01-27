package com.mert.myexamples.OOP_Bank_Example.entity;

public class Bank {
    Long id;
    String bankaAdi;
    double dolarAlisFiyat;
    double dolarSatisFiyat;

    double euroAlisFiyat;
    double euroSatisFiyat;

    double altinAlisFiyat;
    double altinSatisFiyat;

    double yillikKartUcreti;

    public Bank() {
    }

    public Bank(Long id, String bankaAdi, double dolarAlisFiyat, double dolarSatisFiyat, double euroAlisFiyat, double euroSatisFiyat, double altinAlisFiyat, double altinSatisFiyat, double yillikKartUcreti) {
        this.id = id;
        this.bankaAdi = bankaAdi;
        this.dolarAlisFiyat = dolarAlisFiyat;
        this.dolarSatisFiyat = dolarSatisFiyat;
        this.euroAlisFiyat = euroAlisFiyat;
        this.euroSatisFiyat = euroSatisFiyat;
        this.altinAlisFiyat = altinAlisFiyat;
        this.altinSatisFiyat = altinSatisFiyat;
        this.yillikKartUcreti = yillikKartUcreti;
    }

    public Bank(Long id, String bankaAdi, double dolarAlisFiyat, double dolarSatisFiyat, double yillikKartUcreti) {
        this.id = id;
        this.bankaAdi = bankaAdi;
        this.dolarAlisFiyat = dolarAlisFiyat;
        this.dolarSatisFiyat = dolarSatisFiyat;
        this.yillikKartUcreti = yillikKartUcreti;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public double getDolarAlisFiyat() {
        return dolarAlisFiyat;
    }

    public void setDolarAlisFiyat(double dolarAlisFiyat) {
        this.dolarAlisFiyat = dolarAlisFiyat;
    }

    public double getDolarSatisFiyat() {
        return dolarSatisFiyat;
    }

    public void setDolarSatisFiyat(double dolarSatisFiyat) {
        this.dolarSatisFiyat = dolarSatisFiyat;
    }

    public double getEuroAlisFiyat() {
        return euroAlisFiyat;
    }

    public void setEuroAlisFiyat(double euroAlisFiyat) {
        this.euroAlisFiyat = euroAlisFiyat;
    }

    public double getEuroSatisFiyat() {
        return euroSatisFiyat;
    }

    public void setEuroSatisFiyat(double euroSatisFiyat) {
        this.euroSatisFiyat = euroSatisFiyat;
    }

    public double getAltinAlisFiyat() {
        return altinAlisFiyat;
    }

    public void setAltinAlisFiyat(double altinAlisFiyat) {
        this.altinAlisFiyat = altinAlisFiyat;
    }

    public double getAltinSatisFiyat() {
        return altinSatisFiyat;
    }

    public void setAltinSatisFiyat(double altinSatisFiyat) {
        this.altinSatisFiyat = altinSatisFiyat;
    }

    public double getYillikKartUcreti() {
        return yillikKartUcreti;
    }

    public void setYillikKartUcreti(double yillikKartUcreti) {
        this.yillikKartUcreti = yillikKartUcreti;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bank{");
        sb.append("id=").append(id);
        sb.append(", bankaAdi='").append(bankaAdi).append('\'');
        sb.append(", dolarAlisFiyat=").append(dolarAlisFiyat);
        sb.append(", dolarSatisFiyat=").append(dolarSatisFiyat);
        sb.append(", euroAlisFiyat=").append(euroAlisFiyat);
        sb.append(", euroSatisFiyat=").append(euroSatisFiyat);
        sb.append(", altinAlisFiyat=").append(altinAlisFiyat);
        sb.append(", altinSatisFiyat=").append(altinSatisFiyat);
        sb.append(", yillikKartUcreti=").append(yillikKartUcreti);
        sb.append('}');
        return sb.toString();
    }
}
