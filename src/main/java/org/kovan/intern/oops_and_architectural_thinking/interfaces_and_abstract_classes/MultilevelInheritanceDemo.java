package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;

class Phones{
    void call(){
        System.out.println("Calling.....");
    }
}
class SmartPhones extends Phones {
    public void internet() {
        System.out.println("Internet from Smartphone");
    }
}
class Iphones extends SmartPhones{
    public void faceid(){
        System.out.println("Face Id from Iphone");
    }
}
class IphoneUltra extends Iphones{
    public void display(){
        System.out.println("Iphone Ultra");
    }
}
class IphonePro extends Iphones{
    public void display(){
        System.out.println("Iphone Pro");
    }
}
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        IphoneUltra ultra = new IphoneUltra();
        ultra.call();
        ultra.internet();
        ultra.faceid();
        ultra.display();
        System.out.println(ultra.hashCode());
        System.out.println();
        IphonePro iphonePro = new IphonePro();
        iphonePro.call();
        iphonePro.internet();
        iphonePro.faceid();
        iphonePro.display();
        System.out.println(iphonePro.hashCode());
    }
}
