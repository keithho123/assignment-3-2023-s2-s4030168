/**
 * Main class of the program
 */
public class Main {
    public static void main(String[] args) {
        // Create controller
        Controller c = new Controller();

        // Create user for interactions with the system
        User user = new User();

        //Sub-scenario 1: register a course
        // Attempt to create a course
        // newUser might be the same as old user or a new Instructor (if the creation was successful)
        User newUser = c.createCourse(user);


        //Sub-scenario 2: enquiry

    }
}
