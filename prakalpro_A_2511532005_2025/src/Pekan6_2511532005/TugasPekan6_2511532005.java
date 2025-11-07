package Pekan6_2511532005;

import java.util.Random;
import java.util.Scanner;

public class TugasPekan6_2511532005 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int percobaan = 0;
        boolean menang = false;

        while (!menang) {
            percobaan++;
            
            int dadu1 = rand.nextInt(6) + 1;
            int dadu2 = rand.nextInt(6) + 1;

            System.out.println(dadu1 + " + " + dadu2 + " = ?");
            System.out.print("Tebakan Anda: ");
            int tebakan = input.nextInt();

            int hasil = dadu1 + dadu2;

            if (tebakan == hasil) {
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda menang setelah " + percobaan + " percobaan!");
                menang = true;
            } else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
                String jawaban = input.next();

                if (!jawaban.equalsIgnoreCase("ya")) {
                    System.out.println("Permainan selesai. Anda kalah.");
                    break;
                }
            }
        }

        input.close();
    }
}

