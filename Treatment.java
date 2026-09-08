public class Treatment {
    private String treatmentId;
    private String patientId;
    private String treatmentDescription;
    private String doctorName;
    private String date;

    public Treatment(String treatmentId, String patientId, String treatmentDescription, String doctorName, String date) {
        this.treatmentId = treatmentId;
        this.patientId = patientId;
        this.treatmentDescription = treatmentDescription;
        this.doctorName = doctorName;
        this.date = date;
    }

    public String getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Treatment{" +
                "treatmentId='" + treatmentId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", treatmentDescription='" + treatmentDescription + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
