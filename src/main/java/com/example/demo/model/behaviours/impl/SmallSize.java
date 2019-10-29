package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SizeBehaviour;

public class SmallSize implements SizeBehaviour {
    @Override
    public void size() {
        System.out.println("I have small size");
    }
}
