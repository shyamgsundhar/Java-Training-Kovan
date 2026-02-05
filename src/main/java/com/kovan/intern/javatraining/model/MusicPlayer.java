package com.kovan.intern.javatraining.model;

public interface MusicPlayer {
    void start();
    default void defaultStart(){
        System.out.println("Music Started");
    }
}
