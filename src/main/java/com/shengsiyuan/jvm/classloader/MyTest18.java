package com.shengsiyuan.jvm.classloader;

/**
 * @Classname MyTest18
 * @Description MyTest18
 * @Date 2019/8/4 14:05
 * @Created by Zhangyichao
 *
 *  * BootstrapClassLoader Loader JRE/lib/rt.jar 或者-XbbotClasspath 选项指定的一个 jar 包
 * ExtensionClassLoader Load JRE/lib/ext/*.jar 指定的目录下的 jar 包
 * AppClassLoader   LoadClassPath 或-Djava.class.path 所指定的目录下的类和 jar 包
 * CustomClassLoader 通过 java.lang.ClassLoader 的子类自定义的加载 Class
 *
 */
public class MyTest18 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println("==========================================");
        System.out.println(System.getProperty("java.class.path"));
    }
}
