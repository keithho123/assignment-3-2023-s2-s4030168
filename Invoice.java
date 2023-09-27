/**
 * Invoice class to represent payment
 */
public class Invoice {
    private String credentials;
    private float fee;

    /**
     * Invoice constructor
     */
    public Invoice (String credentials, float fee){
        // Should place information in the desired format to be printed and sent (missing implementation)
        this.credentials = credentials;
        this.fee = fee;
    }
}
