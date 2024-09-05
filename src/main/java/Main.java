import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String lanjut = "";

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("+======================================+");
            System.out.println("| NIM: 2411600469                      |");
            System.out.println("| Nama: Nurliah Awaliah                |");
            System.out.println("| Program untuk mencetak nilai tengah  |");
            System.out.println("| dari tiga buah yang diinput          |");
            System.out.println("+======================================+");
            System.out.println();

            Scanner scn = new Scanner(System.in);

            System.out.print("Input 3 Angka: ");
            String inputLine = scn.nextLine();

            String[] inputStrings = inputLine.split(" ");
            int[] inputNumbers = new int[inputStrings.length];

            for (int i = 0; i < inputStrings.length; i++) {
                inputNumbers[i] = Integer.parseInt(inputStrings[i]);
                System.out.println("Angka " + (i + 1) + ": " + inputNumbers[i]);
            }

            boolean anyDuplicate = false;
            for (int i = 0; i < inputNumbers.length; i++) {
                for (int j = i + 1; j < inputNumbers.length; j++) {
                    if (inputNumbers[i] == inputNumbers[j]) {
                        anyDuplicate = true;
                        break;
                    }

                    if (inputNumbers[i] > inputNumbers[j]) {
                        int temp = inputNumbers[i];
                        inputNumbers[i] = inputNumbers[j];
                        inputNumbers[j] = temp;
                    }
                }
            }
            System.out.println();

            String midValue;
            if (anyDuplicate) {
                System.out.println("Angka tidak boleh sama");
                midValue = "-";
            } else {
                midValue = String.valueOf(inputNumbers[1]);
            }

            System.out.println("Nilai Tengah: " + midValue);
            System.out.println();
            System.out.print("Lanjut? (y/t): ");
            lanjut = scn.next();
        } while (lanjut.equals("y") );
    }
}