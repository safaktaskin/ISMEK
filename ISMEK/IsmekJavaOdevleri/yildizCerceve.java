package Odev1;

import java.util.Scanner;

public class yildizCerceve {

	public static void main(String[] args) {
        Scanner klavyedenOku = new Scanner(System.in);
		System.out.print("Satır giriniz: ");
		int satir = klavyedenOku.nextInt();		
		System.out.print("Sutun giriniz: ");
		int sutun = klavyedenOku.nextInt();		
		
		for(int i = 0; i<satir; i++) {	
			System.out.println("");
			for (int j = 0;  j<sutun; j++) {
				if(i==0 || i==satir-1 || j==0 || j==sutun-1) 
				System.out.print("*");
				else
					System.out.print(" ");
			}	
         
		}
	}

}
