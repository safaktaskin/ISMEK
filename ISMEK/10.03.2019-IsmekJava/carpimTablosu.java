package donguler;

import java.util.Scanner;

public class carpimTablosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner klavyedenOku = new Scanner(System.in);
		System.out.print("Çarpýlacak kadar sayý giriniz: ");
		int carp = klavyedenOku.nextInt();
		for(int i=1; i<=carp; i++) {
			for (int j=1; j<=10; j++) {
				int sonuc = j * i;
				System.out.println(i + " * " + j + " = " + sonuc);
			}
			System.out.println("**********");
		}
		
	}

}
