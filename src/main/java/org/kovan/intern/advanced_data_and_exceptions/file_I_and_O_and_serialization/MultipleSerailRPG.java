package org.kovan.intern.advanced_data_and_exceptions.file_I_and_O_and_serialization;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MultipleGameStorage implements Serializable {
    public static final Path path= Path.of("multiplayer.dat");
    public static Map<String,Characters> loadAll(){
        if(Files.notExists(path)){

            return new HashMap<>();
        }
        try(ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))){
            System.out.println("Loaded....");
            return (Map<String,Characters>) objectInputStream.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void saveAll(Map<String, Characters> players){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))){
            objectOutputStream.writeObject(players);
            objectOutputStream.close();
            System.out.println("Saved...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
public class MultipleSerailRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.println("MultiSave RPG Game");
            System.out.println("1. New Game");
            System.out.println("2. Load Game");
            System.out.println("3. Show Profiles");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            Map<String, Characters> players = MultipleGameStorage.loadAll();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter player name: ");
                    String newName = scanner.nextLine();

                    Characters newPlayer = new Warrior(newName);
                    Characters enemy1 = new Mage("Enemy");

                    Arena.fight(newPlayer, enemy1);

                    players.put(newName, newPlayer);
                    MultipleGameStorage.saveAll(players);
                    break;
                case 2:
                    System.out.print("Enter player name to load: ");
                    String loadName = scanner.nextLine();

                    Characters player = players.get(loadName);

                    if (player != null) {
                        System.out.println("Loaded: " + player.getStatus());

                        Characters enemy2 = new Mage("Enemy");
                        Arena.fight(player, enemy2);

                        players.put(loadName, player);
                        MultipleGameStorage.saveAll(players);
                    } else {
                        System.out.println("Player not found!");
                    }
                    break;
                case 3:
                    System.out.println("Saved Profiles:");
                    if (players.isEmpty()) {
                        System.out.println("No profiles found");
                    } else {
                        for (String name : players.keySet()) {
                            System.out.println("- " + name);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");

            }
    }
    }
}
