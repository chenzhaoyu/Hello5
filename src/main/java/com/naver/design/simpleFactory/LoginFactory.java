package com.naver.design.simpleFactory;

import com.naver.design.commonUsage.Login;
import com.naver.design.commonUsage.PassWordLogin;
import com.naver.design.commonUsage.DomainLogin;

public class LoginFactory {
    /**
     *
     * @param name
     * @return
     * @throws IllegalArgumentException when no name find
     */
    public static Login getInstance(String name) {
        if (name.equals("password")) {
            return new PassWordLogin();
        } else if (name.equals("domain")) {
            return new DomainLogin();
        } else {
            throw new IllegalArgumentException("no name find");
        }
    }
}