package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying with wings");
    }

    @Override
    public boolean isFly() {
        return true;
    }

    @Override
    public String toString() {
        return "I am flying with wings";
    }
}
