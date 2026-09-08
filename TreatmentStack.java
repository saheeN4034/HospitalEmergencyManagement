public class TreatmentStack {
    private TreatmentNode top;

    public TreatmentStack() {
        this.top = null;
    }

    public void push(Treatment treatment) {
        if (treatment == null) {
            System.out.println("Treatment details are missing.");
            return;
        }

        TreatmentNode newNode = new TreatmentNode(treatment);
        newNode.setNext(top);
        top = newNode;
    }

    public Treatment pop() {
        if (top == null) {
            return null;
        }

        Treatment removedTreatment = top.getTreatment();
        top = top.getNext();
        return removedTreatment;
    }

    public void displayTreatments() {
        if (top == null) {
            System.out.println("No treatment records found.");
            return;
        }

        TreatmentNode current = top;

        while (current != null) {
            System.out.println(current.getTreatment().toString());
            current = current.getNext();
        }
    }
}
