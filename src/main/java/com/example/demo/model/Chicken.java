package com.example.demo.model;

import com.example.demo.model.behaviours.impl.*;

public class Chicken extends Bird {
    public Chicken(){
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new CluckSound();
        swimBehaviour = new SwimNoWay();
        singingBehaviour = new SingNoWay();
        walkBehaviour = new WalkOnFeet();
    }
}
