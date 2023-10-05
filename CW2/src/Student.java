
public class Student {

    // public static attributes of Student class in order to be accessed from other classes as well as inside the class
    public static double getCE003;
    public static double getEX002;
    public static double getCW001;
    public static double getCW001Average;
    public static double getCW001ProjectMark;
    public static double getCE003Average;
    public static double getCE003Exam;

    // private attributes of Student class
    private int ID;
    private String firstName;
    private String Surname;
    private int[] CW001Homeworks;
    private double CW001ProjectMark;
    private double EX002;
    private int[] CE003Homeworks;
    private int CE003Exam;

    // Constructor used in order to initialise student objects
    public Student() {}

    // Set ID
    public void setID(int ID) {
        this.ID = ID;
    }

    // Get ID
    public int getID() {
        return ID;
    }

    // Set First Name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Get First Name
    public String getFirstName() {
        return firstName;
    }

    // Set Surname
    public void setSurname(String surname) {
        Surname = surname;
    }

    // Get Surname
    public String getSurname() {
        return Surname;
    }

    // Set Array of CW001 Homework Marks
    public void setCW001Homeworks(int[] CW001Homeworks) {this.CW001Homeworks = CW001Homeworks;}

    // Get Array of CW001 Homework Marks
    public int[] getCW001Homeworks() {
        return CW001Homeworks;
    }

    // Set CW001 Project Mark
    public void setCW001ProjectMark(double CW001ProjectMark) {
        this.CW001ProjectMark = CW001ProjectMark;
    }

    // Get CW001 Project Mark
    public double getCW001ProjectMark() {
        return CW001ProjectMark;
    }

    // Set EX002 Exam Mark
    public void setEX002(double EX002) {
        this.EX002 = EX002;
    }

    // Get EX002 Exam Mark
    public double getEX002() {
        return EX002;
    }

    // Set Array of CE003 Homework Marks
    public void setCE003Homeworks(int[] CE003Homeworks) {
        this.CE003Homeworks = CE003Homeworks;
    }

    // Get Array of CE003 Homework Marks
    public int[] getCE003Homeworks() {
        return CE003Homeworks;
    }

    // Set CE003 Exam Mark
    public void setCE003Exam(int CE003Exam) {
        this.CE003Exam = CE003Exam;
    }

    // Get CE003 Exam Mark
    public int getCE003Exam() {
        return CE003Exam;
    }

}
