package com.lovo.servlet.mybaits;

import org.junit.Test;

public class TConnection {
    @Test
public  void  Testa(){
    try {
        Class<?>c1=Class.forName("com.mysql.jdbc.Driver");
        System.out.printf(c1.toString());
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

}
@Test
    public void test(){
        System.out.printf("hellword");
    }
}
