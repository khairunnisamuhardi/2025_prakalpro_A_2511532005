package Pekan7_2511532005;

import java.util.Scanner;
// Registrasi.java
public class tugasAlproPekan7_2511532005 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Akun akunBaru = new Akun();

        System.out.print("Masukkan Username : ");
        akunBaru.setUsername(input.nextLine());

        System.out.print("Masukkan Password : ");
        akunBaru.setPassword(input.nextLine());

        System.out.print("Masukkan Email : ");
        akunBaru.setEmail(input.nextLine());

        System.out.print("Masukkan PIN Angka : ");
        akunBaru.setPinAngka(input.nextInt());

        System.out.println("\n================ HASIL VALIDASI ================");

        if (!akunBaru.isPasswordValid() && !akunBaru.isEmailValid()) {
            System.out.println("ERROR: Password minimal 8 karakter! dan Email harus mengandung '@' dan '.'");
        } else if (!akunBaru.isEmailValid()) {
            System.out.println("ERROR: Email harus mengandung '@' dan '.'");
        } else if (!akunBaru.isPasswordValid()) {
        	System.out.println("ERROR: Password harus mengandung minimal 8 karakter!");
        } else {
            // Validasi Berhasil
            System.out.println("Registrasi Berhasil!");
            System.out.println("Username       : " + akunBaru.getUsername());
            System.out.println("Password       : " + akunBaru.getPassword());
            System.out.println("Email          : " + akunBaru.getEmail());
            System.out.println("PIN            : " + akunBaru.getPinAngka());

            // Manipulasi String
            System.out.println("\n---- Manipulasi String ----");
            System.out.println("Username Upper : " + akunBaru.getUsername().toUpperCase());
            System.out.println("Email Lower    : " + akunBaru.getEmail().toLowerCase());
            System.out.println("Panjang Username : " + akunBaru.getUsername().length());
        }
    }

}
