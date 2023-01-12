import java.util.Objects;

public final class FindWords {
    public static void sameWords (String[] arrOne, String[] arrTwo) {
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrTwo.length; j++) {
                if (Objects.equals(arrOne[i], arrTwo[j])) {
                    System.out.println(arrOne[i]);
                }
            }
        }
    }
}
