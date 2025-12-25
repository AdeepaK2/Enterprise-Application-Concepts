package SOLID;

class Customer{
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class CustomerDataStorage{
    public void saveCustomer(Customer customer){
        // Logic to save customer data to a database
        System.out.println("Customer " + customer.getName() + " saved to database.");
    }
}

class EmailService{
    public void sendEmail(Customer customer){
        // Logic to send a welcome email
        System.out.println("Welcome email sent to " + customer.getEmail());
    }
}

//Wrong Approach: Violates Single Responsibility Principle

class CustomerManager{
    private String name;
    private String email;
    public CustomerManager(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void saveCustomer(){
        // Logic to save customer data to a database
        System.out.println("Customer " + name + " saved to database.");
    }
    public void sendEmail(){
        // Logic to send a welcome email
        System.out.println("Welcome email sent to " + email);
    }
}