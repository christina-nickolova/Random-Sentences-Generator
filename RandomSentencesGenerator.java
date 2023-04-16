import java.util.Random;
import java.util.Scanner;

public class RandomSentencesGenerator {
    public static void main(String[] args) {
        System.out.print("<^> <^> <^>");
        System.out.print(" RANDOM SENTENCES GENERATOR ");
        System.out.println("<^> <^> <^>");
        System.out.println();

        String[] names = {"Peter", "Michell", "Jane", "Steve", "George", "Emma"};
        String[] places = {"Sofia", "Varna", "Vratsa", "Burgas", "Plovdiv", "Vidin"};
        String[] verbs = {"eats", "holds", "sees", "plays with", "brings", "drinks"};
        String[] nouns = {"stones", "cake", "apple", "laptop", "bikes", "juice"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly", "joyfully"};
        String[] details = {"near the river", "at home", "in the park", "on the street", "in the kitchen", "at work"};

        System.out.print("Hello, this is your first random-generated sentence (Press [Enter]):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        int counter = 0;

        while (!input.equals("END")) {
            String randomName = getRandomWord(names);
            String randomPlace = getRandomWord(places);
            String randomVerb = getRandomWord(verbs);
            String randomNoun = getRandomWord(nouns);
            String randomAdverb = getRandomWord(adverbs);
            String randomDetail = getRandomWord(details);
            System.out.printf("%s from %s %s %s %s %s%n", randomName, randomPlace, randomAdverb, randomVerb, randomNoun, randomDetail);
            System.out.println("Click [Enter] to generate a new one or type END to exit the program.");
            counter++;
            input = scanner.nextLine().toUpperCase();
        }

        if (counter != 0) {
            System.out.printf("--- Great! You generated %d random sentences. We hope you had some fun. :) ---", counter);
        }
    }

    public static String getRandomWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }
}
