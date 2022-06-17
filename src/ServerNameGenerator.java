import java.util.Random;

public class ServerNameGenerator {
    private static String[] nouns = {"house", "car", "courthouse", "school", "bank", "airport", "river", "store", "movie theater", "arcade"};
    private static String[] adjectives = {"relaxing","stressful","crowded","empty","full","destroyed","damaged","cozy","fun","exciting"};

    public static String getRandom(String[] arr){
        String result = "";
        int rand = (int)(Math.random() * arr.length);
        result = arr[rand];
        return result;
    }

    public static void main(String[] args) {
        String result = ((getRandom(adjectives)) + "-" + (getRandom(nouns)));
        System.out.println(result);
    }
}
