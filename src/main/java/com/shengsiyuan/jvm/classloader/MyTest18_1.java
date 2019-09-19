package com.shengsiyuan.jvm.classloader;

/**
 * @Classname MyTest18_1
 * @Description MyTest18_1
 * @Date 2019/8/4 14:07
 * @Created by Zhangyichao
 */
public class MyTest18_1 {
    public static void main(String[] args) throws Exception {
        MyTest16 loader1=new MyTest16("loader1");
        loader1.setPath("/Users/quyixiao/Desktop/");

        Class<?> clazz=loader1.loadClass("com.shengsiyuan.jvm.classloader.MyTest1");

        System.out.println("class："+clazz.hashCode());
        System.out.println("------------------------------------------------------------------");
        System.out.println("class loader："+clazz.getClassLoader());
        System.out.println("class loader："+clazz.getClassLoader().getClass());
        System.out.println("==================================================================");
        System.out.println("class loader："+clazz.getClassLoader().getParent());
        System.out.println("class loader："+clazz.getClassLoader().getParent().getClass());
       // System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //System.out.println("class loader："+clazz.getClassLoader().getParent().getParent());
        //System.out.println("class loader："+clazz.getClassLoader().getParent().getParent().getClass());
    }

}
