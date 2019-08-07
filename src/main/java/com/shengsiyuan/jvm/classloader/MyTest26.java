package com.shengsiyuan.jvm.classloader;

/**
 * @Classname MyTest26
 * @Description
 * 线程上下文类加载器的一般使用模式（获取-使用-还原）
 *
 * ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
 * try{
 *     Thread.currentThread().setContextClassLoader(targetTccl);
 *     MyMethod();
 * }finally{
 *     Thead.currentThred().setContextClassLoader(classLoader);
 * }
 *
 * MyMethod里面则调用了Thread.currentThread().getContextClassLoader()，获取当前线程的上下文类加载器做某些事情。
 * 如果一个类由类加载器A加载，那么这个类的依赖类也是由相同的类加载器加载的（如果该依赖类之前没有被加载过的话）
 *
 * ContextClassLoader的作用就是为了破坏Java的类加载委托机制。
 *
 * @Date 2019/8/7 8:40
 * @Created by Zhangyichao
 */
public class MyTest26 {
    public static void main(String[] args) {

    }
}
