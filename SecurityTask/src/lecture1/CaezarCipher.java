package lecture1;


public class CaezarCipher {

    private static final String TEXT3_PATH = "text3.txt";
    private static final int OFFSET = 12;

    public static void main(String[] args) {

        String str = Util.getInput(TEXT3_PATH);
        System.out.println(encode(str, OFFSET));
        System.out.println(decode(encode(str, OFFSET), OFFSET));
    }

    private static String encode(String input, int key) {
        StringBuilder sb = new StringBuilder(input.length());

        for (char c : input.toCharArray()) {
            sb.append((char)(c + key));
        }

        return sb.toString();
    }

    private static String decode(String input, int key) {
        return encode(input, -key);
    }
}