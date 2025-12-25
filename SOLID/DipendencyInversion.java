package SOLID;

interface NotificationSender {
    void send(String receiver, String message);
}

class EmailSender implements NotificationSender {
    public void send(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }
}

class SMSSender implements NotificationSender {
    public void send(String phone, String message) {
        System.out.println("Sending SMS to " + phone + ": " + message);
    }
}


class NotificationManager {
    private NotificationSender sender;

    public NotificationManager(NotificationSender sender) {
        this.sender = sender;
    }

    public void notify(String receiver, String message) {
        sender.send(receiver, message);
    }
}

//Wrong Approach: Violates Dependency Inversion Principle
class Email{
    public void send(String email, String message){
        System.out.println("Sending email to " + email + " with message: " + message);
    }
}

class NotificationManagerOld{
    private Email emailService;

    public NotificationManagerOld() {
        this.emailService = new Email();
    }

    public void notifyByEmail(String email, String message){
        emailService.send(email, message);
    }
}