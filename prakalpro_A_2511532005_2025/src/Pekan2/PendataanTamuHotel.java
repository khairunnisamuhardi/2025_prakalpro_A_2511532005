package Pekan2;

public class PendataanTamuHotel {
	public static void main(String[] args) {
		// ===========================
		// Konstanta
		// ===========================
		final double HARGA_PER_MALAM = 350000.0;
		final int BATAS_DEWASA = 17;
		final int BATAS_DISKON = 3;
		final double DISKON = 0.10;
		
		// ===========================
		// Variabel (data primitif)
		// ===========================
		String namaTamu = "Budi";
		int umur = 20;
		int lamaMenginap = 4;
		double totalBiaya;
		boolean isDewasa;
		boolean dapatDiskon;
		
		// ===========================
		// proses
		// ===========================
		isDewasa = umur >= BATAS_DEWASA;
		
		if (isDewasa) {
			// Cek diskon
			dapatDiskon = lamaMenginap >= BATAS_DISKON;
			
			// Hitung biaya
			totalBiaya = HARGA_PER_MALAM * lamaMenginap;
			if (dapatDiskon) {
				totalBiaya = totalBiaya - (totalBiaya * DISKON);
			}
			
			// Output
			System.out.println("=== Data Tamu Hotel ===");
			System.out.println("Nama Tamu : " + namaTamu);
			System.out.println("Umur Tamu : " + umur + " tahun");
			System.out.println("Status Tamu : Dewasa");
			System.out.println("Lama Menginap : " + lamaMenginap + "malam");
			System.out.println("Harga/Malam : Rp " + HARGA_PER_MALAM);
			
			if (dapatDiskon) {
				System.out.println("Diskon : 10%");
			} else { 
				System.out.println("Diskon : Tidak ada");
			}
			
			
			System.out.println("Total Biaya : Rp " + totalBiaya);
		} else {
			// Jika anak-anak
			System.out.println("=== Data Tamu Hotel ===");
			System.out.println("Nama Tama : " + namaTamu);
			System.out.println("Umur Tama : " + umur + "tahun");
			System.out.println("Status Tamu : Anak-anak");
			System.out.println("Maaf, anak-anak tidak boleh menginap sendirian.");
		}
	}

}
