package com.demo.designpatterns.multiThreads_Context;

import java.util.stream.IntStream;

public class ExecutionTask {

    /** 执行方法, 实现方式就是在每个函数中新增这个中间结果的参数，依次传递下去。
     *
     * 这种方式太笨拙了，每次调用方法时，都需要传入 Context 作为参数，而且影响一些中间公共方法的封装。
     *
     * 那能不能设置一个全局变量呢？如果是在多线程情况下，需要考虑线程安全，这样的话就又涉及到了锁竞争！
     *
     * 其实我们还可以使用 ThreadLocal 实现上下文。ThreadLocal 是线程本地变量，可以实现多线程的数据隔离。
     *
     * ThreadLocal 为每一个使用该变量的线程都提供一份独立的副本，线程间的数据是隔离的，每一个线程只能访问各自内部的副本变量。
     *
     */
    public class TestTask implements Runnable {

        private QueryNameAction queryNameAction = new QueryNameAction();
        private QueryIdAction queryIdAction = new QueryIdAction();

        public void run() {
            final Context context = new Context();
            queryNameAction.execute(context);
            System.out.println("The name query successful");
            queryIdAction.execute(context);
            System.out.println("The id query successful");

            System.out.println("The Name is " + context.getName() + " and id " + context.getId());
        }
    }

    public static void main(String[] args) {
        IntStream.range(1, 5).forEach(i -> new Thread(new ExecutionTask().new TestTask()).start());
    }
}

