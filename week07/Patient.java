package week07;

class Patient {
    private int patientID;
    private String name;
    private static int counter;
    public Patient(String name) {
        this.name = name;
        this.patientID = ++counter;
    }

    public String getName() {
        return this.name;
    }
    public int getPatientID() {
        return this.patientID;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientID + " --> " + "Patient Name: " + name;
    }
}
