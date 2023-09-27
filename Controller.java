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
        // Get necessary information
        String courseInfo = enterCourseInfo();

        // Split course info in corresponding attributes
        String title = "";
        Instructor instructor = new Instructor();
        String category = "";
        float fee = 0;

        // Create course object
        Course course = new Course(title, instructor, category, fee);

        // Refund option
        boolean refund = false;
        float amount = 0;
        // Prompt user to allow refund
        if (refund){
            course.allowRefund(amount);
        }

        // Proceed to payment
        RegistrationFee rf = new RegistrationFee();
        boolean success = rf.pay(fee, user);

        // Valid payment
        if (success){
            // Publish course and obtain credentials
            String credentials = publishCourse(course);
            // General user (not logged in instructor)
            if (!(user instanceof Instructor)){
                // Return instructor
                return new Instructor(user, credentials);
            }
        }
        // If already an instructor / unsuccessful payment, return original uer
        return user;

    }
}

