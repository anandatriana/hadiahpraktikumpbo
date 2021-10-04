import java.util.Scanner;
public class hadiah2_2{
	
	public static void main(String[] args){
		
		final double nilaipi = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		double jari,luas;
		
		System.out.print("Masukkan Nilai Jari-Jari : ");
		jari = input.nextDouble();
		
		luas = nilaipi*jari*jari;
		
		System.out.print("\n");
		
		System.out.println("Hasil Nilai Luas Lingkaran : " + luas);
		
		
	}
		
	
}