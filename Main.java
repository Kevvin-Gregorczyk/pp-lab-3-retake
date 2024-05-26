import medicine.Doctor;
import medicine.Hospital;
import medicine.Nurse;
import medicine.Patient;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doctor = new Doctor("Piotr", "Zieliński", 45, "Kardiologia");

        Nurse nurse = new Nurse("Magdalena", "Wiśniewska", 30, "Pediatria");

        hospital.addStaff(doctor);
        hospital.addStaff(nurse);

        Patient patient1 = new Patient("Jan", "Kowalski", 30, "Grypa", 101);
        Patient patient2 = new Patient("Anna", "Nowak", 25, "Przeziębienie", 102);
        Patient patient3 = new Patient("Marek", "Wiśniewski", 40, "Astma", 103);
        Patient patient4 = new Patient("Ewa", "Wójcik", 35, "Covid-19", 104);

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(patient4);

        hospital.displayStaff();

        hospital.displayPatients();

        patient1.setIllness("Zdrowy");
        patient1.setRoomNumber(200);
        doctor.setSpecialization("Neurologia");

        System.out.println("Zaktualizowana choroba: " + patient1.getIllness());
        System.out.println("Zaktualizowany numer pokoju: " + patient1.getRoomNumber());
        System.out.println("Zaktualizowana specjalizacja: " + doctor.getSpecialization());

        nurse.displayInfo();
        nurse.performDuty();

        hospital.removeStaff(nurse);

        hospital.removePatient(patient4);

        hospital.displayStaff();
        hospital.displayPatients();
    }
}