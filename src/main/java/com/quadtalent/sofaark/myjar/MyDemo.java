package com.quadtalent.sofaark.myjar;

/**
 * @author wanglei
 * @since 2021/10/8 2:19 下午
 */
public class MyDemo {

    public MyDemo(){};

    public void test1(){
        System.out.println("----------myjar v1 start-----------");
        System.out.println("myjar v1 classloader=" + this.getClass().getClassLoader());
        System.out.println("----------myjar v1 end-----------");
    }

}
