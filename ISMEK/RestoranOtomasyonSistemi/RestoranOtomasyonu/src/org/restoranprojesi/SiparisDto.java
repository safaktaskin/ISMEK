package org.restoranprojesi;

public class SiparisDto {

	int SiparisId;
	int FK_PersonelId;
	int FK_MasaNo;
	int FK_UrunId;
	String PersonelAdi;
	float UrunFiyat;
	String UrunAdi;
	public int getSiparisId() {
		return SiparisId;
	}
	public void setSiparisId(int siparisId) {
		SiparisId = siparisId;
	}
	public int getFK_PersonelId() {
		return FK_PersonelId;
	}
	public void setFK_PersonelId(int fK_PersonelId) {
		FK_PersonelId = fK_PersonelId;
	}
	public int getFK_MasaNo() {
		return FK_MasaNo;
	}
	public void setFK_MasaNo(int fK_MasaNo) {
		FK_MasaNo = fK_MasaNo;
	}
	public int getFK_UrunId() {
		return FK_UrunId;
	}
	public void setFK_UrunId(int fK_UrunId) {
		FK_UrunId = fK_UrunId;
	}
	public String getPersonelAdi() {
		return PersonelAdi;
	}
	public void setPersonelAdi(String personelAdi) {
		PersonelAdi = personelAdi;
	}
	public float getUrunFiyat() {
		return UrunFiyat;
	}
	public void setUrunFiyat(float urunFiyat) {
		UrunFiyat = urunFiyat;
	}
	public String getUrunAdi() {
		return UrunAdi;
	}
	public void setUrunAdi(String urunAdi) {
		UrunAdi = urunAdi;
	}
	
	
}
