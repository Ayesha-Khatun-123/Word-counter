
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class WordCounter {

    public static void main(String[] args) {
        //take user input
        String userInput = getUserInput();
        //print the input
        System.out.println(userInput);

          //read
        String text = readInput(userInput);

        //split the text
        String[] words = text.split("\\s+|\\p{Punct}");

        
        Set<String> stopWords = createStopWordsSet();

        
        int wordCount = 0;

        //  Iterate through the array of words and increment the counter
        for (String word : words) {
            // Step 7: Ignore common words or stop words
            if (!stopWords.contains(word.toLowerCase())) {
                wordCount++;
            }
        }

        //  the total count of words to the user
        System.out.println("Total words: " + wordCount);

        
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            if (!stopWords.contains(word.toLowerCase())) {
                uniqueWords.add(word.toLowerCase());
            }
        }
        System.out.println("Number of unique words: " + uniqueWords.size());

        // Step 8: Provide statistics like the frequency of each word
        System.out.println("Word frequency:");
        for (String uniqueWord : uniqueWords) {
            int frequency = countWordFrequency(words, uniqueWord);
            System.out.println(uniqueWord + ": " + frequency);
        }
    }

    private static String getUserInput() {
        //  a scanner  to get user input
        // use a simple word Ayesha khtaun
        return "Ayesha Khatun";
    }

    private static String readInput(String userInput) {
        
        return userInput;
    }

    private static Set<String> createStopWordsSet() {
        
        String[] stopWordsArray = {"a", "an", "the", "and", "is", "in", "of", "to", "with"};

        Set<String> stopWordsSet = new HashSet<>();
        for (String stopWord : stopWordsArray) {
            stopWordsSet.add(stopWord);
        }
        return stopWordsSet;
    }

    private static int countWordFrequency(String[] words, String targetWord) {
        int frequency = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase(targetWord)) {
                frequency++;
            }
        }
        return frequency;
    }
}

    

