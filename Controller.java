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
     * @param course Course to be published
     * @return String containing username and password (new instructor credentials)
     */
    public String publishCourse(Course course){
        String credentials = "";
        // Publishes the course to the webpage (missing implementation)
        // Generate new credentials (missing implementation)
        return credentials;
    }

    /**
     * Method to get the required course information
     *
     * @return String appending all information
     */
    public String enterCourseInfo(){
        String info = "";
        // Prompt user to enter information and append it (missing implementation)
        return info;
    }

    /**
     * Method to print error message when payment of fee is unsuccessful
     */
    public void invalidPaymentError(){
        System.out.println("ERROR. Invalid payment. Operation Cancelled");
    }

    /**
     * Method to create a new course.
     *
     * @param user who wants to create course (might be an instructor or not)
     * @return User after creating course (Instructor if not failure and not logged-in)
     */
    public User createCourse(User user){
        // Get necessary information
        String courseInfo = enterCourseInfo();

        // Split courseInfo in corresponding attributes (missing implementation)
        String title = "";
        Instructor instructor = new Instructor();
        String category = "";
        float fee = 0;

        // Create course object
        Course course = new Course(title, instructor, category, fee);

        // Refund option
        boolean refund = false;
        float amount = 0;
        // Prompt user to allow refund (missing implementation)
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
            // If general user (not logged-in instructor)
            if (!(user instanceof Instructor)){
                // Create and return new instructor (with the obtained credentials)
                return new Instructor(user, credentials);
            }
        }
        // Invalid payment and course publish cancelled
        else{
            invalidPaymentError();
        }

        // Return original uer (if already an instructor / unsuccessful payment)
        return user;
    }
}

