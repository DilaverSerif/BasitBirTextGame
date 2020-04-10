package com.dilaver;

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
        corona.setMesafe(main.Rastgele(5,1));
        return corona;
    }

}
