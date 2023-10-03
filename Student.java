public class Student extends User {
    private String personalDetails;

    // Constructor
    public Student() {
        super();
        this.personalDetails = "";
    }

    // Method to provide personal details
    public void providePersonalDetails(String details) {
        this.personalDetails = details;
    }

    // Method to select a course to enroll in
    public Course selectCourseToEnroll() {
        // Placeholder for selecting course logic
        // This can be implemented with a list of available courses and asking the student to choose
        Course course = new Course("Sample Course", new Instructor(), "Sample Category", 100.0f);
        return course;
    }

    public String getPersonalDetails() {
        return this.personalDetails;
    }

    // Getters, setters, and other methods related to Student can be added here
}
