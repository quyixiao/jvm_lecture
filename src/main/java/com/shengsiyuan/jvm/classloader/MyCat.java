package com.shengsiyuan.jvm.classloader;

/**
 * @Classname MyCat
 * @Description MyCat
 * @Date 2019/8/4 13:08
 * @Created by Zhangyichao
 */
public class MyCat {
    public  MyCat(){
        System.out.println("MyCat is loder by ："+this.getClass().getClassLoader());




//        System.out.println("From MyCat："+MySample.class);
//        System.out.println("From MyCat："+MySample.class.hashCode());
    }
}
