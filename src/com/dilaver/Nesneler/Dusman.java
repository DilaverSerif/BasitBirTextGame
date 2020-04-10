package com.dilaver.Nesneler;

import com.dilaver.Interfaceler.DusmanEylemleri;
import com.dilaver.main;

public class Dusman implements DusmanEylemleri {
    String isim;
    int guc,zirh,can,mesafe,para;

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
    public void CanGoster() {
        String hp = "";
        for (int i = 0; i < getCan(); i++)
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
    @Override
    public void Konus()
    {

    }

}
