import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * ===============================================================
 * MAIN CLASS - ValidateTrainAndCargo
 * ===============================================================
 *
 * Use Case 11: Validate Train ID & Cargo Code using Regex
 */
public class UC11{

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC11 - Validate Train ID & Cargo Code");
        System.out.println("========================================\n");

        Scanner sc = new Scanner(System.in);

        // ---- Input ----
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // ---- Regex Patterns ----
        String trainPatternStr = "TRN-\\d{4}";
        String cargoPatternStr = "PET-[A-Z]{2}";

        Pattern trainPattern = Pattern.compile(trainPatternStr);
        Pattern cargoPattern = Pattern.compile(cargoPatternStr);

        // ---- Matcher ----
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // ---- Validation ----
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // ---- Output ----
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        sc.close();

        System.out.println("\nUC11 operations completed successfully...");
    }
}



