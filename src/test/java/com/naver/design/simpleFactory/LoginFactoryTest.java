package com.naver.design.simpleFactory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.naver.design.commonUsage.*;

public class LoginFactoryTest
        extends TestCase {
    public void testFactory() {
        LoginFactory lf = new LoginFactory();
        Login l = lf.getInstance("password");
        assertEquals(l.login("haha"), true);
        l = lf.getInstance("domain");
        assertEquals(l.login("haha"), true);
    }
}