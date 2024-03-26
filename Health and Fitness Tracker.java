import java.util.Scanner;

public class HealthAndFitnessTracker {
    private int steps;
    private int caloriesBurned;
    private int waterIntake;

    public HealthAndFitnessTracker() {
        this.steps = 0;
        this.caloriesBurned = 0;
        this.waterIntake = 0;
    }

    public void addSteps(int steps) {
        this.steps += steps;
        System.out.println("Steps added: " + steps);
    }

    public void addCaloriesBurned(int calories) {
        this.caloriesBurned += calories;
        System.out.println("Calories burned added: " + calories);
    }

    public void addWaterIntake(int water) {
        this.waterIntake += water;
        System.out.println("Water intake added: " + water);
    }

    public void displayStats() {
        System.out.println("-------- Health and Fitness Stats --------");
        System.out.println("Steps: " + steps);
        System.out.println("Calories Burned: " + caloriesBurned);
        System.out.println("Water Intake: " + waterIntake + " oz");
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        HealthAndFitnessTracker tracker = new HealthAndFitnessTracker();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("-------- Health and Fitness Tracker --------");
            System.out.println("1. Add Steps");
            System.out.println("2. Add Calories Burned");
            System.out.println("3. Add Water Intake");
            System.out.println("4. Display Stats");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter steps: ");
                    int steps = scanner.nextInt();
                    tracker.addSteps(steps);
                    break;
                case 2:
                    System.out.print("Enter calories burned: ");
                    int calories = scanner.nextInt();
                    tracker.addCaloriesBurned(calories);
                    break;
                case 3:
                    System.out.print("Enter water intake (in oz): ");
                    int water = scanner.nextInt();
                    tracker.addWaterIntake(water);
                    break;
                case 4:
                    tracker.displayStats();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
        scanner.close();
    }
}
