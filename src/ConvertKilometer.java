import java.util.Scanner;
public class ConvertKilometer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang dalam sentimeter: ");
        double cm = scanner.nextDouble();

        // 1 kilometer = 100.000 sentimeter
        double km = cm / 100000;

        System.out.println(cm + " cm sama dengan " + km + " km");
    }
}