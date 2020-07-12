package donguler;
import java.util.Scanner;
public class ciftSayi {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in;)
		System.out.print("Kaça kadar yazdırılacak: ");
		int ciftSayilarKacaKadar = klavyedenOku.nextInt();
		for(int i = 0; i <= ciftSayilarKacaKadar; i = i + 2){
			System.out.println(i);
		}
	}

}
