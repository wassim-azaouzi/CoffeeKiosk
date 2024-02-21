import java.util.ArrayList ;
class CoffeeKiosk {
    public ArrayList<Item> menu;
    public ArrayList<Order> orders;
    public CoffeeKiosk () {
        this.menu = new ArrayList<Item> () ;
        this.orders= new ArrayList<Order> ();
    }
    public void addMenuItem(String name,double price ){
        Item newItem = new Item(name,price) ; 
        menu.add (newItem) ;
        newItem.setIndex(menu.indexOf(newItem));
    }
    public void displayMenu(){
        for(int i=0; i<menu.size() ; i++ ){
            System.out.println(menu.get(i).getIndex() + " "+ menu.get(i).getName() +" -- $"+ menu.get(i).getPrice());
                          //   menu[i] array
        }

   
    }
    public void newOrder() {
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        
        // Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order order= new Order(name);
        displayMenu();

        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
            
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            // Get the item object from the menu, and add the item to the order
            order.addItem(menu.get(Integer.parseInt(itemNumber)));
           // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
        order.display();
        System.out.println("Your Total: $"+order.getOrderTotal());

        // as the example below. You may use the order's display method.
            
    }


    public void addMenuItemByInput() {
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter Item name or q to quit:");
        String name = System.console().readLine();

        System.out.println("Please enter Item price or q to quit:");
        String price = System.console().readLine();
        
        displayMenu();
            
        while(!name.equals("q") || !price.equals("q")) {
            addMenuItem( name, Double.parseDouble(price) );  
            
            System.out.println("Please enter Item name or q to quit:");
            name = System.console().readLine();

            System.out.println("Please enter Item price or q to quit:");
            price = System.console().readLine();
        }
        displayMenu();
            
    }

}