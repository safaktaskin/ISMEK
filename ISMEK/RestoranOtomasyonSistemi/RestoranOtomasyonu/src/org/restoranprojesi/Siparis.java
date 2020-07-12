package org.restoranprojesi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Siparis {

	static Random random = new Random();

	
	
	static Scanner oku = new Scanner(System.in);

	public static void siparisEkle() {
		
		 ArrayList<MasalarDto> masaListesi = VeritabaniIslemleri.masalariGetir();
		 int FK_MasaNo = random.nextInt(masaListesi.size() - 1);
		 ArrayList<PersonelDto> personelListesi = VeritabaniIslemleri.personelGetir();
		 int FK_PersonelId = random.nextInt(personelListesi.size() - 1);
		 ArrayList<UrunlerDto> urunListesi = VeritabaniIslemleri.urunleriGetir();
		 int FK_UrunId = random.nextInt(urunListesi.size() - 1);
		
		System.out.println("Siparişinizi alabilir miyim?");
		String UrunAdi = urunListesi.get(FK_UrunId).getUrunAdi();
		float UrunFiyat = urunListesi.get(FK_UrunId).getUrunFiyat();
		System.out.println("***************************");
		System.out.println("Siparişim: " + UrunAdi);

		int masaNo = masaListesi.get(FK_MasaNo).getMasaNo();
		System.out.println("Masa numaranız: " + masaNo);

		String PersonelAdi = personelListesi.get(FK_PersonelId).getPersonelAdi();
		System.out.println("İlgilenen Personelin Adı:" + PersonelAdi);
		System.out.println("*****************************");

		Connection con = null;
		try {
			con = Ayarlar.getConnection();
			Statement stmt = con.createStatement();
			String sorgu = "insert into siparis(FK_PersonelId, FK_MasaNo, FK_UrunId, PersonelAdi, UrunFiyat, UrunAdi) values ( ?, ?, ?, ?, ?, ?)";
			PreparedStatement prepareStatement = con.prepareStatement(sorgu);
			prepareStatement.setInt(1, FK_PersonelId);
			prepareStatement.setInt(2, FK_MasaNo);
			prepareStatement.setInt(3, FK_UrunId);
			prepareStatement.setString(4, PersonelAdi);
			prepareStatement.setFloat(5, UrunFiyat);
			prepareStatement.setString(6, UrunAdi);

			prepareStatement.execute();

		} catch (Exception e) {

			System.out.println(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Hata oluştu. Bağlantı bile kapatılamadı.");
			}
		}
		System.out.println("Kayıt eklendi");
	}

	public static void siparisListele() {
		Connection con = null;
		try {

			con = Ayarlar.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from siparis");
			while (rs.next()) {
				int SiparisId = rs.getInt("siparisid");
				int FK_PersonelId = rs.getInt("FK_PersonelId");
				int FK_MasaNo = rs.getInt("FK_MasaNo");
				int FK_UrunId = rs.getInt("FK_UrunId");
				String PersonelAdi = rs.getString("PersonelAdi");
				float UrunFiyat = rs.getFloat("UrunFiyat");
				String UrunAdi = rs.getString("UrunAdi");
				System.out.println(SiparisId + "  " + FK_PersonelId + "  " + FK_MasaNo + "  " + FK_UrunId + " "
						+ PersonelAdi + " " + UrunFiyat + " " + UrunAdi);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Hata oluştu. Bağlantı bile kapatılamadı.");
			}
		}
	}
	
	public static ArrayList<SiparisDto> siparisGetir() {
		Connection con = null;
		ArrayList<SiparisDto> siparistDtoList = new ArrayList<SiparisDto>();
		try {

			con = Ayarlar.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from siparis");
			while (rs.next()) {
				SiparisDto siparisDto = new SiparisDto();
				int SiparisId = rs.getInt("siparisid");
				int FK_PersonelId = rs.getInt("FK_PersonelId");
				int FK_MasaNo = rs.getInt("FK_MasaNo");
				int FK_UrunId = rs.getInt("FK_UrunId");
				String PersonelAdi = rs.getString("PersonelAdi");
				float UrunFiyat = rs.getFloat("UrunFiyat");
				String UrunAdi = rs.getString("UrunAdi");
				System.out.println(SiparisId + "  " + FK_PersonelId + "  " + FK_MasaNo + "  " + FK_UrunId + " "
						+ PersonelAdi + " " + UrunFiyat + " " + UrunAdi);
				siparisDto.setSiparisId(SiparisId);
				siparisDto.setFK_PersonelId(FK_PersonelId);
				siparisDto.setFK_MasaNo(FK_MasaNo);
				siparisDto.setFK_UrunId(FK_UrunId);
				siparisDto.setPersonelAdi(PersonelAdi);
				siparisDto.setUrunFiyat(UrunFiyat);
				siparisDto.setUrunAdi(UrunAdi);
				siparistDtoList.add(siparisDto);

			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Hata oluştu. Bağlantı bile kapatılamadı.");
			}
		}
		return siparistDtoList;
	}
}
