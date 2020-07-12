package org.ismek_switch;

import java.util.Scanner;

public class haftaninGunleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Gün giriniz: ");
		
		String haftaninGunu = scanner.next();
	
		switch (haftaninGunu) {
		case "PTS":
			System.out.println("PAZARTESÝ");
			break;
		case "SL":
			System.out.println("SALI");
			break;
		case "CRS":
			System.out.println("ÇARÞAMBA");
			break;
		case "PRS":
			System.out.println("PERÞEMBE");
			break;
		case "CM":
			System.out.println("CUMA");
			break;
		case "CMT":
			System.out.println("CUMARTESÝ");
			break;
		case "PZ":
			System.out.println("PAZAR");
			break;
		default:
			System.out.println("GÜN BULUNAMADI");
			break;
		}

	}

}
