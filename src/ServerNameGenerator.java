import java.util.Random;

public class ServerNameGenerator {

    public static String generateRandom(String[] noun, String[] adjective) {
        Random random = new Random();

        int nounIndex = random.nextInt(noun.length);
        int adjectiveIndex = random.nextInt(adjective.length);

        String randomNoun = noun[nounIndex];
        String randomAdjective = adjective[adjectiveIndex];

        return randomAdjective + "-" + randomNoun;
    }

    public static void main(String[] args) {
        String[] nouns = {"sun", "moon", "flower", "bird", "mountain", "river", "ocean", "tree", "cloud", "star"};
        String[] adjectives = {"beautiful", "creative", "delightful", "exquisite", "fantastic", "gorgeous", "happy", "incredible", "joyful", "lovely"};


        System.out.println("Here is your server name:");
        System.out.println(generateRandom(nouns, adjectives));

    }
}
