package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I cant fly");
    }

    @Override
    public boolean isFly() {
        return false;
    }

    @Override
    public String toString() {
        return "I cant fly";
    }
}
