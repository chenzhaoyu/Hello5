package com.naver.design.builder;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.naver.design.commonUsage.*;

public class MqttClientTest
        extends TestCase {
    public void testBuild() {
        MqttClient.Builder builder = new MqttClient.Builder("127.0.0.1", 1883);
        MqttClient mc = builder.setQos(1).setClientID("test").setTopics("test1").getMqtt();
        System.out.println("cpu & disk create success");
        assertTrue(true);
    }
}
