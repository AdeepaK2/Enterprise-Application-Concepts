package SOLID;

interface FaxSender{
    void sendFax(String faxNumber, String content);
}

interface EmailSender{
    void sendEmail(String email, String content);
}

interface SMSSender{
    void sendSMS(String phoneNumber, String content);
}

class Machine implements FaxSender, EmailSender{
    @Override
    public void sendFax(String faxNumber, String content) {
        System.out.println("Sending fax to " + faxNumber + " with content: " + content);
    }

    @Override
    public void sendEmail(String email, String content) {
        System.out.println("Sending email to " + email + " with content: " + content);
    }
}

class PhoneMachine implements SMSSender{
    @Override
    public void sendSMS(String phoneNumber, String content) {
        System.out.println("Sending SMS to " + phoneNumber + " with content: " + content);
    }
} 

//Wrong Approach: Violates Interface Segregation Principle

interface MultiFunctionDevice{
    void sendFax(String faxNumber, String content);
    void sendEmail(String email, String content);
    void sendSMS(String phoneNumber, String content);
}

class OldFashionedMachine implements MultiFunctionDevice{
    @Override
    public void sendFax(String faxNumber, String content) {
        System.out.println("Sending fax to " + faxNumber + " with content: " + content);
    }

    @Override
    public void sendEmail(String email, String content) {
        throw new UnsupportedOperationException("This machine does not support sending emails.");
    }

    @Override
    public void sendSMS(String phoneNumber, String content) {
        throw new UnsupportedOperationException("This machine does not support sending SMS.");
    }
}