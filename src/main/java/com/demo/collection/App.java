package com.demo.collection;

public class App {



    public static void main(String[] args) {

        int times = 100000;
        System.out.println("新增元素:");
        ArrayListTest.addFromHeaderTest(times);
        LinkedListTest.addFromHeaderTest(times);

        ArrayListTest.addFromMidTest(times);
        LinkedListTest.addFromMidTest(times);

        ArrayListTest.addFromTailTest(times);
        LinkedListTest.addFromTailTest(times);

        System.out.println("---------------------------");
        System.out.println("删除元素");
        ArrayListTest.deleteFromHeaderTest(times);
        LinkedListTest.deleteFromHeaderTest(times);

        ArrayListTest.deleteFromMidTest(times);
        LinkedListTest.deleteFromMidTest(times);

        ArrayListTest.deleteFromTailTest(times);
        LinkedListTest.deleteFromTailTest(times);

        System.out.println("---------------------------");

    }
}
