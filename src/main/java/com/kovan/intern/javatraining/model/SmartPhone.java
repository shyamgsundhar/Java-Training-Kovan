package com.kovan.intern.javatraining.model;

public class SmartPhone implements Camera, MusicPlayer, Phone {
    @Override
    public void start() {
        System.out.println("Starting Camera or Music Player");
    }

    @Override
    public void defaultStart() {
        Camera.super.defaultStart();
        MusicPlayer.super.defaultStart();
    }

    @Override
    public void call() {
        System.out.println("Starting Call");
    }
}
