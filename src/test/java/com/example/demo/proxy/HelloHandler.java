package com.example.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloHandler implements InvocationHandler {

    private Object proxy;

    public HelloHandler(Object proxy) {
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] args) throws Throwable {
        System.out.println("HelloHandler begin");
        Object result = method.invoke(proxy,args);
        System.out.println("HelloHandler end");
        return result;
    }





}
