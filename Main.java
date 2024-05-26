import medicine.Patient;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Jan", "Kowalski", 30, "Grypa", 101);
        Patient patient2 = new Patient("Anna", "Nowak", 25, "Przeziębienie", 102);
        Patient patient3 = new Patient("Marek", "Wiśniewski", 40, "Astma", 103);
        Patient patient4 = new Patient("Ewa", "Wójcik", 35, "Covid-19", 104);

        patient1.displayInfo();
        patient2.displayInfo();
        patient3.displayInfo();
        patient4.displayInfo();

        System.out.println("Imię: " + patient1.getFirstName());
        System.out.println("Nazwisko: " + patient1.getLastName());
        System.out.println("Choroba: " + patient1.getIllness());
        System.out.println("Numer pokoju: " + patient1.getRoomNumber());

        patient1.setIllness("Zdrowy");
        patient1.setRoomNumber(200);
        
        System.out.println("Zaktualizowana choroba: " + patient1.getIllness());
        System.out.println("Zaktualizowany numer pokoju: " + patient1.getRoomNumber());
    }
}