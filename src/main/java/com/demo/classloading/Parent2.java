package com.demo.classloading;

public class Parent2 {
    public static String parentStr= "parent2 static string";
    static{
        System.out.println("parent2 static fields");
        System.out.println(parentStr);
    }
    public Parent2(){
        System.out.println("parent2 instance initialization");
    }
}
