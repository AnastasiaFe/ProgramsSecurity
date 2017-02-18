package lecture1;


public class Xor {
    public static void main(String[] args) {

    }

    private static boolean getResult(boolean a, boolean b) {
        return a & !b | b & !a;
        
    }
}
