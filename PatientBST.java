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

    public Patient search(String patientId) {
        PatientNode current = root;

        while (current != null) {
            String currentId = current.getPatient().getPatientId();

            if (patientId.compareTo(currentId) == 0) {
                return current.getPatient();
            }

            if (patientId.compareTo(currentId) < 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }

        return null;
    }

    public void delete(String patientId) {
        root = deleteRec(root, patientId);
    }

    private PatientNode deleteRec(PatientNode current, String patientId) {
        if (current == null) {
            System.out.println("Patient not found.");
            return null;
        }

        String currentId = current.getPatient().getPatientId();

        if (patientId.compareTo(currentId) < 0) {
            current.setLeft(deleteRec(current.getLeft(), patientId));
            return current;
        }

        if (patientId.compareTo(currentId) > 0) {
            current.setRight(deleteRec(current.getRight(), patientId));
            return current;
        }

        if (current.getLeft() == null && current.getRight() == null) {
            return null;
        }

        if (current.getLeft() == null) {
            return current.getRight();
        }

        if (current.getRight() == null) {
            return current.getLeft();
        }

        PatientNode successor = findMin(current.getRight());
        current.setPatient(successor.getPatient());
        current.setRight(deleteRec(current.getRight(), successor.getPatient().getPatientId()));
        return current;
    }

    private PatientNode findMin(PatientNode node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    public void inorderTraversal() {
        if (root == null) {
            System.out.println("No patients in the system.");
            return;
        }

        inorderRec(root);
    }

    private void inorderRec(PatientNode current) {
        if (current == null) {
            return;
        }

        inorderRec(current.getLeft());
        System.out.println(current.getPatient().toString());
        inorderRec(current.getRight());
    }
}
