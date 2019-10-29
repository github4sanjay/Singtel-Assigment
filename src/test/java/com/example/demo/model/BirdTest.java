package com.example.demo.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void sing() {
        Bird bird = new Bird();
        bird.sing();
    }
}