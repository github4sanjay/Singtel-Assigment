package com.example.demo.model;

import com.example.demo.model.behaviours.impl.*;

public class Rooster extends Bird {
    public Rooster(){
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new CockADoodleDoo();
        swimBehaviour = new SwimByFeet();
        singingBehaviour = new SingNoWay();
        walkBehaviour = new WalkOnFeet();
    }
}
