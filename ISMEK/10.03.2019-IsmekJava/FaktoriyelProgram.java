package donguler;

import java.util.Scanner;

public class FaktoriyelProgram {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.println("Faktöriyel Alýnacak Sayý: ");
		int faktoriyelAlinacakSayi = klavyedenOku.nextInt();
		int sonuc = 1;
		for(int i = 1; i <= faktoriyelAlinacakSayi; i++) {
			sonuc = sonuc * i;
			// 1*1=1
			// 1*2=2
			// 2*3=6
			// 6*4=24
			System.out.println(sonuc + "*" + i + "=" + sonuc * i);
		}
		System.out.println("Son sonuç = " + sonuc);
	}
}
