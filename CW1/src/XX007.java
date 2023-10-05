import java.util.Scanner;

public class XX007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students
        System.out.print("Enter the number of students taking the module: ");
        int numStudents = scanner.nextInt();

        // Create an array to store the students
        Student[] students = new Student[numStudents];

        // Fill in the relevant details for each student in the module
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            Student student = new Student();

            // Get the first name and surname
            System.out.print("First name: ");
            String firstName = scanner.next();
            student.setFirstName(firstName);

            System.out.print("Surname: ");
            String surname = scanner.next();
            student.setSurname(surname);

            // Get the homework marks
            System.out.println("Enter the marks for the 5 homeworks:");
            int[] homeworkMarks = new int[5];
            for (int j = 0; j < 5; j++) {
            	// collect all 5 homework marks
                System.out.print("Homework " + (j + 1) + ": ");
                int mark = scanner.nextInt();
                homeworkMarks[j] = mark;
            }
            student.setHomeworkMarks(homeworkMarks);

            // Get the Interim Test mark
            System.out.print("Interim Test mark: ");
            int interimTestMark = scanner.nextInt();
            student.setInterimTestMark(interimTestMark);

            // Get the Exam mark
            System.out.print("Exam mark: ");
            int examMark = scanner.nextInt();
            student.setExamMark(examMark);
            
            // Calculate and store the coursework mark and final mark
            double courseworkMark = student.calculateCourseworkMark();
            student.setCourseworkMark(courseworkMark);
            double finalMark = student.calculateFinalMark();
            student.setfinalMark(finalMark);

            students[i] = student;
        }

        // Print out the student details in a tabular format
        //print out the headers
        System.out.printf("%-5s %-15s %-15s %-15s %-15s %-15s%n", "ID", "Name", "Surname", "Coursework", "Exam", "FinalMark");
        // retrieve the data for each student 
        for (int i = 0; i < numStudents; i++) {
            Student student = students[i];
            String name = student.getFirstName();
            String surname = student.getLastName();
            double courseworkMark = student.getCourseworkMark();
            int examMark = student.getExamMark();
            double finalMark = student.getFinalMark();
            //print out the data in the sae format as the headers
            System.out.printf("%-5d %-15s %-15s %-15.2f %-15d %-15.2f%n", i+1, name, surname, courseworkMark, examMark, finalMark);
        }
        scanner.close();
    }
}
