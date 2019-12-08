package com.demo.designpatterns.multiThreads_ContextLocalThread;

import com.demo.designpatterns.multiThreads_Context.Context;

/** 复制上下文到ThreadLocal中
 *
 * 使用 ThreadLocal 实现上下文。ThreadLocal 是线程本地变量，可以实现多线程的数据隔离。
 * ThreadLocal 为每一个使用该变量的线程都提供一份独立的副本，线程间的数据是隔离的，每一个线程只能访问各自内部的副本变量。
 * */
public final class ActionContext {

    private static final ThreadLocal<Context> threadLocal = new ThreadLocal<Context>() {
        @Override
        protected Context initialValue() {
            return new Context();
        }
    };

    public static ActionContext getActionContext() {
        return ContextHolder.actionContext;
    }

    public Context getContext() {
        return threadLocal.get();
    }

    // 获取ActionContext单例
    public static class ContextHolder {
        private final static ActionContext actionContext = new ActionContext();
    }
}