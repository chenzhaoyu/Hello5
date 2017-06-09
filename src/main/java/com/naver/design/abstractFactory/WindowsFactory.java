package com.naver.design.abstractFactory;

import com.naver.design.commonUsage.*;

public class WindowsFactory implements ComputerFactory {
    @Override
    public CPU getCPU() {
        return new WindowsCPU();
    }
    @Override
    public Disk getDisk(){
        return new WindowsDisk();
    }
}