 package WithoutPrinciple;
 class Customer {
    String name;
    String email;
   public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public boolean validateEmail() {
        if (email.contains("@") && email.contains(".")) {
            return true;
        }
      else
        return false;
       
       }
    
void placeOrder() {
        System.out.println(name + " has placed an order.");
    }
}
class Supplier {
    String name;
    String email;
    
    public Supplier(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    boolean validateEmail() {
        return email.contains("@") && email.contains(".");
    }
    
    void supplyProduct() {
        System.out.println(name + " has supplied products.");
    }
}
class Admin {
    String name;
    String email;
    
   public  Admin(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
   public boolean validateEmail() {
        return email.contains("@") && email.contains(".");
    }
    
   public void manageUsers() {
        System.out.println(name + " is managing users.");
    }
}
public class Ecommerce {
    public static void main(String[] args) {
        Customer customer = new Customer("ahmed", "ahmed.43@yahoo.com");
        Supplier supplier = new Supplier("Ali ", "ali@gmail.com");
        Admin admin = new Admin("Mr.Adil", "adi123.com");
        
        System.out.println("Customer email valid: " + customer.validateEmail());
        System.out.println("Supplier email valid: " + supplier.validateEmail());
        System.out.println("Admin email valid: " + admin.validateEmail());
        
        customer.placeOrder();
        supplier.supplyProduct();
        admin.manageUsers();
    }
}

    
    

