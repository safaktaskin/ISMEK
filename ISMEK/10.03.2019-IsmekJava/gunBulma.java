package org.ismek_switch;

import java.util.Scanner;

public class gunBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.println("G�n giriniz: ");		
		String gunBul = scanner.next();
		
		switch (gunBul) {
		case "PTS":
		case "SL":
		case "CRS":
		case "PRS":
		case "CM":
			System.out.println("Hafta i�i");
			break;
		case "CMT":
		case "PZ":
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Haftaya dahil bir g�n girin.");
			break;

		}
	}

}
