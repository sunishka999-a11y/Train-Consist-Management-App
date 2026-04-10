import java.util.ArrayList;
import java.util.List;
/**
 * ===============================================================
 * MAIN CLASS - TotalSeatCalculation
 * ===============================================================
 *
 * Use Case 10: Count Total Seats using reduce()
 */
public class UC10{

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC10 - Total Seating Capacity");
        System.out.println("========================================\n");

        // ---- Create Bogie List ----
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // ---- Stream Aggregation ----
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        // ---- Display result ----
        System.out.println("Total Seating Capacity of Train: " + totalSeats);

        System.out.println("\nUC10 operations completed successfully...");
    }
}