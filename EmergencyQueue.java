public class EmergencyQueue {
    private EmergencyNode front;
    private EmergencyNode rear;

    public EmergencyQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(Patient patient) {
        if (patient == null) {
            System.out.println("Patient details are missing.");
            return;
        }

        EmergencyNode newNode = new EmergencyNode(patient);

        if (front == null) {
            front = newNode;
            rear = newNode;
            return;
        }

        rear.setNext(newNode);
        rear = newNode;
    }

    public Patient dequeue() {
        if (front == null) {
            return null;
        }

        Patient removedPatient = front.getPatient();

        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.getNext();
        }

        return removedPatient;
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Emergency queue is empty.");
            return;
        }

        EmergencyNode current = front;

        while (current != null) {
            System.out.println(current.getPatient().toString());
            current = current.getNext();
        }
    }

    public Patient findHighestSeverityPatient() {
        if (front == null) {
            return null;
        }

        EmergencyNode current = front;
        Patient highestSeverityPatient = current.getPatient();
        int highestSeverity = current.getPatient().getSeverity();

        while (current != null) {
            Patient patient = current.getPatient();
            int severity = patient.getSeverity();

            if (severity > highestSeverity) {
                highestSeverity = severity;
                highestSeverityPatient = patient;
            }

            current = current.getNext();
        }

        return highestSeverityPatient;
    }
}
