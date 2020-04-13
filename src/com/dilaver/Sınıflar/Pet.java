package com.dilaver.Sınıflar;

import com.dilaver.Interfaceler.Dost;
import com.dilaver.Sınıflar.Dusman;
import com.dilaver.main;

public class Pet implements Dost {
    int guc;

    public void setGuc(int guc) {
        this.guc = guc;
    }

    public int getGuc() {
        return guc;
    }

    @Override
    public void Saldir(Dusman Pdusman) {
        Pdusman.setCan(Pdusman.getCan() - 5);
    }

    @Override
    public void Bilgilendirme() {
        main.Konusmaci("/*PETIN SALDIRDI!*/");
    }

    @Override
    public void Iksiric() {

    }

    public void Konus()
    {

    }
}
