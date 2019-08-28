package com.demo.classloading;

public class Sub2 {

    public static String subStr= "sub2 static string";
    static{
        System.out.println("sub2 static fields");
        System.out.println(subStr);
    }

    public Sub2(){
        System.out.println("sub2 instance initialization");
    }
}
