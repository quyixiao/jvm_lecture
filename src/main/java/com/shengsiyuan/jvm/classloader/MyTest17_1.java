package com.shengsiyuan.jvm.classloader;

/**
 * @Classname MyTest17
 * @Description 关于命名空间的重要说明
 * 1、子加载器所加载的类都能够访问到父加载器所加载的类
 * 2、父加载器所加载的类无法访问到子加载器所加载的类
 * @Date 2019/8/4 13:07
 * @Created by Zhangyichao
 *

 *
 */

public class MyTest17_1 {

    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        // 从什么地方去加载类，显然这个类不是由 mytest16 加载的，并不是由 loader1 加载的，而是由系统类加载器加载的
        loader1.setPath("/Users/quyixiao/Desktop/");

        Class<?> clazz = loader1.loadClass("com.shengsiyuan.jvm.classloader.MySample");
        System.out.println("class =" + clazz.hashCode());
        Object object = clazz.newInstance();


    }
}
