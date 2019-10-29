package com.example.demo.model;

import com.example.demo.model.behaviours.impl.CockADoodleDoo;
import com.example.demo.model.behaviours.impl.FlyWithWings;
import com.example.demo.model.behaviours.impl.MeowSound;
import com.example.demo.model.behaviours.impl.SwimNoWay;

public class ParrotLivingWithRooster extends Bird{
    public ParrotLivingWithRooster(){
        flyBehaviour = new FlyWithWings();
        soundBehaviour = new CockADoodleDoo();
        swimBehaviour = new SwimNoWay();
    }
}
