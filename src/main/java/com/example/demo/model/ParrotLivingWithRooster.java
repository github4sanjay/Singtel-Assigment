package com.example.demo.model;

import com.example.demo.model.behaviours.impl.*;

public class ParrotLivingWithRooster extends Parrot{
    public ParrotLivingWithRooster(){
        soundBehaviour = new CockADoodleDoo();
    }
}
