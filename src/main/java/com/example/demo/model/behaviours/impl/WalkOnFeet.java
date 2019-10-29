package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.WalkBehaviour;

public class WalkOnFeet implements WalkBehaviour {
    @Override
    public void walk() {
        System.out.println("I walk on feet");
    }

    @Override
    public boolean isWalkable() {
        return true;
    }

    @Override
    public String toString() {
        return "I walk on feet";
    }
}
