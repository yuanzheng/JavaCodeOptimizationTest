package com.demo.collection;

import java.util.LinkedList;

public class LinkedListTest {


    public static void addFromHeaderTest(int DataNum) {
        LinkedList<String> list=new LinkedList<String>();
        int i=0;
        long timeStart=System.currentTimeMillis();
        while(i<DataNum)
        {
            list.addFirst(i+"aaavvv");
            i++;
        }
        long timeEnd=System.currentTimeMillis();

        System.out.println("LinkedList从集合头部位置新增元素花费的时间"+(timeEnd-timeStart));
    }


    public static void main(String[] args) {

        int times = Integer.parseInt(args[0]);

        LinkedListTest test = new LinkedListTest();
        test.addFromHeaderTest(times);

    }
}
