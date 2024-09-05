import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        String lanjut = "";

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("+=======================================+");
            System.out.println("| NIM: 2411600469                       |");
            System.out.println("| Nama: Nurliah Awaliah                 |");
            System.out.println("| Program untuk mencetak jenis segitiga |");
            System.out.println("| dari tiga panjang sisi yang diinput   |");
            System.out.println("+=======================================+");
            System.out.println();

            Scanner scn = new Scanner(System.in);

            System.out.print("Input Panjang 3 Sisi: ");
            String inputLine = scn.nextLine();

            String[] inputStrings = inputLine.split(" ");
            int[] inputNumbers = new int[inputStrings.length];

            for (int i = 0; i < inputStrings.length; i++) {
                inputNumbers[i] = Integer.parseInt(inputStrings[i]);
                System.out.println("Sisi " + (i + 1) + ": " + inputNumbers[i]);
            }

            if (inputNumbers[0] == inputNumbers[1] && inputNumbers[1] == inputNumbers[2]) {
                System.out.println("Segitiga Sama Sisi");
            } else if (inputNumbers[0] == inputNumbers[1] || inputNumbers[1] == inputNumbers[2] || inputNumbers[0] == inputNumbers[2]) {
                System.out.println("Segitiga Sama Kaki");
            } else {
                System.out.println("Segitiga Sembarang");
            }

            System.out.print("Lanjut? (y/t): ");
            lanjut = scn.next();
        } while (lanjut.equals("y") );
    }
}