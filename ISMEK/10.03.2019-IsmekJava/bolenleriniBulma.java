package donguler;

import java.util.Scanner;

public class bolenleriniBulma {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.println("B�leni bulunacak say�y� girin: ");
		int bolenBulma = klavyedenOku.nextInt();
		for (int i = 2; i <= bolenBulma; i++) {
			if(bolenBulma % i == 0) {
				System.out.println("Say� " + i + " B�l�n�r.");
			}
		}
	}

}
