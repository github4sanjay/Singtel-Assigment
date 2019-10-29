package com.example.demo.model;

import com.example.demo.model.behaviours.WalkBehaviour;

public class Animal {

    WalkBehaviour walkBehaviour;

    void walk(){
        walkBehaviour.walk();
    }
}
