public class VisitHistory {
    private VisitNode head;

    public VisitHistory() {
        this.head = null;
    }

    public void addVisit(Visit visit) {
        if (visit == null) {
            System.out.println("Visit details are missing.");
            return;
        }

        VisitNode newNode = new VisitNode(visit);

        if (head == null) {
            head = newNode;
            return;
        }

        VisitNode current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
    }

    public void removeVisit(String visitId) {
        if (head == null) {
            System.out.println("No visit history found.");
            return;
        }

        if (head.getVisit().getVisitId().equals(visitId)) {
            head = head.getNext();
            System.out.println("Visit removed.");
            return;
        }

        VisitNode current = head;
        VisitNode previous = null;

        while (current != null && !current.getVisit().getVisitId().equals(visitId)) {
            previous = current;
            current = current.getNext();
        }

        if (current == null) {
            System.out.println("Visit not found.");
            return;
        }

        previous.setNext(current.getNext());
        System.out.println("Visit removed.");
    }

    public Visit searchVisit(String visitId) {
        VisitNode current = head;

        while (current != null) {
            if (current.getVisit().getVisitId().equals(visitId)) {
                return current.getVisit();
            }
            current = current.getNext();
        }

        return null;
    }

    public void displayVisits() {
        if (head == null) {
            System.out.println("No visit history found.");
            return;
        }

        VisitNode current = head;

        while (current != null) {
            System.out.println(current.getVisit().toString());
            current = current.getNext();
        }
    }
}
