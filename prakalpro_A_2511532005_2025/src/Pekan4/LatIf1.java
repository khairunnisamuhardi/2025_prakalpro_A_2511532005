package Pekan4;
import java.util.Scanner;

public class LatIf1 {
	public static void main(String[] args) {
		double IPK;
		Scanner input=new Scanner (System.in);
		System.out.println("input IPK anda = ");
		IPK=input.nextDouble();
		input.close();
		if(IPK>2.75) {
			System.out.println("anda Lulus Sangat Memuaskan dengan IPK "+IPK);
		} else {
			System.out.println("Anda Tidak Lulus");
		}
	}
	

}
