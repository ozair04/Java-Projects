// Import scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of students taking the module
        System.out.print("Enter the number of students taking the module: ");
        int numStudents = scanner.nextInt();

        // Create an array of students with length of the number of students in order to store each student
        Student[] students = new Student[numStudents];

        // User will fill in all relevant details for each student taking the modules
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            // Each student becomes an object of the Student class
            Student student = new Student();

            // Acquire and set the first name and surname
            System.out.print("First name: ");
            String firstName = scanner.next();
            student.setFirstName(firstName);

            System.out.print("Surname: ");
            String surname = scanner.next();
            student.setSurname(surname);

            // Set the three CW001 homework marks
            System.out.println("Enter the marks for the three homeworks:");
            // Homework marks are stored in an array of size three
            int[] CW001Homeworks = new int[3];
            for (int j = 0; j < 3; j++) {
                // Collect all three homework marks
                System.out.print("Homework " + (j + 1) + ": ");
                CW001Homeworks[j] = scanner.nextInt();
            }
            student.setCW001Homeworks(CW001Homeworks);

            // Set the CW001 Project mark
            System.out.print("CW001 Project mark: ");
            int CW001ProjectMark = scanner.nextInt();
            student.setCW001ProjectMark(CW001ProjectMark);

            // Set the EX002 Exam mark
            System.out.print("EX002 mark: ");
            int EX002 = scanner.nextInt();
            student.setEX002(EX002);

            // Set the four CE003 homework marks
            System.out.println("Enter the marks for the four homeworks:");
            // Homework marks are stored in an array of size four
            int[] CE003Homeworks = new int[4];
            for (int j = 0; j < 4; j++) {
                // Collect all four homework marks
                System.out.print("Homework " + (j + 1) + ": ");
                CE003Homeworks[j] = scanner.nextInt();
            }
            student.setCE003Homeworks(CE003Homeworks);
            // Set the CE003 Exam mark
            System.out.print("CE003 Exam mark: ");
            int CE003Exam = scanner.nextInt();
            student.setCE003Exam(CE003Exam);

            // Student is then stored in the students array
            students[i] = student;
        }
        // Prompt user with option to print tables of the marks
        System.out.println("Would you like to print? (yes/no)");
        String input = scanner.next();
        // While loop created to allow user to print marks in multiple format and allows option to exit whenever
        while (!input.equals("no")) {
            System.out.println("""
                
                Would you like to print the marks for:
                0 : All modules
                1 : CW001
                2 : EX002
                3 : CE003
                4 : Exit""");
            int option = scanner.nextInt();
            // All modules
            if (option == 0) {
                System.out.println();
                System.out.println("Marks for all modules:");
                // Headers created and formatted in tabular form
                System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "Name", "Surname", CW001.name, EX002.name, CE003.name);
                for (int i = 0; i < numStudents; i++) {
                    Student student = students[i];
                    // Get first name
                    String name = student.getFirstName();
                    // Get surname
                    String surname = student.getSurname();
                    // Get homework marks to calculate average
                    int[] CW001Homeworks = student.getCW001Homeworks();
                    double CW001avg = (CW001Homeworks[0] + CW001Homeworks[1] + CW001Homeworks[2]) / 3.0;
                    // Calculate CW001 mark using the average of the homeworks, the project mark and their weightings
                    double module1 = (CW001avg * CW001.homeworkWeighting) + (student.getCW001ProjectMark() * CW001.projectWeighting);
                    // Get EX002 mark
                    double module2 = student.getEX002();
                    int[] CE003Homeworks = student.getCE003Homeworks();
                    double CE003avg = (CE003Homeworks[0] + CE003Homeworks[1] + CE003Homeworks[2] + CE003Homeworks[3]) / 4.0;
                    // Calculate CE003 mark using the average of the homeworks, the project mark and their weightings
                    double module3 = (CE003avg * CE003.courseworkWeighting) + (student.getCE003Exam() * CE003.examWeighting);
                    // Print out all values in tabular format corresponding with the headers
                    // All numerical vales rounded to 2 decimal places
                    // '%' at the end for all numerical values in order to be shown as percentages
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", name, surname, String.format("%.2f",module1) + "%", String.format("%.2f",module2) + "%", String.format("%.2f",module3) + "%");
                }
            }
            // CW001
            if (option == 1) {
                System.out.println();
                System.out.println("Marks for CW001:");
                // Headers created and formatted in tabular form
                System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "Name", "Surname", "HWs", "Project", "Final Mark");
                // For loop created to get all student attributes and print them corresponding to each student
                for (int i = 0; i < numStudents; i++) {
                    Student student = students[i];
                    // Get first name
                    String name = student.getFirstName();
                    // Get surname
                    String surname = student.getSurname();
                    // Get homework marks to calculate average
                    int[] CW001Homeworks = student.getCW001Homeworks();
                    double CW001avg = (CW001Homeworks[0] + CW001Homeworks[1] + CW001Homeworks[2]) / 3.0;
                    // Get project mark
                    double CW001project = student.getCW001ProjectMark();
                    // Calculate final mark using the average of the homeworks, the project mark and their weightings
                    double CW001finalMark = (CW001avg * CW001.homeworkWeighting) + (CW001project * CW001.projectWeighting);
                    // Print out all values in tabular format corresponding with the headers
                    // All numerical vales rounded to 2 decimal places
                    // '%' at the end for all numerical values in order to be shown as percentages
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", name, surname, String.format("%.2f",CW001avg) + "%", String.format("%.2f",CW001project) + "%", String.format("%.2f",CW001finalMark) + "%");
                }
            }
            // EX002
            if (option == 2) {
                System.out.println();
                System.out.println("Marks for EX002:");
                // Headers created and formatted in tabular form
                System.out.printf("%-15s %-15s %-15s%n", "Name", "Surname", "Final Mark");
                // For loop created to get all student attributes and print them corresponding to each student
                for (int i = 0; i < numStudents; i++) {
                    Student student = students[i];
                    // Get first name
                    String name = student.getFirstName();
                    // Get surname
                    String surname = student.getSurname();
                    // Get EX002 mark
                    double module2 = student.getEX002();
                    // Print out all values in tabular format corresponding with the headers
                    // All numerical vales rounded to 2 decimal places
                    // '%' at the end for all numerical values in order to be shown as percentages
                    System.out.printf("%-15s %-15s %-15s%n", name, surname, String.format("%.2f",module2) + "%");
                }
            }
            // CE003
            if (option == 3) {
                System.out.println();
                System.out.println("Marks for CE003:");
                // Headers created and formatted in tabular form
                System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "Name", "Surname", "CW", "Exam", "FinaLMark");
                // For loop created to get all student attributes and print them corresponding to each student
                for (int i = 0; i < numStudents; i++) {
                    Student student = students[i];
                    // Get first name
                    String name = student.getFirstName();
                    // Get surname
                    String surname = student.getSurname();
                    // Get homework marks to calculate average
                    int[] CE003HW = student.getCE003Homeworks();
                    double CE003avg = (CE003HW[0] + CE003HW[1] + CE003HW[2] + CE003HW[3]) / 4.0;
                    double CE003exam = student.getCE003Exam();
                    // Calculate final mark using the average of the homeworks, the project mark and their weightings
                    double CE003final = (CE003avg * CE003.courseworkWeighting) + (CE003exam * CE003.examWeighting);
                    // Print out all values in tabular format corresponding with the headers
                    // All numerical vales rounded to 2 decimal places
                    // '%' at the end for all numerical values in order to be shown as percentages
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", name, surname, String.format("%.2f",CE003avg) + "%", String.format("%.2f",CE003exam) + "%", String.format("%.2f",CE003final) + "%");
                }
            }
            // Exit Loop
            if (option == 4) {
                break;
            }
        }
        // Close Scanner
        scanner.close();
    }
}


