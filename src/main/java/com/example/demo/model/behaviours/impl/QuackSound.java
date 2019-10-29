package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SoundBehaviour;

public class QuackSound implements SoundBehaviour {

    @Override
    public void sound() {
        System.out.println("Quack, quack");
    }

    @Override
    public String toString() {
        return "Quack, quack";
    }
}
