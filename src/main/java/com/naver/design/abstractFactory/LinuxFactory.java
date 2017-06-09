package com.naver.design.abstractFactory;

import com.naver.design.commonUsage.*;

public class LinuxFactory implements ComputerFactory {
    @Override
    public CPU getCPU() {
        return new LinuxCPU();
    }
    @Override
    public Disk getDisk(){
        return new LinuxDisk();
    }
}