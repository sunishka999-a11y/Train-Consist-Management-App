import java.util.HashSet;
import java.util.Set;

public class UC3{

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nBogie IDs (duplicates automatically removed):");
        System.out.println(bogieIds);

        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        System.out.println("\nProgram continues...");
    }
}