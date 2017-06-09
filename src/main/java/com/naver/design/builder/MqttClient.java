package com.naver.design.builder;

public class MqttClient {
    private String host;
    private int port;
    private int qos;
    private String clientID;
    private String topics;
    private MqttClient(String h, int p, int q, String c, String t) {
        host = h;
        port = p;
        qos = q;
        clientID = c;
        topics = t;
    }
    public static class Builder {
        private String host;
        private int port;
        private int qos;
        private String clientID;
        private String topics;

        public Builder(String host, int port) {
            host = host;
            port = port;
        }
        Builder setQos(int q) {
            qos = q;
            return this;
        }
        Builder setClientID(String c) {
            clientID = c;
            return this;
        }
        Builder setTopics(String t) {
            topics = t;
            return this;
        }
        MqttClient getMqtt() {
            return new MqttClient(host, port, qos, clientID, topics);
        }
    }
}