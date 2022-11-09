package com.mycompany.kicsiberobbanabonba;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Kicsiberobbanabonba {

    public static void main(String[] args) {
    int sugar;
    int magassag;
    public void kacsa(){
        System.out.print("Adj meg egy felszínt: ");
        Scanner beker = new Scanner(System.in);
        int sugar = beker.nextInt();
        System.out.print("Adj meg egy magasságot: ");
        int magassag = beker.nextInt();
        System.out.println("A henger felszíne: " + 2 * sugar * magassag + ".");
    }
} 

