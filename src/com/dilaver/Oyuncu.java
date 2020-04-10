package com.dilaver;

import com.dilaver.Enumlar.Cinsiyet;
import com.dilaver.Enumlar.Mekan;
import com.dilaver.Enumlar.Sinif;
import com.dilaver.Interfaceler.DostEylemleri;

public class Oyuncu implements DostEylemleri {
    public static String isim;
    private Cinsiyet cinsiyet;
    private Sinif sinif;
    private int guc,can,zirh,iksir,para;
    private Mekan mekan;

    public Mekan getMekan() {
        return mekan;
    }

    public void setMekan(Mekan mekan) {
        this.mekan = mekan;
    }

    public void setPara(int para) {
        this.para = para;
    }

    public int getPara() {
        return para;
    }

    public void setGuc(int guc) {
        this.guc = guc;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public int getGuc() {
        return guc;
    }

    public void setZirh(int zirh) {
        this.zirh = zirh;
    }

    public int getZirh() {
        return zirh;
    }

    public Sinif getSinif() {
        return sinif;
    }

    public void setSinif(Sinif sinif) {
        this.sinif = sinif;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public void setIksir(int iksir) {
        this.iksir = iksir;
    }

    public int getIksir() {
        return iksir;
    }


    @Override
    public void Saldir(Dusman Pdusman) {

        Pdusman.setCan(Pdusman.getCan() - (getGuc() - Pdusman.getZirh()));
    }

    @Override
    public void Konus(String Pmetin) {
        main.Konusmaci(getIsim()+": " + Pmetin + "!");
    }

    @Override
    public void Iksiric() {
        if (getIksir() > 0)
        {
            setIksir(getIksir() - 1);
            setCan(getCan() + 20);
            main.Konusmaci("CANIN TAZELENDI: " + (getCan()-20) + ">" + getCan()+"!");
        }
        else
        {
            main.Konusmaci("EYVAH IKSIRIN YOK!");
        }
    }

    public void SinifAyalari()
    {
        setIsim(isim);
        setCinsiyet(cinsiyet);
        setSinif(sinif);

        switch(sinif)
        {
            case okcu:
                setCan(100);
                setZirh(10);
                setIksir(5);
                setGuc(50);
                setPara(50);
                break;
            case savasci:
                setCan(150);
                setZirh(15);
                setIksir(5);
                setGuc(50);
                setPara(50);
                break;
        }
    }

}
