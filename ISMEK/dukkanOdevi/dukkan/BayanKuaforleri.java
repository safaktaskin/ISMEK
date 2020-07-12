package dukkanProperty;

public class BayanKuaforleri extends DukkanPropertyNameOlustur {
	String kullanilanBoyaMarkasi;
	String kuaforSahibi;
	double boyaFiyati = 40;

	public void sacKeser() {
		System.out.println("Saç kesimi yapılır.");
	}

	public double boyaYap(double cebindekiToplamPara) {
		double paraUstu = cebindekiToplamPara - boyaFiyati;
		kullanilanBoyaMarkasi = "WELLA";
		System.out.println(kullanilanBoyaMarkasi + " marka boya ile boya yapılır.");
		if (paraUstu >= 0) {
			System.out.println("Boya yapıldı.");
			return paraUstu;
		} else {
			System.out.println("Paranız yetmediği için boya yapılmadı.");
			return cebindekiToplamPara;
		}

	}

	@Override
	void dukkaninKapanisSaati() {
		System.out.println("Her akşam 10'da kapanır.");
	}

}
