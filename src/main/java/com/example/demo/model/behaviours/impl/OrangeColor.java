package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.ColorBehaviour;

public class OrangeColor implements ColorBehaviour {
    @Override
    public void color() {
        System.out.println("I have orange color");
    }

    @Override
    public String toString() {
        return "I have orange color";
    }
}
