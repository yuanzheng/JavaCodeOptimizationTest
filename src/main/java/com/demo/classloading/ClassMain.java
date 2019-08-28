package com.demo.classloading;

public class ClassMain {

    static{
        i=0;
    }
    private static int i=1;

    /*
    static{
        i=0;
    }
     */
    public static void main(String[] args) {

        System.out.println(i);

        /**
         * 收集所有类初始化代码，包括静态变量赋值语句、静态代码块、静态方法，收集在一起成为 <clinit>() 方法。
         *
         * 初始化的顺序和 Java 源码从上到下的顺序一致。
         */
        System.out.println("sub main");
        //new Sub();

        System.out.println("Class forName:");
        try {
            System.out.println("初始化静态变量和静态代码块: ");

            Class test = Class.forName("com.demo.classloading.Sub");
            System.out.println("构造函数 初始化：");
            test.newInstance();

        } catch (ClassNotFoundException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("\nClass loader:");
        try {
            ClassLoader loader = ClassLoader.getSystemClassLoader();
            loader.loadClass("com.demo.classloading.Sub2");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
    }
}
