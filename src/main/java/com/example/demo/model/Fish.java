package com.example.demo.model;

import com.example.demo.model.behaviours.impl.*;

public class Fish extends Animal {
    public Fish(){ // default behaviour
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new NoSound();
        swimBehaviour = new SwimByBody();
        singingBehaviour = new SingNoWay();
        walkBehaviour = new WalkNoWay();
    }
}
