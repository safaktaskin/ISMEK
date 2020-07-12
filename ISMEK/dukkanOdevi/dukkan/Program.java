package dukkanProperty;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner klavyedenOkuScanner = new Scanner(System.in);
		System.out.print("Cebinizdeki toplam parayı giriniz: ");
		double cebindekiToplamPara = klavyedenOkuScanner.nextDouble();
		DukkanPropertyNameOlustur.ayracYazdir();
		boolean yeniIslemOlustur = true;
		while (yeniIslemOlustur) {

			System.out.println("Hangi işlemi yapmak istersiniz?");
			System.out.println("Fırın için: 1");
			System.out.println("Kuaför için: 2");
			System.out.println("Okul için: 3");
			System.out.println("Çıkış için: 4");
			int yeniIslem = klavyedenOkuScanner.nextInt();
			DukkanPropertyNameOlustur.ayracYazdir();
			switch (yeniIslem) {
			case 1:
				Firin sahurFirini = new Firin();
				sahurFirini.aylikKazanc = 15.000;
				cebindekiToplamPara = sahurFirini.ekmekAl(cebindekiToplamPara);
				System.out.println(cebindekiToplamPara + " tl cebinizde kalan para.");
				DukkanPropertyNameOlustur.ayracYazdir();
				break;
			case 2:
				BayanKuaforleri bernaBayanKuafor = new BayanKuaforleri();
				bernaBayanKuafor.kullanilanBoyaMarkasi = "wella";
				bernaBayanKuafor.aylikKazanc = 30.000;
				bernaBayanKuafor.logoRenkleri = "kırmızı ve gri";
				bernaBayanKuafor.lokasyon = "Sancaktepe";
				bernaBayanKuafor.calisanSayisi = 12;
				bernaBayanKuafor.kuaforSahibi = "Berna";
				cebindekiToplamPara = bernaBayanKuafor.boyaYap(cebindekiToplamPara);
				System.out.println(cebindekiToplamPara + " tl cebinizde kalan para.");
				DukkanPropertyNameOlustur.ayracYazdir();
				break;
			case 3:
				Okul cagribeyIlkokulu = new Okul();
				cagribeyIlkokulu.logoRenkleri = "Mavi";
				cagribeyIlkokulu.lokasyon = "Ataşehir";
				cagribeyIlkokulu.telefonNo = 1829473853;
				cagribeyIlkokulu.dukkaninAcilisSaati();
				cagribeyIlkokulu.dukkaninKapanisSaati();
				cebindekiToplamPara = cagribeyIlkokulu.kantineGit(cebindekiToplamPara);
				DukkanPropertyNameOlustur.ayracYazdir();
				break;
			case 4: 
				yeniIslemOlustur = false;
				System.out.println("Çıkış Yapıldı");
			default:
				System.out.println("Belirlenen rakamlarda giriş yapınız.");
				break;
			}
		}
	}

}
