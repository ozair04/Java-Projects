import java.util.Arrays;

// create Student class with private attributes
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int[] homeworkMarks;
    private int interimTestMark;
    private double courseworkMark;
    private int examMark;
    private double finalMark;

    // constructor used to initialise student objects
    public Student() {}
    
    // first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // last name
    public void setSurname(String surname) {
        this.lastName = surname;
    }
    
    // array of homework marks
    public void setHomeworkMarks(int[] homeworkMarks) {
        this.homeworkMarks = homeworkMarks;
    }
    
    // interim test mark
    public void setInterimTestMark(int interimTestMark) {
        this.interimTestMark = interimTestMark;
    }
    
    // exam mark
    public void setExamMark(int examMark) {
        this.examMark = examMark;
    }
    
    // coursework mark
    public void setCourseworkMark(double courseworkMark) {
        this.courseworkMark = courseworkMark;
    }
    
    // final mark
    public void setfinalMark(double finalMark) {
        this.finalMark = finalMark;
    }
    
    // calculate coursework mark 
	public double calculateCourseworkMark() {
		// sort homework marks in order so that the last 3 items are the best three 
        Arrays.sort(homeworkMarks);
        // calculate mean of best three to find average
        double bestThreeAverage = (homeworkMarks[2] + homeworkMarks[3] + homeworkMarks[4]) / 3.0;
        // return the weighted average of the best three homework marks and the interim test mark
        return (bestThreeAverage * 1/3) + (interimTestMark * 2/3);
    }

	// calculate final mark
    public double calculateFinalMark() {
    	// coursework is worth 30% while exam is worth 70% of the final mark
        return (courseworkMark * 0.3) + (examMark * 0.7);
    }

    // get private attributes 
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int[] getHomeworkMarks() {
        return homeworkMarks;
    }

    public int getInterimTestMark() {
        return interimTestMark;
    }

    public double getCourseworkMark() {
        return courseworkMark;
    }

    public int getExamMark() {
        return examMark;
    }

    public double getFinalMark() {
        return finalMark;
    }
}
