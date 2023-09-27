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
}
