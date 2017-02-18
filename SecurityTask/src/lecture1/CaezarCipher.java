package lecture1;


public class CaezarCipher {

    private static final String TEXT3_PATH = "text3.txt";
    private static final int OFFSET = 12;
    private static final int ALPHABET_CAPACITY = 26;

    public static void main(String[] args) {

        String str = Util.getInput(TEXT3_PATH);
        System.out.println(encode(str, OFFSET));
        System.out.println(decode(encode(str, OFFSET), OFFSET));
    }

    private static String decode(String enc, int offset) {
        return encode(enc, ALPHABET_CAPACITY - offset);
    }

    private static String encode(String enc, int offset) {
        offset = offset % ALPHABET_CAPACITY + ALPHABET_CAPACITY;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % ALPHABET_CAPACITY));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % ALPHABET_CAPACITY));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
}