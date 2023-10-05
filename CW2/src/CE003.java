
// Subclass EX002 extends the Module class
// The class Module is a public abstract class
// By extending from Module, CE003 inherits private attributes in the abstract Module class
public class CE003 extends Module {

    // Attributes of subclass CE003
    // Name of module
    static String name = "CE003";
    // Status of module
    static int status = 2;
    // CE003 coursework mark
    static double coursework = Student.getCE003Average;
    // CE003 exam mark
    static int exam = (int) Student.getCE003Exam;
    // Weighting for coursework mark
    static double courseworkWeighting = 0.4;
    // Weighting for exam mark
    static double examWeighting = 0.6;
    // CE003 final mark
    // Final mark calculated using coursework mark and exam mark
    // Uses the variable courseworkWeighting and examWeighting as the weighting for the coursework and exam
    static double finalMark = (coursework * courseworkWeighting) + (exam * examWeighting);

}
