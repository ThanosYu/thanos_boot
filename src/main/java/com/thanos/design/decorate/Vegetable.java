package com.thanos.design.decorate;

/**
 * Copyright (c) 2020 Siemens AG. All rights reserved. This software is the confidential and
 * proprietary information of Siemens AG. This file is part of thanos_boot.
 *
 * @author z003zdbc
 * @description
 * @date 11/5/2020
 */
public class Vegetable extends Food {

    private Food basicFood;

    public Vegetable(Food basicFood){
        this.basicFood = basicFood;
    }

    public String make(){
        return basicFood.make()+"+Vegetable";
    }
}
