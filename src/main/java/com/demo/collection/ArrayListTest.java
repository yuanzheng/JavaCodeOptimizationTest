package com.demo.collection;

import java.util.ArrayList;

public class ArrayListTest {

    public void addFromHeaderTest(int DataNum) {
        ArrayList<String> list = new ArrayList<String>(DataNum);
        int i = 0;

        long timeStart = System.currentTimeMillis();

        while (i < DataNum) {
            list.add(0, i + "aaavvv");
            i++;
        }
        long timeEnd = System.currentTimeMillis();

        System.out.println("ArrayList从集合头部位置新增元素花费的时间" + (timeEnd - timeStart));

    }


    public static void main(String[] args) {


        int times = Integer.parseInt(args[0]);

        ArrayListTest test = new ArrayListTest();
        test.addFromHeaderTest(times);
    }
}
