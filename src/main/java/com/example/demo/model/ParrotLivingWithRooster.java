package com.example.demo.model;

import com.example.demo.model.behaviours.impl.*;

public class ParrotLivingWithRooster extends Bird{
    public ParrotLivingWithRooster(){
        flyBehaviour = new FlyWithWings();
        soundBehaviour = new CockADoodleDoo();
        swimBehaviour = new SwimNoWay();
        singingBehaviour = new SingNoWay();
        walkBehaviour = new WalkOnFeet();
    }
}
