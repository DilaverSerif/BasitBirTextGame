package com.dilaver.Sınıflar;

import com.dilaver.Interfaceler.Saldirgan;
import com.dilaver.Nesneler.Oyuncu;
import com.dilaver.main;

public class Dusman implements Saldirgan {
    String isim;
    int guc,zirh,can,mesafe,para,deneyim;

    public int getDeneyim() {
        return deneyim;
    }

    public void setDeneyim(int deneyim) {
        this.deneyim = deneyim;
    }

    public int getGuc() {
        return guc;
    }

    public void setGuc(int guc) {
        this.guc = guc;
    }

    public int getPara() {
        return para;
    }

    public void setZirh(int zirh) {
        this.zirh = zirh;
    }

    public void setPara(int para) {
        this.para = para;
    }

    public int getZirh() {
        return zirh;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public int getCan() {
        return can;
    }

    public int getMesafe() {
        return mesafe;
    }

    public void setMesafe(int mesafe) {
        this.mesafe = mesafe;
    }

    @Override
    public void Bilgilendirme() {
        String hp = "";
        for (int i = 0; i < getCan()/10; i++)
        {
            hp += "#";
        }
        main.Konusmaci("Dusmanin Cani:" + hp + " ("+getCan()+")!"+"GUCU: " + getGuc() + " ZIRHI: "+getZirh()+"!");

    }

    @Override
    public void Saldir(Oyuncu oyuncu) {
        oyuncu.setCan(oyuncu.getCan() - (getGuc() - oyuncu.getZirh()));
    }

    @Override
    public void Hareket() {
        if (getMesafe() > 0)
        {
            mesafe -= 1;
        }
    }

    public void Konus()
    {

    }

}
