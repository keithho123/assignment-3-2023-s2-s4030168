/**
 * Course class to hold course's information
 */
public class Course {
    private String title;
    private Instructor instructor;
    private String category;
    private float fee;
    private float refund;

    /**
     * Method to create a new course
     *
     * @param title name of the course
     * @param instructor Instructor that created the course
     * @param category type of course
     * @param fee cost of the course
     */
    public Course(String title, Instructor instructor, String category, float fee) {
        this.title = title;
        this.instructor = instructor;
        this.category = category;
        this.fee = fee;
        this.refund = 0;
    }

    /**
     * Method to allow a refund of the course
     *
     */
    public void allowRefund(float amount){
        if (amount <= fee) {
            this.refund = amount;
        } else {
            System.out.println("Invalid refund amount. It should be less than or equal to the course fee.");
        }
    }

    public String getTitle() {
        return this.title;

    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public float getFee() {
        return this.fee;
    }
    
    public String getCategory() {
        return this.category;
    }

    public float getRefund() {
        return this.refund;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    

    
}
