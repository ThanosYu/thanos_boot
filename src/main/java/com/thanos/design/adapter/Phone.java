package com.thanos.design.adapter;

public class Phone {

    public static final int V = 220;

    private VoltageAdapter adapter;

    public void charge() {
        adapter.changeVoltage();
    }

    public void setAdapter(VoltageAdapter adapter) {
        this.adapter = adapter;
    }
}
