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
}
