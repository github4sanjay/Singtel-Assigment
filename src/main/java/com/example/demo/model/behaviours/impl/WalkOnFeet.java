package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.WalkBehaviour;

public class WalkOnFeet implements WalkBehaviour {
    @Override
    public void walk() {
        System.out.println("I can walk on feet");
    }
}
