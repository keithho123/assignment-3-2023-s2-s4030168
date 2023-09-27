/**
 * Controller class to manage system
 */
public class Controller {
    /**
     * Empty constructor
     */
    public Controller(){}

    /**
     * Method to publish a new course
     *
     * @return String containing username and password
     */
    public String publishCourse(Course course){
        String credentials = "";
        // Publishes the course to the webpage
        // Generates new credentials

        return credentials;
    }

    /**
     * Method to get the course information required
     *
     * @return String appending all information
     */
    public String enterCourseInfo(){
        String info = "";

        // Prompt user to enter information + append to info

        return info;
    }

    /**
     * Method to print error message when payment of fee isn't successful
     */
    public void invalidPaymentError(){
        System.out.println("ERROR. Invalid payment. Operation Cancelled");
    }

    /**
     * Method to create a new course.
     *
     * @param user who wants to create course (might be an instructor or not)
     * @return User after creating course (Instructor if not failure)
     */
    public User createCourse(User user){
        return new User();
    }
}

