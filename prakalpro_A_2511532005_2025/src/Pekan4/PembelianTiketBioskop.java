package Pekan4;
import java.util.Scanner;

public class PembelianTiketBioskop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nama, namaHari = "", namaWaktu = "", namaStudio = "";
		int jumlah, hari, waktu, studio;
		int hargaDasar = 50000;
		double biayaHari = 0, biayaWaktu = 0, biayaStudio = 0;
		double hargaPerTiket, subtotal, diskon = 0, total;
		
		System.out.print("Nama Pembeli: ");
		nama = sc.nextLine();
		System.out.print("Jumlah Tiket : ");
		jumlah = sc.nextInt();
		System.out.print("Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
		hari = sc.nextInt();
		System.out.print("Waktu Tayang (1=Pagi, 2=Siang, 3=Malam): ");
		waktu = sc.nextInt();
		System.out.print("Jenis Studio (1=Regular, 2=Deluxe, 3=Premium): ");
		studio = sc.nextInt();
		
		switch (hari) {
			case 1:
				biayaHari = 0.0;
				namaHari = "Senin-Kamis";
				break;
			case 2:
				biayaHari = 0.10;
				namaHari = "Jumat";
				break;
			case 3:
				biayaHari = 0.30;
				namaHari = "Sabtu-Minggu";
				break;
			default:
				System.out.println("Pilihan hari tidak valid!");
		}
				
		switch (waktu) {
			case 1:
				biayaWaktu = 0.0;
				namaWaktu = "Pagi";
				break;
			case 2:
				biayaWaktu = 0.10;
				namaWaktu = "Siang";
				break;
			case 3:
				biayaWaktu = 0.20;
				namaWaktu = "Malam";
				break;
			default:
				System.out.println("Pilihan waktu tidak valid!");
		}
		
		switch (studio) {
			case 1:
				biayaStudio = 0.0;
				namaStudio = "Regular";
				break;
			case 2:
				biayaStudio = 0.20;
				namaStudio = "Deluxe";
				break;
			case 3:
				biayaStudio = 0.40;
				namaStudio = "Premium";
				break;
			default:
				System.out.println("Pilihan studio tidak valid!");
		}
		
		hargaPerTiket = hargaDasar * (1 + biayaHari + biayaWaktu + biayaStudio);
		subtotal = hargaPerTiket * jumlah;
		
		if (subtotal >= 200000) {
			diskon = subtotal * 0.20;
		}
		total = subtotal - diskon;
		
		System.out.println("\n===== PEMBELIAN TIKET BIOSKOP =====");
		System.out.println("Nama Pembeli : " + nama);
		System.out.println("Jumlah Tiket : " + jumlah);
		System.out.println("Hari	    : " + namaHari);
		System.out.println("Waktu Tayang : " + namaWaktu);
		System.out.println("Jenis Studio : " + namaStudio);
		System.out.println("-------------------------------------");
		System.out.println("Harga Dasar 	: Rp " + hargaDasar + "/tiket");
		System.out.println("Biaya Hari	: + " + (int)(biayaHari * 100) + "%");
		System.out.println("Biaya Waktu	: + " + (int)(biayaWaktu * 100) + "%");
		System.out.println("Harga Per Tiket	: Rp " + (int)hargaPerTiket);
		System.out.println("Subtotal	: Rp " + (int)subtotal);
		System.out.println("Diskon (20%)	: Rp " + (int)diskon);
		System.out.println("-------------------------------------");
		System.out.println("TOTAL BAYAR 	: Rp " + (int)total);
		
		sc.close();
				}
	
}
