package org.restoranprojesi;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hesapla {
	static Random random = new Random();
	// müşteriden alınan ürünün fiyatını toplayıp bastıracak.

	SiparisDto siparisDto = new SiparisDto();
	static Scanner oku = new Scanner(System.in);
	static float toplamSiparisTutari = 0;
	public static double hesapAl() {
		toplamSiparisTutari = 0;
		ArrayList<SiparisDto> siparisList = Siparis.siparisGetir();
		
		System.out.println("Masa numaranızı giriniz: ");
		int secilenSiparisNo = oku.nextInt();
		
		
		for(SiparisDto siparisDto : siparisList) {
			if(secilenSiparisNo == siparisDto.getFK_MasaNo()) {
			toplamSiparisTutari+=siparisDto.getUrunFiyat();
			}			
		}
		System.out.println("Toplam sipariş tutarınız: " + toplamSiparisTutari);
		return toplamSiparisTutari;
	}
		
	

	// Para üstü verme
	public static double musteridenAlinan(double cebindekiToplamPara) {
		System.out.println("Müşteriden alınan tutar: ");
		cebindekiToplamPara = oku.nextDouble();
		double paraUstu = cebindekiToplamPara - toplamSiparisTutari;
		if (paraUstu == 0) {
			System.out.println("Afiyet olsun.");
			return paraUstu;
		} 
		else if(paraUstu > 0) {
			System.out.println("Para üstünüz: " + paraUstu + "TL");
		}
		else if(paraUstu < 0) {
			System.out.println(paraUstu + " TL paranız eksik...");
		}
		else 			
		System.out.println("İyi günler...");
		return cebindekiToplamPara;
		
	}
}
