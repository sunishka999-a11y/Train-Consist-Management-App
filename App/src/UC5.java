import java.util.LinkedHashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Try adding duplicate
        train.add("Sleeper");  // duplicate (will be ignored)

        // Display final formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(train);
    }
}