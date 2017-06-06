package com.naver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PersonTest
        extends TestCase
{
    public void testPerson() {
        Person p = new Person();
        p.setAge(10);
        assertTrue(p.getAge() == 10);
    }
}
