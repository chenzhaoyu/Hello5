package com.naver.design.singleton;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.naver.design.commonUsage.*;

public class ResourceSingletonTest
        extends TestCase {
    public void testSingleton() {
        ResourceSingleton rs1 = ResourceSingleton.getInstance();
        ResourceSingleton rs2 = ResourceSingleton.getInstance();
        assertTrue(rs1 == rs2);
    }
}