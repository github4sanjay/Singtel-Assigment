package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SoundBehaviour;

public class MeowSound implements SoundBehaviour {

    @Override
    public void sound() {
        System.out.println("Meow, meow");
    }

    @Override
    public String toString() {
        return "Meow, meow";
    }
}
