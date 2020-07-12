package org.restoranprojesi;

import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		RestoranTasarimi.hosgeldinizYazdir();
		RestoranTasarimi.baslikYazdir();

		boolean donguDevamEdiyor = true;
		do {
			RestoranTasarimi.menuYazdir();
			System.out.print("Seçiminiz: ");
			int secim = scan.nextInt();
			switch (secim) {
			case 1:
				System.out.println("Ürün eklenecek...");
				VeritabaniIslemleri.urunEkle();
				RestoranTasarimi.ayracYazdir();
				break;
			case 2:
				System.out.println("Ürünler listelenecek...");				
				VeritabaniIslemleri.urunleriListele();
				RestoranTasarimi.ayracYazdir();
				break;
			case 3:
				System.out.println("Çalışan kaydı oluşturulacak...");
				VeritabaniIslemleri.calisanEkle();
				RestoranTasarimi.ayracYazdir();
				break;
			case 4:
				System.out.println("Personel listelenecek...");
				VeritabaniIslemleri.personelListele();
				RestoranTasarimi.ayracYazdir();
				break;
			case 5:
				System.out.println("Masa kaydı yapılacak...");
				VeritabaniIslemleri.masaEkle();
				RestoranTasarimi.ayracYazdir();
				break;
			case 6:
				System.out.println("Masalar listelenecek...");
				VeritabaniIslemleri.masalariListele();
				RestoranTasarimi.ayracYazdir();
				break;
			case 7:
				System.out.println("Sipariş kaydı oluşturulacak...");
				Siparis.siparisEkle();
				RestoranTasarimi.ayracYazdir();
				break;
			case 8:
				System.out.println("Siparişler listelenecek...");
				Siparis.siparisListele();
				RestoranTasarimi.ayracYazdir();
				break;
			case 9:
				System.out.println("Hesap alınacak...");
				Hesapla.hesapAl();
				double cebindekiToplamPara = 0;
				Hesapla.musteridenAlinan(cebindekiToplamPara );
				RestoranTasarimi.ayracYazdir();
				break;
			case 10:
				System.out.println("Çıkış yapılacak");
				donguDevamEdiyor = false;
				break;
			default:
				System.out.println("Belirlenen rakamlarda giriş yapınız.");
				break;
			}
		} while (donguDevamEdiyor);

	}

}
