package com.naver.design.commonUsage;

public class PassWordLogin implements Login {
    @Override
    public boolean login(String password) {
        System.out.println("PassWordLogin call");
        return true;
    }
}