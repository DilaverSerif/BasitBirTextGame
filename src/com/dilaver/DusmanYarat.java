package com.dilaver;

import com.dilaver.Nesneler.Ayi;
import com.dilaver.Nesneler.COVID;
import com.dilaver.Nesneler.Corona;
import com.dilaver.Sınıflar.Dusman;

public class DusmanYarat {

    public static Dusman Yarat()
    {
            switch (main.Rastgele(3,1))
            {
                case 1:
                {
                    return AyiYarat();
                }
                case 2:
                {
                    return CoronaYarat();
                }
                default:
                    return AyiYarat();
            }

    }

    static Ayi AyiYarat()
    {
        Ayi ayi = new Ayi();
        ayi.setIsim("YARI AYI");
        ayi.setGuc(20);
        ayi.setCan(50);
        ayi.setZirh(40);
        ayi.setPara(10);
        ayi.setDeneyim(main.Rastgele(25,5));
        ayi.setMesafe(main.Rastgele(5,1));
        return ayi;
    }

    static Corona CoronaYarat()
    {
        Corona corona = new Corona();
        corona.setIsim("CORONA");
        corona.setGuc(20);
        corona.setCan(50);
        corona.setZirh(40);
        corona.setPara(10);
        corona.setDeneyim(main.Rastgele(25,5));
        corona.setMesafe(main.Rastgele(5,1));
        return corona;
    }

    static COVID coivdBoss()
    {
        COVID boss = new COVID();
        boss.setCan(350);
        boss.setGuc(20);
        boss.setDeneyim(25);
        boss.setZirh(0);

        return boss;
    }

}
