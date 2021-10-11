package com.example.builder.phone;

public class Phone {
    private String os;
    private int ram;
    private int battery;
    private String processor;
    private double screenSize;

    public Phone(String os, int ram, int battery, String processor, double screenSize) {
        this.os = os;
        this.ram = ram;
        this.battery = battery;
        this.processor = processor;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", battery=" + battery +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}