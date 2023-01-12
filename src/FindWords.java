import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class FindWords {

    private ArrayList<String> commonWords = new ArrayList<>();
    
    public List<String> sameWords (String[] arrOne, String[] arrTwo) {
        for (String word : arrOne) {
            boolean found = tryFindWord(word, arrTwo);
            if (found) pushWord(word);
        }
        return commonWords;
    }

    private boolean tryFindWord (String word, String[] arr) {
        for (String wordArr : arr) {
            if (Objects.equals(word, wordArr)) return true;
        }
        return false;
    }

    private void pushWord(String word) {
        commonWords.add(word);
    }
}
