package com.dilaver;

import com.dilaver.Enumlar.Mekan;
import com.dilaver.Nesneler.Dusman;
import com.dilaver.Nesneler.Oyuncu;

public class Mekanlar {

    public static void MekanaGore(Oyuncu Poyuncu)
    {
        switch (Poyuncu.getMekan())
        {
            case Zindan:
                Zindan(Poyuncu,DusmanYarat.Yarat());
                break;
            case Sehir:
                Sehir(Poyuncu);
                break;
        }
    }

    
    static void Sehir(Oyuncu Poyuncu)
    {
        Poyuncu.setCan(100);

        while (Poyuncu.getMekan() == Mekan.Sehir)
        {
            main.Konusmaci("SEHIRDESIN!NE YAPMAK ISTERSIN?!1)IKSIR AL 50 ALTIN!2)ZINDANA GIT");

            switch (main.SecenekGir())
            {
                case 1:
                    if (Poyuncu.getPara() >= 50)
                    {
                        Poyuncu.setPara(Poyuncu.getPara() - 50);
                        Poyuncu.setIksir(Poyuncu.getIksir() + 1);
                        main.Konusmaci("IKSIR SATIN ALDIN!SAHIP OLDUGUN IKSIR ADEDI: " +Poyuncu.getIksir() + "!");
                    }
                    else
                    {
                        main.Konusmaci("YETERLI PARAN YOK!");
                    }
                    break;
                case 2:
                    Poyuncu.setMekan(Mekan.Zindan);
                    MekanaGore(Poyuncu);
                    break;
            }
        }

    }

    static void Zindan(Oyuncu Poyuncu, Dusman Pdusman) throws IllegalStateException {
        main.Konusmaci("*****KAPISMA BASLIYOR RAKIBIN ISMI:"+Pdusman.getIsim()+"*****!");

        while (Poyuncu.getCan() > 0 & Pdusman.getCan() > 0) {
            Pdusman.Konus();
            Pdusman.CanGoster();
            MesafeGosterici(Pdusman.getMesafe());

            main.Konusmaci("NE YAPICAKSIN?!1-KAC!2-SALDIR!3-DUSMANA YAKLAS!4-IKSIR IC!");

            if (Pdusman.getMesafe() == 0)
            {
                Pdusman.Saldir(Poyuncu);
                main.Konusmaci("HASAR YEDIN!CANIN: " + Poyuncu.getCan() +"!");
            }
            else
            {
                Pdusman.Hareket();
            }

            switch (main.SecenekGir())
            {
                case 1:
                    if (main.Rastgele(5,1) == 4)
                    {
                        main.Konusmaci("KACTIN AFERIN!");
                        Poyuncu.setMekan(Mekan.Sehir);
                        MekanaGore(Poyuncu);
                    }
                    else
                    {
                        if (Pdusman.getMesafe() > 0)
                        {
                            Pdusman.Hareket();
                        }
                        main.Konusmaci("KAÇAMADIN!");
                    }
                    break;

                case 2:
                    switch (Poyuncu.getSinif())
                    {
                        case okcu:
                            Poyuncu.Saldir(Pdusman);
                            break;
                        case savasci:
                            if (Pdusman.getMesafe() > 0)
                            {
                                main.Konusmaci("MESAFE COK UZAK!");
                            }
                            else
                            {
                                Poyuncu.Saldir(Pdusman);
                            }

                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + Poyuncu.getSinif());
                    }

                break;

                case 3:
                    Pdusman.Hareket();
                    break;
                case 4:
                    Poyuncu.Iksiric();
                    break;

                default:
                    main.Konusmaci("EYVAH YANLIS BIR HAREKET YAPTIN DUSMAN YAKLASTI!");
            }

        }

        //region sonuc
        if (Poyuncu.getCan() <= 0)
        {
            main.Konusmaci("KAYBETTTIN SEHRE GERI DONUYORSUN!");
            Poyuncu.setMekan(Mekan.Sehir);
        }
        else if(Pdusman.getCan() >= 0)
        {
            Poyuncu.setPara(Poyuncu.getPara()+Pdusman.getPara());
            main.Konusmaci("DUSMANI YENDIN!SEHRE DONULUYOR!");
            Poyuncu.setMekan(Mekan.Sehir);
            MekanaGore(Poyuncu);
        }
        //endregion
    }

    static void MesafeGosterici(int mesafe) {

        if (mesafe <= 0)
        {
            main.Konusmaci("DUSMAN TAM ÖNÜNDE!");
        }
        else
        {
            main.Konusmaci("MESAFE:" +mesafe+" ");
        }

        String mesafem = "O";

        for(int i = 0; i < mesafe; i++)
        {
            mesafem += ("*");
        }

        main.Konusmaci(mesafem+"X!");
    }
}