public class Palindrome {
    public static void main(String[] args) {
        String word = "madam";
        boolean result = isPalindrome(word);
        System.out.println("\"" + word + "\" is a palindrome? " + result);
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Ubah semua menjadi huruf kecil
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Jika ada huruf yang berbeda, bukan palindrom
            }
            left++;
            right--;
        }
        return true; // Jika semua huruf sama, berarti palindrom
    }
}
