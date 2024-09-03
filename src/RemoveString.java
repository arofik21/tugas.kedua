public class RemoveString {
    public static String removeFirstOccurrence(String str, String substring) {
        int index = str.indexOf(substring);
        if (index != -1) {
            return str.substring(0, index) + str.substring(index + substring.length());
        } else {
            return str; // Jika substring tidak ditemukan, kembalikan string aslinya
        }
    }

    public static void main(String[] args) {
        String originalString = "Hello world";
        String substringToRemove = "ell";
        String result = removeFirstOccurrence(originalString, substringToRemove);
        System.out.println(result);
    }
}