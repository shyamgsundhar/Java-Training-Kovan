package org.kovan.intern.oops_and_architectural_thinking;

import java.util.Random;

abstract class Character{
    String name;
    int strength;
    int health;
    Random random = new Random();
    Character(String name, int health, int strength){
        this.name=name;
        this.health=health;
        this.strength=strength;
    }

    public abstract void attack(Character opponent);

    public  void takeDamage(int damage){
        health=health-damage;
        if(health<0){
            health=0;
        }
    }

    public boolean isAlive(){
        return health > 0;
    }

    public String getStatus(){
        return name+" Health: "+health;
    }
}

class Warrior extends Character{

    Warrior(String name) {
        super(name, 150, 15);
    }

    @Override
    public void attack(Character opponent) {
        int damage = strength+random.nextInt(10);
        System.out.println(name + "attacks the "+opponent);
        opponent.takeDamage(damage);
    }
}

class Mage extends Character{

    Mage(String name) {
        super(name, 80, 30);
    }

    @Override
    public void attack(Character opponent) {
        int damage = strength+random.nextInt(20);
        System.out.println(name + "attacks the "+opponent);
        opponent.takeDamage(damage);
    }
}
class Rogue extends Character{

    Rogue(String name) {
        super(name, 100, 25);
    }

    @Override
    public void attack(Character opponent) {
        int damage = strength+random.nextInt(20);
        System.out.println(name + "attacks the "+opponent);
        opponent.takeDamage(damage);
    }

    public void takeDamage(int damage){
        if(random.nextInt(100)<30){
            System.out.println("Dodge the Attacked");
        }else{
            super.takeDamage(damage);
        }
    }
}

class Arena{
    public static void fight(Character character1, Character character2) {
        System.out.println("The RPG Battle");
        System.out.println(character1.getStatus());
        System.out.println(character2.getStatus());
        System.out.println("Started");
        while (character1.isAlive() && character2.isAlive()){
            character1.attack(character2);
            System.out.println(character1.getStatus());
            System.out.println(character2.getStatus());
            character2.attack(character1);
            System.out.println(character1.getStatus());
            System.out.println(character2.getStatus());
        }
        System.out.println("The Winner is "+(character1.isAlive()?character1.name:character2.name));
    }
}
public class RPGBattleDemo {
    public static void main(String[] args) {
        Character character1 = new Warrior("G-one");
        Character character2= new Mage("Ra-one");
        Arena.fight(character1,character2);
    }
}
