package Pekan7_2511532005;

import java.util.Scanner;
// Registrasi.java

public class tugasAlproPekan7_2511532005 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("===== REGISTRASI AKUN BARU =====");
		System.out.print("Masukkan Username: ");
		String Username = input.nextLine();
		
		System.out.print("Masukkan Password: ");
		String Password = input.nextLine();
		System.out.print("Masukkan Email: ");
		String Email = input.nextLine();
		System.out.print("Masukkan PIN (6 digit): ");
		int pinAngka = input.nextInt();
		
		
		Akun a = new Akun();
		 a.setUsername(Username);
		 a.setPassword(Password);
		 a.setEmail(Email);
		 a.setPinAngka(pinAngka);
		
		
		if (!a.isEmailValid()) {
			System.out.println("\n--- REGISTRASI GAGAL ---");
			System.out.println("Email Anda \"" + Email + "\" tidak valid (harus mengandung '@' dan '.').");
			System.out.println("Silahkan coba lagi.");
			return;	
		}
		
		
		if (!a.isPasswordValid()) {
			System.out.println("\n--- REGISTRASI GAGAL ---");
			System.out.println("Password \" " + Password + "\" tidak valid (harus 8 digit angka).");
			System.out.println("Silahkan coba lagi.");
			return;
		}
	
		 
		
		 System.out.println("\n--- REGISTRASI BERHASIL ---");
	        System.out.println("Akun untuk \"" + Username + "\" telah berhasil dibuat.");
	        
	        System.out.println("\n--- Detail Akun ---");
	        System.out.print("username (LowerCase) :");
	        System.out.println (Username.toLowerCase());
	        System.out.print("email (UpperCase) :");
	        System.out.println (Email.toUpperCase());
	        System.out.print("ID Pengguna (Gabungan) :");
	        System.out.println (Username + pinAngka);
	        
	        int hasilInt = a.getPinAngka() + 10;
	    
	        System.out.println("\n--- Uji Tipe Data (PIN Anda: " + pinAngka + ") ---");
	        System.out.println("PIN (int) + 10    = "  + hasilInt);
	        System.out.println("PIN (String) + \"" + 10 + "\" = " + (String.valueOf(pinAngka) + "10"));

	        input.close();
	}
}
