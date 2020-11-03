package com.thanos.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2020 Siemens AG. All rights reserved. This software is the confidential and
 * proprietary information of Siemens AG. This file is part of thanos_boot.
 *
 * @author z003zdbc
 * @description
 * @date 11/3/2020
 */
public class XiaoMei {

    List<Person> list = new ArrayList<Person>();

    public XiaoMei(){
    }

    public void addPerson(Person person){
        list.add(person);
    }

    public void notifyPerson() {
        for(Person person:list){
            person.getMessage("你们过来吧，谁先过来谁就能陪我一起玩儿游戏!");
        }
    }
}
