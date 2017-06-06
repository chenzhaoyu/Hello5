package com.naver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest
        extends TestCase
{
    private String who = null;
    public void testBean() {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld hw1 = (HelloWorld)factory.getBean("hello");//map.get("hello")
        String ww = hw1.getInfo();
        assertTrue(ww.equals("Happy New Year!"));

    }
}