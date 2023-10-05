
// Subclass EX002 extends the Module class
// Module class is a public abstract class
// By extending from Module, EX002 inherits private attributes in the abstract Module class
public class EX002 extends Module {

    // Attributes of subclass EX002
    // Name of module
    static String name = "EX002";
    // Status of module
    static int status = 1;
    // EX002 is the only module that requires solely one mark
    // No weightings given nor needed
    // Final mark of module
    // Final mark will get the mark for EX002
    static double finalMark = Student.getEX002;

}
