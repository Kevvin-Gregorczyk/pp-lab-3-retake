package medicine;

public class Nurse extends MedicalStaff {
    public Nurse(String firstName, String lastName, int age, String specialization) {
        super(firstName, lastName, age, specialization);
    }

    @Override
    public void performDuty() {
        System.out.println("Pielęgniarka " + getFirstName() + " " + getLastName() + " pomaga pacjentom.");
    }
}
