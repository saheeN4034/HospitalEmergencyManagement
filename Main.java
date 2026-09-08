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
                        System.out.println("4. Display Patients");
                        System.out.println("5. Back");
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
                                System.out.print("Enter Contact Number: ");
                                String contactNumber = scanner.next();
                                System.out.print("Enter Medical Condition: ");
                                String medicalCondition = scanner.next();

                                Patient patient = new Patient(patientId, name, age, contactNumber, medicalCondition);
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
                        System.out.println("1. Enqueue Patient");
                        System.out.println("2. Dequeue Patient");
                        System.out.println("3. Display Waiting Patients");
                        System.out.println("4. Back");
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
                                System.out.print("Enter Contact Number: ");
                                String emergencyContact = scanner.next();
                                System.out.print("Enter Medical Condition: ");
                                String emergencyCondition = scanner.next();

                                Patient emergencyPatient = new Patient(emergencyPatientId, emergencyName, emergencyAge, emergencyContact, emergencyCondition);
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
                        System.out.println("1. Push Treatment");
                        System.out.println("2. Pop Treatment");
                        System.out.println("3. Display Treatment History");
                        System.out.println("4. Back");
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
                                System.out.println("Treatment pushed to the stack.");
                                break;

                            case 2:
                                Treatment removedTreatment = treatmentStack.pop();
                                if (removedTreatment == null) {
                                    System.out.println("No treatments available.");
                                } else {
                                    System.out.println("Removed treatment: " + removedTreatment.toString());
                                }
                                break;

                            case 3:
                                treatmentStack.displayTreatments();
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
                    int visitChoice = 0;

                    while (visitChoice != 5) {
                        System.out.println();
                        System.out.println("Visit History");
                        System.out.println("1. Add Visit");
                        System.out.println("2. Remove Visit");
                        System.out.println("3. Search Visit");
                        System.out.println("4. Display Visit History");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        visitChoice = scanner.nextInt();

                        switch (visitChoice) {
                            case 1:
                                System.out.print("Enter Visit ID: ");
                                String visitId = scanner.next();
                                System.out.print("Enter Patient ID: ");
                                String visitPatientId = scanner.next();
                                System.out.print("Enter Visit Date: ");
                                String visitDate = scanner.next();
                                System.out.print("Enter Doctor Name: ");
                                String doctorName = scanner.next();
                                System.out.print("Enter Diagnosis: ");
                                String diagnosis = scanner.next();
                                System.out.print("Enter Treatment: ");
                                String treatmentDetail = scanner.next();

                                Visit visit = new Visit(visitId, visitPatientId, visitDate, doctorName, diagnosis, treatmentDetail);
                                visitHistory.addVisit(visit);
                                System.out.println("Visit added to the history.");
                                break;

                            case 2:
                                System.out.print("Enter Visit ID to remove: ");
                                String removeVisitId = scanner.next();
                                visitHistory.removeVisit(removeVisitId);
                                break;

                            case 3:
                                System.out.print("Enter Visit ID to search: ");
                                String searchVisitId = scanner.next();
                                Visit foundVisit = visitHistory.searchVisit(searchVisitId);
                                if (foundVisit != null) {
                                    System.out.println(foundVisit.toString());
                                } else {
                                    System.out.println("Visit not found.");
                                }
                                break;

                            case 4:
                                visitHistory.displayVisits();
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
