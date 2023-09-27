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
        refund = 0;
    }

    /**
     * Method to allow a refund of the course
     *
     */
    public void allowRefund(float amount){
        refund = amount;
    }
}
