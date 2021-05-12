package $20_Encapsulation;

public class App {
    public static void main(String[] args) {
        Customer c =new Customer();
        c.setFirstName("Raghul");
        c.setLastName("Ashok");
        c.setCreditCard("tmb");
        
        System.out.println(c.getFirstName());
        System.out.println(c.getLastName());
        System.out.println(c.getCreditCard());
    }
}
// encapsulation is used for security