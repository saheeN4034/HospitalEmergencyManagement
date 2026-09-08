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

    public Treatment peek() {
        if (top == null) {
            return null;
        }

        return top.getTreatment();
    }
}
