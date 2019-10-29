package com.example.demo.model;

import com.example.demo.model.behaviours.SwimBehaviour;
import com.example.demo.model.behaviours.impl.FlyNoWay;
import com.example.demo.model.behaviours.impl.QuackSound;
import com.example.demo.model.behaviours.impl.SwimByFeet;

public class Duck extends Bird{
    public Duck(){
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new QuackSound();
        swimBehaviour = new SwimByFeet();
    }
}
