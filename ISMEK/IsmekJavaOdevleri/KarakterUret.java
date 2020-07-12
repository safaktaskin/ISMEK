package Odev1;

import java.util.Random;
import java.util.Scanner;

public class karakterUretme {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		Random randomSayi = new Random();
		int random;
		char[] alfabeDizisi = new char[26];

		for (int i = 0; i < 26; i++) {
			alfabeDizisi[i] = (char) (65 + i);
		}

		System.out.print("Kaç karakter istiyorsunuz = ");
		int karakterSayisi = klavyedenOku.nextInt();

		System.out.print("Kaç tane üretilmesini istiyorsunuz = ");
		int üretilecekSayi = klavyedenOku.nextInt();

		char[][] sonucDizisi = new char[üretilecekSayi][karakterSayisi];

		for (int i = 0; i < üretilecekSayi; i++) {
			for (int j = 0; j < karakterSayisi; j++) {
				random = randomSayi.nextInt(alfabeDizisi.length);
				sonucDizisi[i][j] = alfabeDizisi[random];
			}
			System.out.println(sonucDizisi[i]);
		}

	}

}
