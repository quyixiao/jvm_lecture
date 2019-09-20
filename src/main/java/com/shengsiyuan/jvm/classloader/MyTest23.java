package com.shengsiyuan.jvm.classloader;

import sun.misc.Launcher;

/**
 * @Classname MyTest23
 * @Description 1、在运行期间，一个Java类是由该类的完全限定名（binary name，二进制名）和用于加载类的定义类加载器（defining loader）所共同决定的。
 * 如果同样名字（既相同的完全限定名）的类是由两个不同的加载器所加载，那么这些类就是不同的，即便.class文件的字节码完全一样，
 * 并且从相同的位置加载亦是如此
 * <p>
 * 2、在Oracle的Hotspot实现中，系统属性sun.boot.class.path如果修改错了，则运行会出错，提示如下错误信息：
 * Error occurred during initialization of VM
 * java/lang/NoClassDefFoundError: java/lang/Object
 * <p>
 * 3、内建于JVM中的启动类加载器会加载java.lang.ClassLoader以及其他的Java平台类，
 * 当JVM启动时，一块特殊的机器码会运行，它会加载扩展类加载器与系统类加载器，
 * 这块特殊的机器码叫做启动类加载器（Bootstrap）。
 * <p>
 * 启动类加载器并不是Java类，而其他的加载器则都是Java类，
 * 启动类加载器是特定于平台的机器指令，它负责开启整个加载过程。
 * <p>
 * 所有类加载器（除了启动类加载器）都被实现为Java类。不过，总归要有一个组件来加载第一个Java类加载器，从而让整个过程能够顺利
 * 进行下去，加载第一个纯Java类加载器就是启动类加载器的职责。
 * <p>
 * 启动类加载器还会负责加载JRE正常运行所需要得基本组件，这包括java.util与java.lang包中的类等等。
 * @Date 2019/8/4 23:19
 * @Created by Zhangyichao
 */
public class MyTest23 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println();
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println();
        System.out.println(System.getProperty("java.class.path"));

        /***
         * 内建于 JVM 中的启动类加载器会加载 java.lang.Classloader 以及其他的 Java平台类，当 jvm 启动时，一块特殊的机器码会运行
         * ,它会加载扩展类加载器与系统类加载器，这块特殊的机器码叫做启动类加载器（Bootstrap）
         * 启动类加载器并不是java类，而是其他的加载器则都是 java 类
         * 启动类加载器是特定于平台的机器命令，它负责开启整个加载过程
         * 所有的类加载器（除了启动类加载器）都以实现为 java 类，不过，总归要有一个组件来加载第一个 Java 类加载器，从而让整个过程能够
         * 顺利进行下去，加载第一个纯 java 类加载器就是启动类加载器的职责
         *
         * 启动类加载器还会负责加载贷 JRE 正常运行所需要的基本组件 ，这包括 java.util 与 java.lang 包中的类等等
         *
         */

        System.out.println(ClassLoader.class.getClassLoader());

        // 扩展类加载器与系统类加载器也是有启动类加载器所加载的
        System.out.println(Launcher.class.getClassLoader());

        // System.out.println(MyTest23.class.getClassLoader().getClass().getClassLoader());

    }
}
