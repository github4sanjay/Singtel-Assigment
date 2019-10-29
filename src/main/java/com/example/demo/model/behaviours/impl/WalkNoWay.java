package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.WalkBehaviour;

public class WalkNoWay implements WalkBehaviour {
    @Override
    public void walk() {
        System.out.println("I cant walk");
    }

    @Override
    public boolean isWalkable() {
        return false;
    }

    @Override
    public String toString() {
        return "I cant walk";
    }
}
