package com.example.demo.model.behaviours.impl;

import com.example.demo.model.behaviours.SingingBehaviour;

public class SingNoWay implements SingingBehaviour {
    @Override
    public void sing() {
        System.out.println("I cant sing");
    }

    @Override
    public boolean isSinger() {
        return false;
    }
}
