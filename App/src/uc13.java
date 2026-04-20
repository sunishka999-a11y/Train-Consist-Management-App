import java.util.*;
import java.util.stream.Collectors;

public class uc13 {

    // 🔹 Generate dataset
    public List<PassengerBogie> generateBogies(int count) {
        List<PassengerBogie> bogies = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            bogies.add(new PassengerBogie("Bogie-" + i, (i % 100) + 1));
        }
        return bogies;
    }

    // 🔹 Loop-based filtering
    public List<PassengerBogie> filterWithLoop(List<PassengerBogie> bogies) {
        List<PassengerBogie> result = new ArrayList<>();
        for (PassengerBogie b : bogies) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // 🔹 Stream-based filtering
    public List<PassengerBogie> filterWithStream(List<PassengerBogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    // 🔹 Measure loop performance
    public long measureLoopTime(List<PassengerBogie> bogies) {
        long start = System.nanoTime();
        filterWithLoop(bogies);
        long end = System.nanoTime();
        return end - start;
    }

    // 🔹 Measure stream performance
    public long measureStreamTime(List<PassengerBogie> bogies) {
        long start = System.nanoTime();
        filterWithStream(bogies);
        long end = System.nanoTime();
        return end - start;
    }

    // 🔹 Main method (execution flow)
    public static void main(String[] args) {

        uc13 uc13 = new uc13();

        System.out.println("========================================");
        System.out.println("UC13 - Loop vs Stream Performance");
        System.out.println("========================================\n");

        // Create dataset
        List<PassengerBogie> bogies = uc13.generateBogies(100000);

        // Measure performance
        long loopTime = uc13.measureLoopTime(bogies);
        long streamTime = uc13.measureStreamTime(bogies);

        // Get results
        List<PassengerBogie> loopResult = uc13.filterWithLoop(bogies);
        List<PassengerBogie> streamResult = uc13.filterWithStream(bogies);

        // Output
        System.out.println("Loop Result Size   : " + loopResult.size());
        System.out.println("Stream Result Size : " + streamResult.size());

        System.out.println("\nExecution Time:");
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");

        System.out.println("\nResults Match? " + (loopResult.size() == streamResult.size()));

        System.out.println("\nUC13 operations completed successfully...");
    }
}