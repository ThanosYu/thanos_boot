package com.thanos.test;


import com.google.common.eventbus.EventBus;
import org.junit.Test;

/**
 * @author Shi Qiang Yu
 * @date 4/16/2019 6:02 PM
 */
public class TestEventBus {

    @Test
    public void testEventBus(){
        EventBus eventBus = new EventBus();
        EventListener listener = new EventListener();
        eventBus.register(listener);

        eventBus.post("Bus1 coming");
        eventBus.post(new TestEvent("Bus2 coming"));
    }
}