import java.util.Scanner;

public class MiniUtility {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== MINI UTILITY PROGRAM ===");
            System.out.println("1. Kalkulator CLI");
            System.out.println("2. Konversi Suhu");
            System.out.println("3. Keluar");
            System.out.println("Pilih menu (1/2/3): ");

            int menu= input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n--- Kalkulator ---");
                    System.out.println("masukan angka pertama: ");
                    double num1 = input.nextDouble();

                    System.out.println("Masukan operator (+, -, *, /): ");
                    String operator =input.next();

                    System.out.println("Masukan angka kedua: ");
                    double num2 = input.nextDouble();

                    double result = 0;
                    boolean validOp = true;

                    //Logika kalkulator
                    if (operator.equals("+")) result = num1 + num2;
                    else if (operator.equals("-")) result = num1 - num2;
                    else if (operator.equals("*")) result = num1 * num2;
                    else if (operator.equals("/")) result = num1 / num2;

                    if (validOp) {
                        System.out.println("Hasil:" + result);
                    } else {
                        System.out.println("Operator tidak valid!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Konversi Suhu ---");
                    System.out.println("Masukan suhu dalam Celsius: ");
                    double celcius = input.nextDouble();

                    //Logika konversi suhu
                    double fahrenheit = (celcius*9/5) + 32;
                    double kelvin = celcius + 273.15;

                    System.out.print(celcius + " C=" + fahrenheit + " F");
                    System.out.print(celcius + " C=" + kelvin + " K");
                    break;

                case 3:
                    System.out.print("Keluar daari program. Bye!");
                    isRunning = false;
                    break;

                default:
                    System.out.print("Menu tidak tersedia. Silakan coba lagi.");

            }
        }
        //Menutup scanner
        input.close();
    }
}
