package metodlar;

public class MethodOverload {
	public static void main(String[] args) {
		int s1 = 5, s2 = 4, s3 = 12;
		String sayi1 = "14";
		String sayi2 = "23";
		int sonucsafak = topla(sayi1, sayi2);
		System.out.println(sonucsafak);
		
		int neslihan = 0, sonuc2 = 0;
		neslihan = topla(s1, s2);
		sonuc2 = topla(s1, s2, s3);
		System.out.println(neslihan);
		System.out.println(sonuc2);
	}
	
	static int topla(int s1, int s2) {
		return s1 + s2;
	}
	static int topla(int s1, int s2, int s3){
		return s1 + s2 + s3;
	}
	static int topla(String veri1, String veri2)
	{
		int sayi1 = Integer.valueOf(veri1);
		int sayi2 = Integer.valueOf(veri2);
		int safak = sayi1 + sayi2; 
		return safak;
	}

}
