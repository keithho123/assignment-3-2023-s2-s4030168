/**
 * Instructor class (extending from User as it inherits from the User class)
 */
public class Instructor extends User {
    private String email;
    private String password;
    private User user;

    /**
     * Empty constructor
     */
    public Instructor(){}

    /**
     * Constructor to create a new instructor given a user.
     *
     * @param user instance of User who registers a course and becomes an instructor
     * @param credentials String containing email and password of instructor to access the system
     */
    public Instructor(User user, String credentials){
        this.user = user;

        // Split credentials accordingly using credentials (missing implementation)
        this.email = "";
        this.password = "";
    }

    /**
     * Constructor to create a new instructor.
     *
     * @param email Email of the instructor
     * @param password Password for the instructor to access the system
     */
    public Instructor(String email, String password){
        this.email = email;
        this.password = password;
    }

    /**
     * Verifies if the provided password matches the instructor's password.
     *
     * @param inputPassword Password to be verified
     * @return boolean indicating if passwords match
     */
    public boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public String getEmail() {
        return this.email;
    }
}
