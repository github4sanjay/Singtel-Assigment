package com.example.demo.model;

import com.example.demo.model.behaviours.impl.*;

public class Parrot extends Bird {
    public Parrot(){ // default behaviour
        flyBehaviour = new FlyWithWings();
        soundBehaviour = new NoSound();
        swimBehaviour = new SwimNoWay();
        singingBehaviour = new SingNoWay();
        walkBehaviour = new WalkOnFeet();
    }
}
