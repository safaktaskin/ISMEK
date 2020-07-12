package dukkanProperty;

public class Okul extends DukkanPropertyNameOlustur{
	  static int ogrenciSayisi;
	  int tost = 4;
	  int ayran = 3;
	
	
	
	public static int sinifOlustur(int sayi1, int sayi2) {
		
		if(ogrenciSayisi < 40) {
			System.out.println("Sınıfa öğrenci alma sınırına ulaşıldı.");
		}
		else {
			System.out.println("Öğrenci sayısı yetersiz olduğu için sınıf oluşturulamadı.");
		}
		
		return 0;
	}
	
	@Override
	void dukkaninAcilisSaati() {
		System.out.println("Hafta içi her sabah saat 9'da açılır.");
	}
	@Override
	void dukkaninKapanisSaati() {
		System.out.println("Hafta içi her öğlen 13.00'de kapanır.");
	}

	
	public double kantineGit(double cebindekiToplamPara) {
		double paraUstu = cebindekiToplamPara - tost + ayran;
		if (paraUstu >= 0) {
			System.out.println("Afiyat olsun çocuğum.");
			return paraUstu;
		} else {
			System.out.println("Paran yetmiyor maalesef :( ");
			return cebindekiToplamPara;
		}

	}
}
