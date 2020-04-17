package com.dilaver;
import com.dilaver.Enumlar.Mekan;
import com.dilaver.Nesneler.Baykus;
import com.dilaver.Sınıflar.Dusman;

public class Mekanlar {
    public static void MekanaGore()
    {
        switch (main.oyuncu.getMekan())
        {
            case Zindan:
                Zindan(DusmanYarat.Yarat());
                break;
            case Sehir:
                Sehir();
                break;
            default:
                System.out.print("HATAA");
                break;
        }
    }

    static void Sehir()
    {
        main.oyuncu.setCan(100);

        while (main.oyuncu.getMekan() == Mekan.Sehir)
        {
            main.Konusmaci("SEHIRDESIN!NE YAPMAK ISTERSIN?!1)IKSIR AL 50 ALTIN!2)ZINDANA GIT!3)PET SATIN AL 100 ALTIN!");

            switch (main.SecenekGir())
            {
                case 1:
                    if (main.oyuncu.getPara() >= 50)
                    {
                        main.oyuncu.setPara(main.oyuncu.getPara() - 50);
                        main.oyuncu.setIksir(main.oyuncu.getIksir() + 1);
                        main.Konusmaci("IKSIR SATIN ALDIN!SAHIP OLDUGUN IKSIR ADEDI: " +main.oyuncu.getIksir() + "!");
                    }
                    else
                    {
                        main.Konusmaci("YETERLI PARAN YOK!");
                    }
                    break;
                case 2:
                    main.oyuncu.setMekan(Mekan.Zindan);
                    MekanaGore();
                    break;
                case 3:
                    if (main.oyuncu.getPara() >= 10)
                    {
                        main.Konusmaci("PET SATIN ALDIN!");
                        main.oyuncu.setPara(main.oyuncu.getPara() - 10);
                        main.oyuncu.setPet(new Baykus());
                    }
                    else
                    {
                        main.Konusmaci("YETERLI PARAN YOK!");
                    }
                    break;
                default:
                    System.out.print("HATAA");
                    break;

            }
        }

    }

    static void Zindan(Dusman Pdusman){
        main.Konusmaci("*****KAPISMA BASLIYOR RAKIBIN ISMI:"+Pdusman.getIsim()+"*****!");
        Pdusman.Konus();

        while (main.oyuncu.getCan() > 0 & Pdusman.getCan() > 0) {
            Pdusman.Bilgilendirme();
            MesafeGosterici(Pdusman.getMesafe());

            main.Konusmaci("NE YAPICAKSIN?!1-KAC!2-SALDIR!3-DUSMANA YAKLAS!4-IKSIR IC!");

            if (Pdusman.getMesafe() == 0)
            {
                Pdusman.Saldir(main.oyuncu);
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
                        main.oyuncu.setMekan(Mekan.Sehir);
                        MekanaGore();
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
                    switch (main.oyuncu.getSinif())
                    {
                        case okcu:
                            main.oyuncu.Saldir(Pdusman);
                            break;
                        case savasci:
                            if (Pdusman.getMesafe() > 0)
                            {
                                main.Konusmaci("MESAFE COK UZAK!");
                            }
                            else
                            {
                                main.oyuncu.Saldir(Pdusman);
                            }

                            break;
                        default:
                            System.out.print("HATAA");
                            break;
                    }

                    if (main.oyuncu.getPet() != null)
                    {
                       main.oyuncu.getPet().Saldir(Pdusman);
                       main.oyuncu.getPet().Bilgilendirme();
                    }

                break;

                case 3:
                    Pdusman.Hareket();
                    break;
                case 4:
                    main.oyuncu.Iksiric();
                    break;

                default:
                    main.Konusmaci("EYVAH YANLIS BIR HAREKET YAPTIN DUSMAN YAKLASTI!");
            }

            main.oyuncu.Bilgilendirme();

        }

        //region sonuc
        if (main.oyuncu.getCan() <= 0)
        {
            main.Konusmaci("KAYBETTTIN SEHRE GERI DONUYORSUN!");
            main.oyuncu.setMekan(Mekan.Sehir);
        }
        else if(Pdusman.getCan() >= 0)
        {
            main.oyuncu.setPara(main.oyuncu.getPara()+Pdusman.getPara());
            main.Konusmaci("DUSMANI YENDIN!SEHRE DONULUYOR!");
            main.oyuncu.DeneyimHesapla(Pdusman.getDeneyim());
            main.Konusmaci("KAZANDIGIN PARA:" + Pdusman.getPara()+"!"+
            "KAZANDIGIN DENEYIM 100/" + main.oyuncu.getDeneyim() +"!");

            main.oyuncu.setMekan(Mekan.Sehir);
            MekanaGore();
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