package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SwimBehaviour;

public class SwimByFeet implements SwimBehaviour {
    @Override
    public void swim() {
        System.out.println("I swim by feet");
    }

    @Override
    public boolean isSwimmer() {
        return true;
    }
}
