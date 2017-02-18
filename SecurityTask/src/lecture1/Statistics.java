package lecture1;

import java.util.HashMap;
import java.util.Map;

public class Statistics {

    private static final String TEXT1_PATH = "text1.txt";
    private static final String TEXT2_PATH = "text2.txt";

    private static Map<Character, Integer> getStatistics(String text) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            Integer count = result.get(text.charAt(i));
            if (count != null) {
                result.put(text.charAt(i), count + 1);
            } else {
                result.put(text.charAt(i), 1);
            }
        }
        return result;
    }

    private static void printMap(Map<Character, Integer> map) {

        for (Map.Entry<Character, Integer> pair : map.entrySet()
                ) {

            System.out.println(pair.getKey() + "-->" + pair.getValue());

        }
    }

    public static void main(String[] args) {

        System.out.println("This is statistics for the first text:");
        printMap(getStatistics(Util.getInput(TEXT1_PATH)));
        System.out.println("_______________");
        System.out.println("This is statistics for the second text:");
        printMap(getStatistics(Util.getInput(TEXT2_PATH)));
    }


}

