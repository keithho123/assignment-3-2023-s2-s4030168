/**
 * RegistrationFee class to pay course's fee
 */
public class RegistrationFee {

    /**
     * Method to send invoice to the user who paid the fee
     */
    public void sendInvoice(Invoice invoice, User user){
       // Send invoice to user's email
    }

    /**
     * Method to actually pay the fee
     *
     * @return boolean indicating if payment was successful
     */
    public boolean verifyPayment(String credentials, String paymentMethod, float fee){
        boolean success = false;
        // Attempt to charge designated amount
        return success;
    }

    /**
     * Method to get the payment information required
     *
     * @return String indicating desired information (credentials)
     */
    public String getPaymentInfo(){
        String info = "";
        // Prompt user to enter information
        return info;
    }

    /**
     * Method to select payment method
     *
     * @return String indicating desired payment method
     */
    public String selectPaymentMethod(){
        String paymentMethod = "";
        // Prompt user to decide payment
        return paymentMethod;
    }

    /**
     * Method to publish a new course
     *
     * @param fee indicating amount to be paid
     * @param user to make the payment
     * @return boolean indicating if payment was successful
     */
    public boolean pay(float fee, User user){
        // Get all payment information
        String paymentMethod = selectPaymentMethod();
        String credentials = getPaymentInfo();

        // Attempt payment
        boolean success = verifyPayment(credentials, paymentMethod, fee);

        // Send invoice if valid payment
        if(success){
            Invoice invoice = new Invoice(credentials, fee);
            sendInvoice(invoice, user);
        }

        return success;
    }
}
