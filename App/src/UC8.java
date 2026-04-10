import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ===============================================================
 * MAIN CLASS - FilterBogiesUsingStreams
 * ===============================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 */
public class UC8{

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC8 - Filter Bogies Using Streams");
        System.out.println("========================================\n");

        // ---- Original List (same as UC7) ----
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Original Bogies:");
        bogies.forEach(System.out::println);

        // ---- Stream Filtering (capacity > 60) ----
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // ---- Display Filtered List ----
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        System.out.println("\nUC8 operations completed successfully...");
    }
}