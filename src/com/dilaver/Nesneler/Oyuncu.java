package com.dilaver.Nesneler;

import com.dilaver.Enumlar.Cinsiyet;
import com.dilaver.Enumlar.Mekan;
import com.dilaver.Enumlar.Sinif;
import com.dilaver.Interfaceler.Dost;
import com.dilaver.Sınıflar.Dusman;
import com.dilaver.Sınıflar.Pet;
import com.dilaver.main;

public class Oyuncu implements Dost {
    public static String isim;
    private Cinsiyet cinsiyet;
    private Sinif sinif;
    private int guc,can,zirh,iksir,para,deneyim;
    private Mekan mekan;
    private Pet pet;

    public Mekan getMekan() {
        return mekan;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
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

    public int getDeneyim() {
        return deneyim;
    }

    public void setDeneyim(int deneyim) {
        this.deneyim = deneyim;
    }

    @Override
    public void Saldir(Dusman Pdusman) {

        Pdusman.setCan(Pdusman.getCan() - (getGuc() - Pdusman.getZirh()));
    }

    @Override
    public void Bilgilendirme() {

        String hp = "";
        for (int i = 0; i < getCan()/10; i++)
        {
            hp += "*";
        }
        main.Konusmaci("Canin:" + hp + " ("+getCan()+")!");
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

    public void DeneyimHesapla(int gelenDeneyim)
    {
        setDeneyim(getDeneyim() + gelenDeneyim);
        if (getDeneyim() >= 100)
        {
            setDeneyim(0);
            setCan(getCan() + 10);
            setGuc(getGuc() + 10);
            setZirh(getZirh() + 10);
        }
    }

}
