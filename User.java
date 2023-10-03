/**
 * User class representing system's clients (not logged in)
 */
public class User {
    /**
     * Empty constructor
     */
    private String email;  // Email of the user
    public User () {}

     // Constructor with email parameter
     public User(String email) {
        this.email = email;
        // ... other initialization logic ...
    }

    // Getter for email
    public String getEmail() {
        return this.email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }


    
}
