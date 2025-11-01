package Pekan5;

public class tugasPekan5 {
    public static void main(String[] args) {
        int n = 4;
        int width = 23; 
        
        System.out.print("#");
        for (int i = 0; i < width; i++) {
            System.out.print("=");
        }
        System.out.println("#");

        for (int i = 1; i <= n; i++) {
            System.out.print("|");

            for (int j = 1; j < (n - i) * 2 + 2; j++) {
                System.out.print(" ");
            }

            System.out.print(" <> ");

            for (int j = 1; j < i; j++) {
                System.out.print("....");
            }

            System.out.print(" <> ");

            for (int j = 1; j <= (n - i) * 2 + 2; j++) {
                System.out.print(" ");
            }

            System.out.println("|");
        }

        for (int i = n; i >= 1; i--) {
            System.out.print("|");

            for (int j = 1; j <= (n - i) * 2 + 2; j++) {
                System.out.print(" ");
            }

            System.out.print("<> ");

            for (int j = 1; j < i; j++) {
                System.out.print("....");
            }

            System.out.print(" <>");

            for (int j = 1; j <= (n - i) * 2 + 2; j++) {
                System.out.print(" ");
            }

            System.out.println(" |");
        }

        System.out.print("#");
        for (int i = 0; i < width; i++) {
            System.out.print("=");
        }
        System.out.println("#");
    }
}
