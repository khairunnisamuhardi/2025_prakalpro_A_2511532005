package Pekan3;
import java.util.Scanner;

public class VolumeTabung {
	public static void main(String[] args) {
		double phi = 3.14;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Masukkan jari-jari tabung: ");
		double r = keyboard.nextInt();
		
		System.out.print("Masukkan tinggi tabung: ");
		double t = keyboard.nextInt();
		
		boolean valid = (r > 0) && (t > 0);
		
		double volume = (3.14 * r * r * t);
		
		if (valid) {
			System.out.println("Volume tabung = " + volume);
		} else {
			System.out.println("Input tidak valid! Jari-jari dan tinggi harus lebih dari 0.");
		}
		
		
		keyboard.close();
	}

}
