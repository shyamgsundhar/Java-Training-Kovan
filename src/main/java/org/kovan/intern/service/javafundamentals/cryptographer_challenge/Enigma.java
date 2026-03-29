package org.kovan.intern.service.javafundamentals.cryptographer_challenge;

import java.util.Scanner;

public class Enigma {
    public static String encrypt(String string,int key){
        StringBuilder encryptedWord=new StringBuilder();
        for(char ch:string.toCharArray()){
            char cipherChar=(char)(ch^key);
            encryptedWord.append(cipherChar);
        }
        return encryptedWord.toString();
    }
    public static String decrypt(String string,int key){
        StringBuilder decryptWord=new StringBuilder();
        for(char ch:string.toCharArray()){
            char decipherChar=(char)(ch^key);
            decryptWord.append(decipherChar);
        }
        return decryptWord.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Message");
        String input = scanner.nextLine();
        System.out.println("Enter the Key");
        int key = scanner.nextInt();
        System.out.println("Enter 1 for Encrypt // 2 for Decrypt");
        int option=scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("The Encrypted Message is "+encrypt(input,key));
                break;
            case 2:
                System.out.println("The Decrypted Message is "+decrypt(input,key));
                break;
            default:
                System.out.println("Please Enter the Correct Option");
                break;
        }

    }
}
