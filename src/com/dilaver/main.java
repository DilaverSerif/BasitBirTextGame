package com.dilaver;

import com.dilaver.Enumlar.Cinsiyet;
import com.dilaver.Enumlar.Mekan;
import com.dilaver.Enumlar.Sinif;

import java.util.Random;
import java.util.Scanner;

public class main
{
    private static Scanner tara = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[]args){
        Oyuncu oyuncu = new Oyuncu();
        main.Konusmaci("OYUN HOŞGELDİN!ILK ONCE ISMINI OGRENELIM...!");
        oyuncu.setIsim(tara.next());
        main.Konusmaci(oyuncu.getIsim().toUpperCase() + " CINSIYETINI OGRENEBILIRMIYIM?!1)KADIN 2)ERKEK");
        int cinsiyet = SecenekGir();

        switch (cinsiyet)
        {
            case 1:
                oyuncu.setCinsiyet(Cinsiyet.kadin);
                break;
            case 2:
                oyuncu.setCinsiyet(Cinsiyet.erkek);
                break;
        }

        main.Konusmaci("PEKALA " +oyuncu.getIsim().toUpperCase()+" ŞİMDİ KARAKTERININ SINIFINI SEÇ!1)SAVASCI 2)OKCU");
        int sinif = SecenekGir();

        switch (sinif)
        {
            case 1:
                oyuncu.setSinif(Sinif.savasci);
                break;
            case 2:
                oyuncu.setSinif(Sinif.okcu);
                break;
        }
        oyuncu.SinifAyalari();
        oyuncu.setMekan(Mekan.Sehir);
        Mekanlar.MekanaGore(oyuncu);



    }


    //region Staticler
    public static void Konusmaci(String konus)
    {
        boolean var = konus.indexOf("!") != 0;

        if (!var) return;

        String yeniKonus = konus.replaceAll("!","\n");

        System.out.print(yeniKonus);
    }

    public static int SecenekGir()
    {
        return tara.nextInt();
    }

    public static int Rastgele(int max,int min)
    {
        return random.nextInt((max - min) + 1) + min;
    }
    //endregion
}
