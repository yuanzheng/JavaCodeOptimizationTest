package com.demo.designpatterns.multiThreads_ContextLocalThread;

/** 设置上下文ID */
public class QueryIdAction2 {

    public void execute() {
        try {
            Thread.sleep(1000L);
            long id = Thread.currentThread().getId();
            ActionContext.getActionContext().getContext().setId(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
