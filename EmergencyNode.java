public class EmergencyNode {
    private Patient patient;
    private EmergencyNode next;

    public EmergencyNode(Patient patient) {
        this.patient = patient;
        this.next = null;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public EmergencyNode getNext() {
        return next;
    }

    public void setNext(EmergencyNode next) {
        this.next = next;
    }
}
