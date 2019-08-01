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


    public static void addFromMidTest(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();
        int i=0;
        long timeStart=System.currentTimeMillis();
        while(i<DataNum)
        {
            int temp = list.size();
            list.add(temp/2, i+"aaavvv");
            i++;
        }
        long timeEnd=System.currentTimeMillis();

        System.out.println("LinkedList从集合中间位置新增元素花费的时间"+(timeEnd-timeStart));
    }

    public static void addFromTailTest(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();
        int i=0;
        long timeStart=System.currentTimeMillis();
        while(i<DataNum)
        {
            list.addLast(i+"aaavvv");
            i++;
        }
        long timeEnd=System.currentTimeMillis();

        System.out.println("LinkedList从集合尾部位置新增元素花费的时间"+(timeEnd-timeStart));
    }


    public static void deleteFromHeaderTest(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();
        int i=0;

        while(i<DataNum)
        {
            list.add(i+"aaavvv");
            i++;
        }


        long timeStart=System.currentTimeMillis();

        i=0;
        while(i<DataNum)
        {
            list.removeFirst();
            i++;
        }

        long timeEnd=System.currentTimeMillis();

        System.out.println("LinkedList从集合头部位置删除元素花费的时间"+(timeEnd-timeStart));
    }

    public static void deleteFromMidTest(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();

        int i=0;
        while(i<DataNum)
        {
            list.add(i+"aaavvv");
            i++;
        }

        long timeStart=System.currentTimeMillis();

        i=0;
        while(i<DataNum)
        {
            int temp = list.size();
            list.remove(temp/2);
            i++;
        }

        long timeEnd=System.currentTimeMillis();

        System.out.println("LinkedList从集合中间位置删除元素花费的时间"+(timeEnd-timeStart));
    }

    public static void deleteFromTailTest(int DataNum)
    {
        LinkedList<String> list=new LinkedList<String>();
        int i=0;
        while(i<DataNum)
        {
            list.add(i+"aaavvv");
            i++;
        }

        long timeStart=System.currentTimeMillis();

        i=0;
        while(i<DataNum)
        {
            list.removeLast();
            i++;
        }


        long timeEnd=System.currentTimeMillis();

        System.out.println("LinkedList从集合尾部位置删除元素花费的时间"+(timeEnd-timeStart));
    }


}
