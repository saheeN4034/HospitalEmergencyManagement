public class PatientBST {
    private PatientNode root;

    public PatientBST() {
        this.root = null;
    }

    public void insert(Patient patient) {
        if (patient == null) {
            System.out.println("Patient details are missing.");
            return;
        }

        root = insertRec(root, patient);
    }

    private PatientNode insertRec(PatientNode current, Patient patient) {
        if (current == null) {
            return new PatientNode(patient);
        }

        String newId = patient.getPatientId();
        String currentId = current.getPatient().getPatientId();

        if (newId.compareTo(currentId) == 0) {
            System.out.println("Patient ID already exists.");
            return current;
        }

        if (newId.compareTo(currentId) < 0) {
            current.setLeft(insertRec(current.getLeft(), patient));
        } else {
            current.setRight(insertRec(current.getRight(), patient));
        }

        return current;
    }
}
