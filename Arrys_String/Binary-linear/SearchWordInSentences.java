import java.util.*;

public class SearchWordInSentences {

    public static String searchSentence(String[] sentences, String word) {
        for (String s : sentences) {
            if (s.contains(word)) {
                return s;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] sentences = new String[n];
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }
        String word = sc.nextLine();

        System.out.println(searchSentence(sentences, word));
    }
}
