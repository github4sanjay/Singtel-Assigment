package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SoundBehaviour;

public class NoSound implements SoundBehaviour {

    @Override
    public void sound() {
        System.out.println("Cluck, cluck");
    }
}
