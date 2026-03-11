import java.util.*;

public class BannerApp {

    static class CharacterPattern {
        char ch;
        String[] pattern;

        CharacterPattern(char ch, String[] pattern) {
            this.ch = ch;
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        String word = "OOPS";

        for (int i = 0; i < 5; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(map.get(c)[i] + " ");
            }
            System.out.println();
        }
    }
}