/**
 * Controller class to manage system
 */
public class Controller {
    /**
     * Empty constructor
     * 
     */
    private Manager manager; 
    
    public Controller(){
        this.manager = new Manager();
    }


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


    /**
 * Method for an instructor to register a course on the learning portal/website.
 * 
 * @param instructor The instructor registering the course.
 * @param courseDetails The details of the course being registered.
 * @return boolean indicating whether the registration was successful or not.
 */
public boolean registerInstructorCourse(Instructor instructor, String courseDetails) {
    // Here, we'll simulate the process of registering a course by an instructor.
    
    // Print the instructor's action
    System.out.println("Instructor " + instructor.getEmail() + " is registering a new course with details: " + courseDetails);
    
    // For this simulation, we'll assume the registration always succeeds.
    System.out.println("Course registered successfully!");
    return true;  // Indicate successful registration
}
    // New method to lodge a general enquiry
    public String lodgeEnquiry(User user, String enquiryDetails) {
        System.out.println(user.getEmail() + " has lodged an enquiry with details: " + enquiryDetails);
        System.out.println("Enquiry forwarded to the manager.");
        String managerResponse = "Thank you for your enquiry. We'll address it shortly.";
        System.out.println("Manager responds: " + managerResponse);
        return managerResponse;
    }



    /**
 * Method for a user to lodge a general enquiry about the portal.
 * 
 * @param user The user lodging the enquiry.
 * @param enquiryDetails The details of the enquiry.
 * @return String indicating the manager's response to the enquiry.
 */
    public String lodgeGeneralEnquiry(User user, String enquiryDetails) {
        // Simulate the process of lodging an enquiry by a user.
        
        // Print the user's action
        System.out.println(user.getEmail() + " has lodged an enquiry with details: " + enquiryDetails);

        // Simulate sending a notification to the manager
        System.out.println("Notification sent to the manager regarding the enquiry.");

        // Simulate manager's response
        String managerResponse = "Thank you for your enquiry. We'll address it shortly.";
        System.out.println("Manager responds: " + managerResponse);
        
        return managerResponse;
    }

    public String promptForCourseDetails() {
        // For simplicity, we'll just simulate this action with a print statement
        System.out.println("System prompts for course details.");

        // Simulated course details (this would be obtained from the instructor in a real scenario)
        return "Sample Course Details";
    }

    public boolean initiateCourseRegistration(Instructor instructor) {
        System.out.println("Instructor " + instructor.getEmail() + " initiates course registration.");
        
        // System prompts for and collects course details
        String courseDetails = promptForCourseDetails();

        // For now, we'll just print out the details and return true to indicate success
        
        System.out.println("Instructor provides course details: " 
        + courseDetails);
        // Handle payment using the RegistrationFee class
        RegistrationFee rf = new RegistrationFee();
        float feeAmount = 100.0f;  // Example fee amount, this could be extracted from course details
        boolean paymentSuccess = rf.pay(feeAmount, instructor);

        if (paymentSuccess) {
            System.out.println("Payment successful. Proceeding to course registration.");
            // Further steps for course registration go here...

            return true;
        } else {
            System.out.println("Payment failed. Course registration unsuccessful.");
            return false;
        }
        
    }



}





