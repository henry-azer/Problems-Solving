import java.util.HashMap;
import java.util.Map;

public class MessageDecryption {

    public static void main(String[] args) {
        System.out.println(decryption("t1e1s2t. Hell1o, 1th1e, fir2st1"));
    }

    public static String decryption(String input) {
        String[] wordsArray = input.replaceAll("[^a-zA-Z0-9\\s]", "").split(" ");
        Map<Integer, String> wordsMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (var word : wordsArray)
            wordsMap.put(sumOfDigits(word), word.replaceAll("[^a-zA-Z\\s]", ""));

        for (var word : wordsMap.values())
            stringBuilder.append(word).append(" ");

        return stringBuilder.toString();
    }

    private static int sumOfDigits(String number) {
        int n;
        char ch;
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            ch = number.charAt(i);
            if (Character.isDigit(ch)) {
                n = Character.getNumericValue(ch);
                sum += n;
            }
        }

        return sum;
    }
}