package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.ColorBehaviour;
import com.example.demo.model.behaviours.SizeBehaviour;

public class GreyColor implements ColorBehaviour {
    @Override
    public void color() {
        System.out.println("I have grey color");
    }

    @Override
    public String toString() {
        return "I have grey color";
    }
}
