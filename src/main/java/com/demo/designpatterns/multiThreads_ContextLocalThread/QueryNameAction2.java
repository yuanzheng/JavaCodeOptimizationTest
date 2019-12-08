package com.demo.designpatterns.multiThreads_ContextLocalThread;

/** 设置上下文名字 */
public class QueryNameAction2 {

    public void execute() {
        try {
            Thread.sleep(1000L);
            String name = Thread.currentThread().getName();
            ActionContext.getActionContext().getContext().setName(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
