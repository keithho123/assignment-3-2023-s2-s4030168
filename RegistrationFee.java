/**
 * RegistrationFee class to pay course's fee
 */
public class RegistrationFee {

    /**
     * Empty constructor
     */
    public RegistrationFee(){}

    /**
     * Method to send invoice to the user who paid the fee
     */
    public void sendInvoice(Invoice invoice, User user){
       // Send invoice to user's email (missing implementation)
       System.out.println("Invoice sent to " + user.getEmail());
    

    }
    /**
     * Function to select payment method
     *
     * @return String indicating desired payment method
     */
    public String selectPaymentMethod(){
        // Simulating user selecting a payment method
        System.out.println("User selects a payment method.");
        return "CreditCard";
    }


    /**
     * Method to actually pay the fee
     *
     * @param credentials indicating the payment's information
     * @param paymentMethod String indicating desired payment method
     * @param fee indicating amount to be paid
     * @return boolean indicating if payment was successful
     */
    public boolean verifyPayment(String credentials, String paymentMethod, float fee){
        boolean success = Math.random() < 0.9;
        System.out.println(success ? "Payment successful." : "Payment failed.");
        // Attempt to charge designated amount (missing implementation)
        return success;
    }

    /**
     * Method to get the payment information required
     *
     * @return String indicating desired information (credentials)
     */
    public String getPaymentInfo(){
        String info = "";
        // Prompt user to enter information (missing implementation)
        System.out.println("User provides payment information.");
        return "SamplePaymentCredentials";
        
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


