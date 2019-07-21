import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите двоичное число: ");
            String number = in.nextLine();

            System.out.println(Integer.parseInt(number, 2));
        } catch (NumberFormatException e) {
            System.out.println("Введенное значение не является двоичным числом");
        }

    }
}
