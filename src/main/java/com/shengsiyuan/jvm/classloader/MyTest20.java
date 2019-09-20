package com.shengsiyuan.jvm.classloader;

import java.lang.reflect.Method;

/**
 * @Classname MyTest20
 * @Description MyTest20
 * @Date 2019/8/4 14:33
 * @Created by Zhangyichao
 */
public class MyTest20 {
    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        System.out.println(loader1);
        MyTest16 loader2 = new MyTest16("loader2");
        System.out.println(loader2);

        Class<?> clazz1 = loader1.loadClass("com.shengsiyuan.jvm.classloader.MyPerson");
        System.out.println(clazz1);
        Class<?> clazz2 = loader2.loadClass("com.shengsiyuan.jvm.classloader.MyPerson");
        System.out.println(clazz2);
        //结果为 true ,loader1 的父类是系统类加载器 , loader2 的父类也是系统类加载器，系统类加载器是可以加载系统类加载器
        // 系统类加载器就是 MyPerson 的定义类加载器,系统类加载器已经加载了 MyPerson 类，如果发现已经加载了，那就直接从
        // 系统类加载器中加载，class1 和 class2  ，这也是根本所在，系统类加载器加载，
        //
        System.out.println(clazz1 == clazz2);

        Object object1 = clazz1.newInstance();


        Object object2 = clazz2.newInstance();

        Method method = clazz1.getMethod("setMyPerson", Object.class);

        method.invoke(object1, object2);
    }
}
