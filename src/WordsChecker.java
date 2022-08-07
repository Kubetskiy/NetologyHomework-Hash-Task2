import java.util.Collections;
import java.util.HashSet;

public class WordsChecker {
    HashSet<String> wordsHashSet = new HashSet<>();

    public WordsChecker(String text) {
        Collections.addAll(wordsHashSet, text.split("\\P{IsAlphabetic}+"));
    }

    public boolean hasWord(String s) {
        return wordsHashSet.contains(s);
    }
}
