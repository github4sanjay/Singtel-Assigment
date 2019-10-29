package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SizeBehaviour;
import com.example.demo.model.behaviours.WalkBehaviour;

public class LargeSize implements SizeBehaviour {
    @Override
    public void size() {
        System.out.println("I have large size");
    }

    @Override
    public String toString() {
        return "I have large size";
    }
}
