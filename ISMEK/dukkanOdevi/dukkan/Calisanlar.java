package dukkanProperty;

public class Calisanlar {

	String adi;
	byte calismaSaati;
	String gorevi;
	double maas = 1000;
	String cinsiyet;
	byte deneyimSuresi;
	int carpan;

	void iseGelir() {
		System.out.println("Sabah 08:00 de işe gelir");
	}

	void istenCikar() {
		System.out.println("Akşam 18:00 de işten çıkar");
	}

	double maasHesapla() {
		return calismaSaati * maas * carpan;
	}
}
