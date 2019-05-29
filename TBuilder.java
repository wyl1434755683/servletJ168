package com.lovo.servlet.mybaits;

import com.lovo.servlet.mybaits.factory.FactoryBMW;
import com.lovo.servlet.mybaits.factory.IBMW;
import org.junit.Test;

public class TBuilder {
    @Test
    public  void  testBuilder(){
        //构建者开始构建
        HeroBuilder hb=new VNVIPBuilder();
        //生产者
        MakeHero mk=new MakeHero(hb);
          mk.bulid();//开始构建
        Hero h=mk.getHero();//获得构建好的英雄
        System.out.printf(h.getKill()+","+h.getKien());
    }
    @Test
    public void  testFactory(){
        FactoryBMW fb=new FactoryBMW();
       IBMW bmw = fb.createBMW(1);
        System.out.printf(bmw.carName());
    }
}
