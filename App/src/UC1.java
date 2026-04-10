import java.util.ArrayList;
import java.util.List;

public class UC1{

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist (list of bogies)
        List<String> trainConsist = new ArrayList<>();



        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues...
        System.out.println("System ready to add bogies...");
    }
}