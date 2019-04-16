package com.thanos.test;


import com.google.common.eventbus.Subscribe;

/**
 * @author Shi Qiang Yu
 * @date 4/16/2019 6:02 PM
 */
public class EventListener {


    @Subscribe
    public void listen1(String message) {
        System.out.println("Message: " + message);
    }

    @Subscribe
    public void listen2(TestEvent event) {
        System.out.println("Message: " + event.getMessage());
    }


}