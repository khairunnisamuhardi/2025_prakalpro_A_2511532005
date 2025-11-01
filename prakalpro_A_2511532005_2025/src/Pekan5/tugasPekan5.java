package Pekan5;

public class tugasPekan5 {
    public static void main(String[] args) {
        int n = 4;
        int width = 23; // jumlah "=" di border

        // baris atas
        System.out.print("#");
        for (int i = 0; i < width; i++) {
            System.out.print("=");
        }
        System.out.println("#");

        // bagian atas
        for (int i = 1; i <= n; i++) {
            System.out.print("|");

            // spasi kiri
            for (int j = 1; j < (n - i) * 2 + 2; j++) {
                System.out.print(" ");
            }

            // cetak <>
            System.out.print(" <> ");

            // titik-titik
            for (int j = 1; j < i; j++) {
                System.out.print("....");
            }

            // cetak <>
            System.out.print(" <> ");

            // spasi kanan
            for (int j = 1; j <= (n - i) * 2 + 2; j++) {
                System.out.print(" ");
            }

            System.out.println("|");
        }

        // bagian bawah
        for (int i = n; i >= 1; i--) {
            System.out.print("|");

            // spasi kiri
            for (int j = 1; j <= (n - i) * 2 + 2; j++) {
                System.out.print(" ");
            }

            // cetak <>
            System.out.print("<> ");

            // titik-titik
            for (int j = 1; j < i; j++) {
                System.out.print("....");
            }

            // cetak <>
            System.out.print(" <>");

            // spasi kanan
            for (int j = 1; j <= (n - i) * 2 + 2; j++) {
                System.out.print(" ");
            }

            System.out.println(" |");
        }

        // baris bawah
        System.out.print("#");
        for (int i = 0; i < width; i++) {
            System.out.print("=");
        }
        System.out.println("#");
    }
}
