import java.util.List;

public class App {
    public static void main(String[] args) {
        final String[] arrOne = new String[]{"mateus", "apple", "orange", "strawberry", "mistake", "jedi", "fill"};
        final String[] arrTwo = new String[]{"six", "apple", "million", "worse", "better", "jedi", "rose"};

        FindWords findWords = new FindWords();
        List<String> result = findWords.sameWords(arrOne, arrTwo);
        System.out.println("The same words are: " + result);
    }
}
