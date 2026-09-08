public class Visit {
    private String visitId;
    private String patientId;
    private String visitDate;
    private String reason;

    public Visit(String visitId, String patientId, String visitDate, String reason) {
        this.visitId = visitId;
        this.patientId = patientId;
        this.visitDate = visitDate;
        this.reason = reason;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "visitId='" + visitId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", visitDate='" + visitDate + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
