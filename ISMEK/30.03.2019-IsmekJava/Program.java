package ismek;

public class Program {

	public static void main(String[] args) {
		
		EgitmenCalisan egitmen = new EgitmenCalisan();
		egitmen.calisanlarinAdi = "AT�LLA";
		egitmen.calisanlarinSoyadi = "KARTAL";
		egitmen.calisanlarinYasi = 32;
		egitmen.calismaSaatleri = 6;
		
		TemizlikGorevlisi temizlikGorevlisiOlustur = new TemizlikGorevlisi();
		temizlikGorevlisiOlustur.calisanlarinAdi = "�AFAK";
		temizlikGorevlisiOlustur.calisanlarinSoyadi = "TA�KIN";
		temizlikGorevlisiOlustur.calisanlarinYasi = 23;
		temizlikGorevlisiOlustur.calismaSaatleri = 8;
		temizlikGorevlisiOlustur.gorevKati = 2;
		temizlikGorevlisiOlustur.temizlikMalzemeleri = "Vileda";
	}

}
