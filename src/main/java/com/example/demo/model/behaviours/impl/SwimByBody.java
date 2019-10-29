package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SwimBehaviour;

public class SwimByBody implements SwimBehaviour {
    @Override
    public void swim() {
        System.out.println("I swim by body");
    }

    @Override
    public boolean isSwimmer() {
        return true;
    }
}
