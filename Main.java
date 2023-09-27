/**
 * Main class of the program
 */
public class Main {
    public static void main(String[] args) {
        // Create controller
        Controller c = new Controller();

        // Create user for interactions with the system
        User user = new User();

        // Attempt to create a course
        // newUser might be the same as old user or a new Instructor (if the creation was successful)
        User newUser = c.createCourse(user);

    }
}
