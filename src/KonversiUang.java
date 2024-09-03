import java.text.NumberFormat;
import java.util.Locale;

public class KonversiUang {
    public static void main(String[] args) {
        // Angka yang akan diformat
        double amount = 1000;

        // Membuat instance NumberFormat untuk format mata uang Rupiah
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        // Format angka
        String formattedAmount = currencyFormat.format(amount);

        // Menampilkan hasil
        System.out.println("Formatted Amount: " + formattedAmount);
    }
}
