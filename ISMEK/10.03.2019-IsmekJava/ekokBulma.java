package donguler;

import java.util.Scanner;

public class ekokBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.println("Ekoku bulunacak sayý: ");
		int ekokBul = klavyedenOku.nextInt();
		for(int i=2; i<=ekokBul; i++) {
			if(ekokBul%i==0) {
				ekokBul = ekokBul / i;
				System.out.println(i);
				i--;
			}
		}
		

	}

}
