package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SoundBehaviour;

public class WoofSound implements SoundBehaviour {

    @Override
    public void sound() {
        System.out.println("Woof, woof");
    }

    @Override
    public String toString() {
        return "Woof, woof";
    }
}
