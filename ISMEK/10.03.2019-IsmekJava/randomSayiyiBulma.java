package donguler;

import java.util.Random;
import java.util.Scanner;

public class randomSayiyiBulma {

	public static void main(String[] args) {
		Random randomSayiUret = new Random();
		int sayiUret = randomSayiUret.nextInt(10);
        Scanner klavyedenOku = new Scanner(System.in);	
        System.out.print("Sayýyý tahmin edin: ");
        int tahmin;
        
		
		do{
			tahmin = klavyedenOku.nextInt();
			if(sayiUret == tahmin) {
				System.out.println("Tebrikler :) ");
			}
			else {
				System.out.println("Olmadý :( ");
			}

		}while(sayiUret != tahmin);
			
	}

}
