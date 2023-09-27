public class Instructor extends User{
    private String email;
    private String password;
    private User user;

    /**
     * Empty constructor
     */
    public Instructor(){}

    /**
     * Constructor to create a new instructor
     *
     * @param user instance of User who registered a course and become an instructor
     * @param credentials String containing email and password of instructor to access the system
     */
    public Instructor(User user, String credentials){
        this.user = user;

        // Split credentials accordingly using credentials
        this.email = "";
        this.password = "";
    }
}
