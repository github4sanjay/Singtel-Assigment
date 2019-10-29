package com.example.demo.model;

import com.example.demo.model.behaviours.impl.CluckSound;
import com.example.demo.model.behaviours.impl.CockADoodleDoo;
import com.example.demo.model.behaviours.impl.FlyNoWay;
import com.example.demo.model.behaviours.impl.SwimByFeet;

public class Rooster extends Bird {
    public Rooster(){
        flyBehaviour = new FlyNoWay();
        soundBehaviour = new CockADoodleDoo();
        swimBehaviour = new SwimByFeet();
    }
}
