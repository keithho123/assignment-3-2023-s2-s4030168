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
        this.credentials = credentials;
        this.fee = fee;
    }
}
