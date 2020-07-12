package odev;

import java.util.Random;
import java.util.Scanner;

public class Uretec {

	public String sonucDizisi(int karakterSayisi) {
		Random randomSayi = new Random();
		int random;
		String kelime = "";
		char[] alfabeDizisi = new char[26];

		for (int i = 0; i < 26; i++) {
			alfabeDizisi[i] = (char) (65 + i);
		}
		char[] sonucDizisi = new char [karakterSayisi];

			for (int j = 0; j < karakterSayisi; j++) {
				random = randomSayi.nextInt(alfabeDizisi.length);
				sonucDizisi[j] = alfabeDizisi[random];
				kelime += sonucDizisi[j];
			}	
	
		return kelime;
	}

}