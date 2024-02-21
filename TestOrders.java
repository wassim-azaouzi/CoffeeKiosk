import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        CoffeeKiosk kiosk1= new CoffeeKiosk();
        kiosk1.addMenuItem("mocha", 10.25); 
        kiosk1.addMenuItem("latte",8.25);
        kiosk1.addMenuItem("drip coffee",5.50);
        kiosk1.addMenuItem("capuccino",10.25);
        
        kiosk1.displayMenu();

        kiosk1.newOrder();

        kiosk1.addMenuItemByInput();

    }
}
