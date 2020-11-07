package com.thanos.design.adapter;

public class VoltageAdapter {

    public void changeVoltage() {
        System.out.println("Charging");
        System.out.println("Original voltage: " + Phone.V + "V");
        System.out.println("Voltage after adapter: " + (Phone.V - 200) + "V");
    }
}
