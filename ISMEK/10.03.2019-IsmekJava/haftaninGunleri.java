package org.ismek_switch;

import java.util.Scanner;

public class haftaninGunleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.println("G�n giriniz: ");
		
		String haftaninGunu = scanner.next();
	
		switch (haftaninGunu) {
		case "PTS":
			System.out.println("PAZARTES�");
			break;
		case "SL":
			System.out.println("SALI");
			break;
		case "CRS":
			System.out.println("�AR�AMBA");
			break;
		case "PRS":
			System.out.println("PER�EMBE");
			break;
		case "CM":
			System.out.println("CUMA");
			break;
		case "CMT":
			System.out.println("CUMARTES�");
			break;
		case "PZ":
			System.out.println("PAZAR");
			break;
		default:
			System.out.println("G�N BULUNAMADI");
			break;
		}

	}

}
