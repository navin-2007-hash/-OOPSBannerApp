import java.util.*;

public class OOPSBannerApp8 {

    static Map<Character, String[]> map = new HashMap<>();

    static void printBanner(String word) {
        for (int i = 0; i < 5; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(map.get(c)[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        map.put('O', new String[]{" *** ","*   *","*   *","*   *"," *** "});
        map.put('P', new String[]{"**** ","*   *","**** ","*    ","*    "});
        map.put('S', new String[]{" ****","*    "," *** ","    *","**** "});

        printBanner("OOPS");
    }
}