package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SoundBehaviour;

public class CluckSound implements SoundBehaviour {

    @Override
    public void sound() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public String toString() {
        return "Cluck, cluck";
    }
}
