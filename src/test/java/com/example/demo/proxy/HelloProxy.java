package com.example.demo.proxy;

public class HelloProxy implements HelloService {
    @Override
    public String syahello(String word) {
        System.out.println("HelloProxy hello "+word);
        return null;
    }
}
