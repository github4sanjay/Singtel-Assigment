package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying with wings");
    }
}
