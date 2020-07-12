package odev;

import java.util.Random;
import java.util.Scanner;

/**
 * Ogrenci Bilgi Sistemi
 * 
 * @author Şafak Taşkın
 * @since 1.0
 */
public class Program {

	public static void main(String[] args) {
		Scanner klavyedenOkuScanner = new Scanner(System.in);
		metotYazdirma.fatihBilisimOkuluProgramBasligiYazdir();
		metotYazdirma.programBasligiYazdir("Öğrenci Bilgi Sistemi");
		
		Random rastgeleSayi = new Random();
		Uretec kelimeUret = new Uretec();
		Ogrenci ogrenciGetir = new Ogrenci();

		System.out.print("Öğrencinin ismi kaç karakterli olacak: ");
		int karakterSayisi = klavyedenOkuScanner.nextInt();
		System.out.println(" ");

		for (int ogrenci = 1; ogrenci <= 10; ogrenci++) {
			int randomOgrenciNoGetir = rastgeleSayi.nextInt(100);
			ogrenciGetir.ogrenciAdi = kelimeUret.sonucDizisi(karakterSayisi);
			ogrenciGetir.okulNumarasi = randomOgrenciNoGetir;
			System.out.println(ogrenci + ". " + "Öğrencinin Adı= " + ogrenciGetir.ogrenciAdi + " Numarası= "
					+ ogrenciGetir.okulNumarasi);
			metotYazdirma.ayracYazdir();
			System.out.println(" ");
		}

	}
}
