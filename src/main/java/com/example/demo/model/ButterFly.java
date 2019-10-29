package com.example.demo.model;

import com.example.demo.model.behaviours.FlyBehaviour;
import com.example.demo.model.behaviours.SoundBehaviour;
import com.example.demo.model.behaviours.impl.FlyWithWings;
import com.example.demo.model.behaviours.impl.NoSound;
import com.example.demo.model.behaviours.impl.WalkOnFeet;

public class ButterFly extends Animal {
    SoundBehaviour soundBehaviour;
    FlyBehaviour flyBehaviour;

    public ButterFly(){
        walkBehaviour = new WalkOnFeet();
        flyBehaviour = new FlyWithWings();
        soundBehaviour = new NoSound();
    }
}
