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
                    int patientChoice = 0;

                    while (patientChoice != 5) {
                        System.out.println();
                        System.out.println("Patient Management");
                        System.out.println("1. Add Patient");
                        System.out.println("2. Search Patient");
                        System.out.println("3. Delete Patient");
                        System.out.println("4. Display All Patients");
                        System.out.println("5. Back to Main Menu");
                        System.out.print("Enter your choice: ");

                        patientChoice = scanner.nextInt();

                        switch (patientChoice) {
                            case 1:
                                System.out.print("Enter Patient ID: ");
                                String patientId = scanner.next();
                                System.out.print("Enter Name: ");
                                String name = scanner.next();
                                System.out.print("Enter Age: ");
                                int age = scanner.nextInt();
                                System.out.print("Enter Gender: ");
                                String gender = scanner.next();
                                System.out.print("Enter Condition: ");
                                String condition = scanner.next();
                                System.out.print("Enter Severity: ");
                                int severity = scanner.nextInt();

                                Patient patient = new Patient(patientId, name, age, gender, condition, severity);
                                patientBST.insert(patient);
                                System.out.println("Patient added successfully.");
                                break;

                            case 2:
                                System.out.print("Enter Patient ID to search: ");
                                String searchId = scanner.next();
                                Patient foundPatient = patientBST.search(searchId);

                                if (foundPatient != null) {
                                    System.out.println(foundPatient.toString());
                                } else {
                                    System.out.println("Patient not found.");
                                }
                                break;

                            case 3:
                                System.out.print("Enter Patient ID to delete: ");
                                String deleteId = scanner.next();
                                patientBST.delete(deleteId);
                                System.out.println("Patient deletion processed.");
                                break;

                            case 4:
                                patientBST.inorderTraversal();
                                break;

                            case 5:
                                System.out.println("Returning to the main menu.");
                                break;

                            default:
                                System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                                break;
                        }
                    }
                    break;

                case 2:
                    int emergencyChoice = 0;

                    while (emergencyChoice != 4) {
                        System.out.println();
                        System.out.println("Emergency Queue");
                        System.out.println("1. Add Patient to Emergency Queue");
                        System.out.println("2. Serve Next Patient");
                        System.out.println("3. Display Emergency Queue");
                        System.out.println("4. Back to Main Menu");
                        System.out.print("Enter your choice: ");

                        emergencyChoice = scanner.nextInt();

                        switch (emergencyChoice) {
                            case 1:
                                System.out.print("Enter Patient ID: ");
                                String emergencyPatientId = scanner.next();
                                System.out.print("Enter Name: ");
                                String emergencyName = scanner.next();
                                System.out.print("Enter Age: ");
                                int emergencyAge = scanner.nextInt();
                                System.out.print("Enter Gender: ");
                                String emergencyGender = scanner.next();
                                System.out.print("Enter Condition: ");
                                String emergencyCondition = scanner.next();
                                System.out.print("Enter Severity: ");
                                int emergencySeverity = scanner.nextInt();

                                Patient emergencyPatient = new Patient(emergencyPatientId, emergencyName, emergencyAge, emergencyGender, emergencyCondition, emergencySeverity);
                                emergencyQueue.enqueue(emergencyPatient);
                                System.out.println("Patient added to the emergency queue.");
                                break;

                            case 2:
                                Patient servedPatient = emergencyQueue.dequeue();
                                if (servedPatient == null) {
                                    System.out.println("Emergency queue is empty.");
                                } else {
                                    System.out.println("Served patient: " + servedPatient.toString());
                                }
                                break;

                            case 3:
                                emergencyQueue.displayQueue();
                                break;

                            case 4:
                                System.out.println("Returning to the main menu.");
                                break;

                            default:
                                System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                                break;
                        }
                    }
                    break;
                case 3:
                    int treatmentChoice = 0;

                    while (treatmentChoice != 4) {
                        System.out.println();
                        System.out.println("Treatment Stack");
                        System.out.println("1. Add Treatment");
                        System.out.println("2. View Latest Treatment");
                        System.out.println("3. Remove Latest Treatment");
                        System.out.println("4. Back to Main Menu");
                        System.out.print("Enter your choice: ");

                        treatmentChoice = scanner.nextInt();

                        switch (treatmentChoice) {
                            case 1:
                                System.out.print("Enter Treatment ID: ");
                                String treatmentId = scanner.next();
                                System.out.print("Enter Patient ID: ");
                                String treatmentPatientId = scanner.next();
                                System.out.print("Enter Treatment Description: ");
                                String treatmentDescription = scanner.next();
                                System.out.print("Enter Doctor Name: ");
                                String doctorName = scanner.next();
                                System.out.print("Enter Date: ");
                                String date = scanner.next();

                                Treatment treatment = new Treatment(treatmentId, treatmentPatientId, treatmentDescription, doctorName, date);
                                treatmentStack.push(treatment);
                                System.out.println("Treatment added to the stack.");
                                break;

                            case 2:
                                Treatment latestTreatment = treatmentStack.peek();
                                if (latestTreatment == null) {
                                    System.out.println("No treatments available.");
                                } else {
                                    System.out.println(latestTreatment.toString());
                                }
                                break;

                            case 3:
                                Treatment removedTreatment = treatmentStack.pop();
                                if (removedTreatment == null) {
                                    System.out.println("No treatments available.");
                                } else {
                                    System.out.println("Removed treatment: " + removedTreatment.toString());
                                }
                                break;

                            case 4:
                                System.out.println("Returning to the main menu.");
                                break;

                            default:
                                System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                                break;
                        }
                    }
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
