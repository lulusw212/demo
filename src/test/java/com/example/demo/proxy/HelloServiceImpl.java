package com.example.demo.proxy;

public class HelloServiceImpl implements HelloService {
    @Override
    public String syahello(String word) {
        return " HelloServiceImpl say hello "+word ;
    }
}
