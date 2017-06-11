package com.naver.design.commonUsage;

public class DomainLogin implements Login {
    @Override
    public boolean login(String password) {
        System.out.println("DomainLogin call");
        return true;
        
    }
}
