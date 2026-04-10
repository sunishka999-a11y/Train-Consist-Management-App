import java.util.*;

/**
 * ===============================================================
 * MAIN CLASS - SafetyCheckApp
 * ===============================================================
 * Use Case 12: Safety Compliance using Streams
 */
public class UC12{

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("========================================\n");

        // ---- Create Goods Bogies ----
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogie("Open", "Coal"));             // allowed
        bogies.add(new GoodsBogie("Box", "Grain"));             // allowed

        //  Try changing this to test failure:
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // ---- Stream Validation ----
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical")
                                || b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // ---- Output ----
        System.out.println("Safety Validation Result:");

        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ");
        } else {
            System.out.println("Train is NOT SAFE ");
        }

        System.out.println("\nUC12 operations completed successfully...");
    }
}
