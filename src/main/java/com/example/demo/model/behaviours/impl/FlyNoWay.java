package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I cant fly");
    }
}
