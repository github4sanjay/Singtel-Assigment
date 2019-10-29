package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SingingBehaviour;
import com.example.demo.model.behaviours.SwimBehaviour;

public class SingNoWay implements SingingBehaviour {
    @Override
    public void sing() {
        System.out.println("I cant sing");
    }
}
