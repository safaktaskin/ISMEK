package donguler;

import java.util.Scanner;

public class yildiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavyedenOku = new Scanner(System.in);
		
		System.out.print("Satýr giriniz: ");
		int satir = klavyedenOku.nextInt();
		
		System.out.print("Sutun giriniz: ");
		int sutun = klavyedenOku.nextInt();
		
		for(int satirNumarasi = 1; satirNumarasi<=satir; satirNumarasi++) {
			for (int sutunNumarasi = 1;  sutunNumarasi<=sutun; sutunNumarasi++) {
				System.out.print("*");
			}
			System.out.println(" ");			
		}
	}

}
