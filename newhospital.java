import java.util.Scanner;
class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String patientName = "";
        int age = 0;
        String disease = "";
        String doctorName = "";
        String specialization = "";
        int patientID = 101;
        int doctorID = 201;
        int appointmentID = 301;
        String date = "";
        String status = "Pending";
        int option;
        do{
        System.out.println("\n========== HOSPITAL MANAGEMENT SYSTEM ============");
        System.out.println("1. Register Patient");
        System.out.println("2. Add Doctor");
        System.out.println("3. Book Appointment");
        System.out.println("4. Patient List");
        System.out.println("5. Doctor List");
        System.out.println("6. Appointment List");
        System.out.println("7. Bill Generation");
        System.out.println("8. Exit");
        System.out.print("Choose option: ");
        option = sc.nextInt();
            if (option == 1) {
                System.out.println("\n----- REGISTER PATIENT -----");
                System.out.print("Enter Patient Name: ");
                patientName = sc.next();
                System.out.print("Enter Age: ");
                age = sc.nextInt();
                System.out.print("Enter Gender: ");
                String gender=sc.next();
                System.out.print("Enter Disease: ");
                disease = sc.next();
                System.out.println("\nPatient registered successfully!");
                System.out.println("Patient ID: " + patientID);
            }
            else if (option == 2) {
                System.out.println("\n----- ADD DOCTOR -----");
                System.out.print("Enter Doctor Name: ");
                doctorName = sc.next();
                System.out.print("Enter Specialization: ");
                specialization = sc.next();
                System.out.println("\nDoctor added successfully!");
                System.out.println("Doctor ID: " + doctorID);
            }
            else if (option == 3) {
                System.out.println("\n----- BOOK APPOINTMENT -----");
                System.out.println("Patient ID: " + patientID);
                System.out.println("Doctor ID: " + doctorID);
                System.out.print("Enter Appointment Date: ");
                date = sc.next();
                System.out.println("\nAppointment booked successfully!");
                System.out.println("Appointment ID: " + appointmentID);
            }
            else if (option == 4) {
                System.out.println("\n----- PATIENT LIST -----");
                System.out.println("ID\tName\tAge\tDisease");

                System.out.println(
                        patientID + "\t" +
                        patientName + "\t" +
                        age + "\t" +
                        disease
                );
            }
            else if (option == 5) {
                System.out.println("\n----- DOCTOR LIST -----");
                System.out.println("ID\tName\t\tSpecialization");
                System.out.println(
                        doctorID + "\t" +
                        doctorName + "\t\t" +
                        specialization
                );
            }
            else if (option == 6) {
                System.out.println("\n----- APPOINTMENT LIST -----");
                System.out.println("Appointment ID : " + appointmentID);
                System.out.println("Patient        : " + patientName);
                System.out.println("Doctor         : " + doctorName);
                System.out.println("Date           : " + date);
                System.out.println("Status         : " + status);
            }
            else if (option == 7) {
                int consultation;
                int medicine;
                int tax;
                System.out.println("\n----- BILL GENERATION -----");
                System.out.print("Consultation Fee : RM");
                consultation = sc.nextInt();
                System.out.print("Medicine Charges : RM");
                medicine = sc.nextInt();
                System.out.print("Tax : RM");
                tax = sc.nextInt();
                int total = consultation + medicine + tax;
                System.out.println("\nTotal Bill : RM" + total);
                System.out.println("Payment Status : UNPAID");
            }
            else if (option == 8) {
                System.out.println("\nThank you for using Hospital Management System!");
            }
       } while (option != 8);
}
}