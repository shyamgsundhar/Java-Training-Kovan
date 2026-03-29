package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;


interface Callable {
    void call();
}


interface InternetEnabled {
    void browse();
}


interface FaceUnlock {
    void faceUnlock();
}

class Device {
    void powerOn() {
        System.out.println("Device Power On");
    }
}

class BasicPhone extends Device implements Callable {

    @Override
    public void call() {
        System.out.println("Calling from Basic Phone");
    }
}

class SmartPhoness extends Device implements Callable, InternetEnabled {

    @Override
    public void call() {
        System.out.println("Calling from Smart Phone");
    }

    @Override
    public void browse() {
        System.out.println("Browsing Internet");
    }
}

class IphonePros extends SmartPhoness implements FaceUnlock {

    @Override
    public void faceUnlock() {
        System.out.println("Face Unlock Activated");
    }
}
public class HybridInheritanceDemo {

    public static void main(String[] args) {
        BasicPhone basic = new BasicPhone();
        basic.powerOn();
        basic.call();

        System.out.println();

        SmartPhoness smart = new SmartPhoness();
        smart.powerOn();
        smart.call();
        smart.browse();

        System.out.println();

        IphonePros pro = new IphonePros();
        pro.powerOn();
        pro.call();
        pro.browse();
        pro.faceUnlock();
    }

}
