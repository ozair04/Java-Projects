
// Module abstract class created
// This will allow three concrete subclasses to be formed that will extend and therefore inherit the Module class
public abstract class Module {

    // All modules will have the following private attributes:

    // Private name attribute of Module
    // Name of each module is given in coursework description
    private String name;

    // Private status: 0, 1 or 2:
    // 0 for CW001
    // 1 for EX002
    // 2 for CE003
    private int status;

    // Private finalMark attribute
    // Will store the final marks of each module
    // Final marks will be calculated using user inputted values for homework/coursework marks and exam/project marks
    // Weightings given in course scenario
    private double finalMark;


}
