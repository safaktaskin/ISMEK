package dukkanProperty;

import java.util.Scanner;

public class Firin extends DukkanPropertyNameOlustur {
	double ekmekFiyati = 1.75;
	
	public double ekmekAl(double cebindekiToplamPara) {
		System.out.println("Kaç ekmek istersiniz?");
		Scanner klavyedenOkuScanner = new Scanner(System.in);
		int kacEkmek = klavyedenOkuScanner.nextInt();
		double toplamEkmekFiyati = ekmekFiyati * kacEkmek;
	
		
		double paraUstu = cebindekiToplamPara - toplamEkmekFiyati;
		if(paraUstu < 0) {
			System.out.println(cebindekiToplamPara + " Paran eksik ürünü geri bırak.");
			return cebindekiToplamPara;
		}
		else if(paraUstu > 0) {
			
			System.out.println("Para üstü vercem bekle..." + paraUstu);
		}
		else {
			System.out.println("İyi günler :)");
		}
		return paraUstu;
	}

}
