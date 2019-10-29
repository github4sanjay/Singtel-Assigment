package com.example.demo.model;

import com.example.demo.model.behaviours.impl.CluckSound;
import com.example.demo.model.behaviours.impl.FlyNoWay;
import com.example.demo.model.behaviours.impl.SwimByFeet;

public class Chicken extends Bird {
    public Chicken(){
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new CluckSound();
        swimBehaviour = new SwimByFeet();
    }
}
