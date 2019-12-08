package com.demo.designpatterns.multiThreads;

/** 设置上下文ID */
public class QueryIdAction {

    public void execute(Context context) {
        try {
            Thread.sleep(1000L);
            long id = Thread.currentThread().getId();
            context.setId(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
