import java.io.PrintStream;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Object fesil;

    public static void main(String[] args) {
        System.out.println("Ayin nomresini daxil edin");
        int ay = new Scanner(System.in).nextInt();

        if (ay == 3 || ay == 4 || ay == 5) {
            System.out.println("Fesil: Yaz");
        } else if (ay == 6 || ay == 7 || ay == 8) {
            System.out.println("Fesil:Yay");
        } else if (ay == 9 || ay == 10 || ay == 11) {
            System.out.println("Fesil:Payiz");
        } else if (ay == 12 || ay == 1 || ay == 2) {
            System.out.println("Fesil:Qis");
        }


        String fesil = (ay == 3 || ay == 4 || ay == 5) ? "Yaz"
                : (ay == 6 || ay == 7 || ay == 8) ? "Yay"
                : (ay == 9 || ay == 10 || ay == 11) ? "Payiz"
                : (ay == 12 || ay == 1 || ay == 2) ? "Qis"
                : "Bele fesil yoxdur";

        System.out.println("Fesil: " + fesil);

    }
}
