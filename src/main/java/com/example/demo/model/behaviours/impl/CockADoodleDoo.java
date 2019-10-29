package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SoundBehaviour;

public class CockADoodleDoo implements SoundBehaviour {
    @Override
    public void sound() {
        System.out.println("cock-a-doodle-doo");
    }
}
