
// Subclass CW001 extends the Module class
// Module class is a public abstract class
// By extending from Module, CW001 inherits private attributes in the abstract Module class
public class CW001 extends Module {

    // Attributes of subclass CW001
    // Name of module
    static String name = "CW001";
    // Status of module
    static int status = 0;
    // CW001 homework mark
    static double homeworkMark = Student.getCW001Average;
    // CW001 project mark
    static double project = Student.getCW001ProjectMark;
    // Weightings of the homework and project marks will be used in the main class to calculate the final mark
    // Weighting of CW001 Homeworks
    static double homeworkWeighting = 0.5;
    // Weighting of CW001 project mark
    static double projectWeighting = 0.5;
    // Final mark of module
    static double finalMark = (homeworkMark * homeworkWeighting) + (project * projectWeighting);



}
