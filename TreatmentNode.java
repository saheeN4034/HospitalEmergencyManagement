public class TreatmentNode {
    private Treatment treatment;
    private TreatmentNode next;

    public TreatmentNode(Treatment treatment) {
        this.treatment = treatment;
        this.next = null;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public TreatmentNode getNext() {
        return next;
    }

    public void setNext(TreatmentNode next) {
        this.next = next;
    }
}
