import java.util.Random;

public class ServerNameGenerator {
    // Create a method that generates a random combination of a noun and an adjective
    public static String generateRandom(String[] noun, String[] adjective) {
        // Create a random object
        Random random = new Random();
        // Generate a random index for the noun array
        int nounIndex = random.nextInt(noun.length);
        // Generate a random index for the adjective array
        int adjectiveIndex = random.nextInt(adjective.length);
        // Select a random noun and adjective using the generated indices
        String randomNoun = noun[nounIndex];
        String randomAdjective = adjective[adjectiveIndex];
        // Combine the adjective and noun with a hyphen and return the result
        return randomAdjective + "-" + randomNoun;
    }

    public static void main(String[] args) {
        // Create an array of nouns
        String[] nouns = {"sun", "moon", "flower", "bird", "mountain", "river", "ocean", "tree", "cloud", "star"};
        // Create an array of adjectives
        String[] adjectives = {"beautiful", "creative", "delightful", "exquisite", "fantastic", "gorgeous", "happy", "incredible", "joyful", "lovely"};

        // Generate a random combination of noun and adjective and print it
        System.out.println("Here is your server name:");
        System.out.println(generateRandom(nouns, adjectives));

    }
}
