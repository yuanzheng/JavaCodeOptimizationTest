package com.demo.designpatterns.multiThreads;

/** 设置上下文名字 */
public class QueryNameAction {

    public void execute(Context context) {
        try {
            Thread.sleep(1000L);
            String name = Thread.currentThread().getName();
            context.setName(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
