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
        
        double pee;
		pee = 3.14;
	
		System.out.print("Adjon meg egy szamot!: ");
		Scanner input = new Scanner(System.in);
		int szam1 = input.nextInt() ;
		System.out.print("Adjon meg még egy szamot!: ");
		int szam2 = input.nextInt() ;
		
		System.out.println("A 2 szám felszíne: "+pee* pee* szam1 * szam2+"cm2");
		System.out.println("A 2 szám térfogata: "+(2*pee* pee)*szam1+(2*pee)*szam1*szam2+"cm3");
		
        
        
        
        
    }
} 

