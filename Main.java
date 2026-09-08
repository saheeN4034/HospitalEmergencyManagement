import java.util.Scanner;

public class Main {
    private static PatientBST patientBST = new PatientBST();
    private static EmergencyQueue emergencyQueue = new EmergencyQueue();
    private static TreatmentStack treatmentStack = new TreatmentStack();
    private static VisitHistory visitHistory = new VisitHistory();

    public static void main(String[] args) {
        System.out.println("Mini Hospital Emergency Management System");
        System.out.println("Project initialized successfully.");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println();
            System.out.println("1. Patient Management");
            System.out.println("2. Emergency Queue");
            System.out.println("3. Treatment Stack");
            System.out.println("4. Visit History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("This module will be implemented in the next steps.");
                    break;
                case 2:
                    System.out.println("This module will be implemented in the next steps.");
                    break;
                case 3:
                    System.out.println("This module will be implemented in the next steps.");
                    break;
                case 4:
                    System.out.println("This module will be implemented in the next steps.");
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                    break;
            }
        }

        scanner.close();
    }
}
