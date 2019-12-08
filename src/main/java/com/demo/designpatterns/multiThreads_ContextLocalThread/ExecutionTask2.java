package com.demo.designpatterns.multiThreads_ContextLocalThread;


import java.util.stream.IntStream;

public class ExecutionTask2 {

    public class TestTask implements Runnable {
        private QueryNameAction2 queryNameAction = new QueryNameAction2();
        private QueryIdAction2 queryIdAction = new QueryIdAction2();

        public void run() {
            queryNameAction.execute();//设置线程名
            System.out.println("The name query successful");
            queryIdAction.execute();//设置线程ID
            System.out.println("The id query successful");

            System.out.println("The Name is " + ActionContext.getActionContext().getContext().getName() + " and id " + ActionContext.getActionContext().getContext().getId());
        }
    }

    public static void main(String[] args) {
        IntStream.range(1, 5).forEach(i -> new Thread(new ExecutionTask2().new TestTask()).start());
    }

}
