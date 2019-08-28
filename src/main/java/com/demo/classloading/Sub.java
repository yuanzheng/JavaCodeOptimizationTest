package com.demo.classloading;



public class Sub extends Parent{
    public static String subStr= "sub static string";
    static{
        System.out.println("sub static fields");
        System.out.println(subStr);
    }

    public Sub(){
        System.out.println("sub instance initialization");
    }

}