package com.shengsiyuan.jvm.classloader;

/**
 * @Classname MyTest17
 * @Description 关于命名空间的重要说明
 * 1、子加载器所加载的类都能够访问到父加载器所加载的类
 * 2、父加载器所加载的类无法访问到子加载器所加载的类
 * @Date 2019/8/4 13:07
 * @Created by Zhangyichao
 */

public class MyTest17 {

    public static void main(String[] args) throws Exception {
        MyTest16 loader1 = new MyTest16("loader1");
        // 从什么地方去加载类，显然这个类不是由 mytest16 加载的，并不是由 loader1 加载的，而是由系统类加载器加载的
        loader1.setPath("/Users/quyixiao/Desktop/");

        Class<?> clazz = loader1.loadClass("com.shengsiyuan.jvm.classloader.MySample");
        System.out.println("class =" + clazz.hashCode());
            //如果注释掉该行，那么并不会实例化 MySample 对象，即 MySample 构造方法不会被调用
        // 因此不会实例化 MyCat对象，即没有对 MyCat 进行主动使用，这里就不会加载 myCat Class 了
        // 类加载器并不需要等到某个类被首次主动使用的时候再加载它
        // 类的加载
        // JVM 规范允许类的加载在预料某个类将要被使用时就预先加载它，如果在预先加载的过程中遇到了.class 让你说的缺失
        // 或者存在错误类加载器必须在程序首次主动使用该类时才报告错误（LinkageError 错误）
        // 如果一个程序一直没有被主动使用，那么这个类加载器就不会报错

       // Object object = clazz.newInstance();

    }
}
