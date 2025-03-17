package WithPrinciple;
class Validation {
    public static boolean validateEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
}
class Customer {
    String name;
    String email;
    
    Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    boolean validateEmail() {
        return Validation.validateEmail(email);
    }
    
    void placeOrder() {
        System.out.println(name + " has placed an order.");
    }
}
class Supplier {
    String name;
    String email;
    
    Supplier(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    boolean validateEmail() {
        return Validation.validateEmail(email);
    }
    
    void supplyProduct() {
        System.out.println(name + " has supplied products.");
    }
}
class Admin {
    String name;
    String email;
    
    Admin(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    boolean validateEmail() {
        return Validation.validateEmail(email);
    }
    
    void manageUsers() {
        System.out.println(name + " is managing users.");
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Customer customer = new Customer("Sara", "sara.45@gmail.com");
        Supplier supplier = new Supplier("Aleena", "aleena@yahoo.com");
        Admin admin = new Admin("Khanum", "coco@gmail");
        
        System.out.println("Customer email valid: " + customer.validateEmail());
        System.out.println("Supplier email valid: " + supplier.validateEmail());
        System.out.println("Admin email valid: " + admin.validateEmail());
        
        customer.placeOrder();
        supplier.supplyProduct();
        admin.manageUsers();
    }
}

