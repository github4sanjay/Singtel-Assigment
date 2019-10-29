package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SoundBehaviour;

public class NoSound implements SoundBehaviour {

    @Override
    public void sound() {
        System.out.println("I dont sound");
    }

    @Override
    public String toString() {
        return "I dont sound";
    }
}
