package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;

interface Camera {
    void start();
    default void defaultStart(){
        System.out.println("Camera Started");
    }
}
interface MusicPlayer {
    void start();
    default void defaultStart(){
        System.out.println("Music Started");
    }
}
interface Phone {
    void call();
}

class SmartPhone implements Camera,MusicPlayer,Phone {
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

public class SmartPhoneMultipleInterfaceDemo{
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.start();
        smartPhone.call();
        smartPhone.defaultStart();
    }
}
