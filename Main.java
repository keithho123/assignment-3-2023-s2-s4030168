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

        // If the user is now an instructor (i.e., course creation was successful)
        if (newUser instanceof Instructor) {
            Instructor instructor = (Instructor) newUser;
            String courseDetails = "Course Title, Course Category, Course Fee";  // Placeholder details
            c.registerInstructorCourse(instructor, courseDetails);
        }


        //Sub-scenario 2: enquiry
        String enquiryDetails = "I have a question about the course registration process.";
        String response = c.lodgeGeneralEnquiry(user, enquiryDetails);
        System.out.println("User received response: " + response);

    }
}
