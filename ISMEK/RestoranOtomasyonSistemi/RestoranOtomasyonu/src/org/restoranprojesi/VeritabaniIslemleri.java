package org.restoranprojesi;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class VeritabaniIslemleri {

	static Scanner klavyedenOku = new Scanner(System.in);

	// urun tablosu için oluşturuldu.

	public static void urunEkle() {

		System.out.print("Urun adi giriniz: ");
		String UrunAdi = klavyedenOku.next();
		System.out.print("Urun turu giriniz: ");
		String UrunTuru = klavyedenOku.next();
		System.out.print("Urun fiyatini giriniz: ");
		float UrunFiyat = klavyedenOku.nextFloat();

		Connection con = null;
		try {
			con = Ayarlar.getConnection();
			String sorgu = "insert into urun (UrunAdi, UrunTuru, UrunFiyat) values (?, ?, ?)";
			PreparedStatement prepareStatement = con.prepareStatement(sorgu);
			prepareStatement.setString(1, UrunAdi);
			prepareStatement.setString(2, UrunTuru);
			prepareStatement.setFloat(3, UrunFiyat);

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

	public static void urunleriListele() {
		Connection con = null;
		try {

			con = Ayarlar.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from urun");
			while (rs.next()) {
				int UrunId = rs.getInt(1);
				String UrunAdi = rs.getString(2);
				String UrunTuru = rs.getString(3);
				float UrunFiyat = rs.getFloat(4);
				System.out.println(UrunId + "  " + UrunAdi + "  " + UrunTuru + "  " + UrunFiyat);
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

	public static ArrayList<UrunlerDto> urunleriGetir() {
		Connection con = null;
		ArrayList<UrunlerDto> UrunDtoList = new ArrayList();
		try {
			con = Ayarlar.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from urun");
			while (rs.next()) {
				UrunlerDto urunDto = new UrunlerDto();
				int UrunId = rs.getInt(1);
				String UrunAdi = rs.getString(2);
				String UrunTuru = rs.getString(3);
				float UrunFiyat = rs.getFloat(4);
				urunDto.setUrunId(UrunId);
				urunDto.setUrunAdi(UrunAdi);
				urunDto.setUrunTuru(UrunTuru);
				urunDto.setUrunFiyat(UrunFiyat);
				UrunDtoList.add(urunDto);
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
		return UrunDtoList;
	}
	// personel tablosu için oluşturuldu.

	public static void calisanEkle() {

		System.out.print("Yeni calisanin adini giriniz: ");
		String CalisanAdi = klavyedenOku.next();
		System.out.print("Calisanin gorevini giriniz: ");
		String CalisanGorevi = klavyedenOku.next();

		Connection con = null;
		try {
			con = Ayarlar.getConnection();
			String sorgu = "insert into personel (PersonelAdi, PersonelGorevi) values (?, ?)";
			PreparedStatement prepareStatement = con.prepareStatement(sorgu);
			prepareStatement.setString(1, CalisanAdi);
			prepareStatement.setString(2, CalisanGorevi);

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

	public static void personelListele() {
		Connection con = null;
		try {
			con = Ayarlar.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from personel");
			while (rs.next()) {
				int CalisanId = rs.getInt(1);
				String CalisanAdi = rs.getString(2);
				String CalisanGorevi = rs.getString(3);
				System.out.println(CalisanId + "  " + CalisanAdi + "  " + CalisanGorevi);
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

	public static ArrayList<PersonelDto> personelGetir() {
		Connection con = null;
		ArrayList<PersonelDto> personelDtoList = new ArrayList();
		try {
			con = Ayarlar.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from personel");
			while (rs.next()) {
				PersonelDto personelDto = new PersonelDto();
				int CalisanId = rs.getInt(1);
				String CalisanAdi = rs.getString(2);
				String CalisanGorevi = rs.getString(3);
				personelDto.setPersonelId(CalisanId);
				personelDto.setPersonelAdi(CalisanAdi);
				personelDto.setPersonelGorevi(CalisanGorevi);
				personelDtoList.add(personelDto);
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
		return personelDtoList;
	}

	// masa tablosu için oluşturuldu.

	public static void masaEkle() {

		System.out.print("Kac kisiniz: ");
		int KisiSayisi = klavyedenOku.nextInt();

		Connection con = null;
		try {
			con = Ayarlar.getConnection();
			String sorgu = "insert into masa (KisiSayisi) values (?)";
			PreparedStatement prepareStatement = con.prepareStatement(sorgu);
			prepareStatement.setInt(1, KisiSayisi);

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

	public static void masalariListele() {
		Connection con = null;
		try {
			con = Ayarlar.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from masa");
			while (rs.next()) {
				int MasaNo = rs.getInt(1);
				int KisiSayisi = rs.getInt(2);
				System.out.println(MasaNo + "  " + KisiSayisi);
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

	public static ArrayList<MasalarDto> masalariGetir() {
		Connection con = null;
		ArrayList<MasalarDto> masalarDtoList = new ArrayList();
		try {
			con = Ayarlar.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from masa");
			while (rs.next()) {
				MasalarDto masaDto = new MasalarDto();
				int MasaNo = rs.getInt(1);
				int KisiSayisi = rs.getInt(2);
				masaDto.setMasaNo(MasaNo);
				masaDto.setKisiSayisi(KisiSayisi);
				masalarDtoList.add(masaDto);
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
		return masalarDtoList;
	}


}