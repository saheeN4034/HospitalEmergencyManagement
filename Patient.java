public class Patient {
    private String patientId;
    private String name;
    private int age;
    private String gender;
    private String condition;
    private int severity;

    public Patient(String patientId, String name, int age, String gender, String condition, int severity) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.condition = condition;
        this.severity = severity;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", condition='" + condition + '\'' +
                ", severity=" + severity +
                '}';
    }
}
