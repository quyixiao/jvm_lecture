package com.shengsiyuan.jvm.classloader;

/**
 * @Classname MyTest7
 * @Description 不同的类加载器，由不同的加载器加载
 * @Date 2019/7/31 7:39
 * @Created by Zhangyichao
 * void main(){
 *     public void main(String [] args){
 *
 *     }
 * }
 *
 */
public class MyTest7 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz=Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        Class<?> clazz2=Class.forName("com.shengsiyuan.jvm.classloader.C");
        System.out.println(clazz2);
    }
}

class C{

}
