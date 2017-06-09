package com.naver.design.abstractFactory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.naver.design.commonUsage.*;

public class AbstractFactoryTest
        extends TestCase {
    public void testFactory() {
        ComputerFactory cf = new LinuxFactory();
        CPU c = cf.getCPU();
        Disk d = cf.getDisk();
        cf = new WindowsFactory();
        c = cf.getCPU();
        d = cf.getDisk();
        System.out.println("cpu & disk create success");
        assertTrue(true);
    }
}