package com.example.demo.model;

import com.example.demo.model.behaviours.Singer;

class Bird extends Animal implements Singer {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}