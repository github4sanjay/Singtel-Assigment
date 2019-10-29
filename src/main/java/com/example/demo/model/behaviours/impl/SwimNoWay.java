package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SwimBehaviour;

public class SwimNoWay implements SwimBehaviour {
    @Override
    public void swim() {
        System.out.println("I cant swim");
    }

    @Override
    public boolean isSwimmer() {
        return false;
    }
}
