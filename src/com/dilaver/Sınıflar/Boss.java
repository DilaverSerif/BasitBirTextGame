package com.dilaver.Sınıflar;
import com.dilaver.Interfaceler.Saldirgan;
import com.dilaver.Nesneler.Oyuncu;

import static com.dilaver.main.oyuncu;


public class Boss implements Saldirgan {

    int guc,deneyim,can,zirh,mesafe;

    public void setZirh(int zirh) {
        this.zirh = zirh;
    }

    public int getZirh() {
        return zirh;
    }

    public int getMesafe() {
        return mesafe;
    }

    public void setMesafe(int mesafe) {
        this.mesafe = mesafe;
    }

    public int getGuc() {
        return guc;
    }


    public void setGuc(int guc) {
        this.guc = guc;
    }

    public int getDeneyim() {
        return deneyim;
    }

    public void setDeneyim(int deneyim) {
        this.deneyim = deneyim;
    }

    public int getCan() {
        return can;
    }


    public void setCan(int can) {
        this.can = can;
    }

    @Override
    public void Bilgilendirme() {

    }

    @Override
    public void Saldir(Oyuncu hedef) {
        oyuncu.setCan(

                oyuncu.getCan() - (oyuncu.getCan() / 4) + getGuc()

        );
    }

    @Override
    public void Hareket() {

        if (getMesafe() > 0)
        {
            mesafe = 0;
        }

    }
}
