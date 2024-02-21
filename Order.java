import java.util.ArrayList;
class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items; 

    
    public Order () {
        this.name = "Guest";
        this.items = new ArrayList<Item>() ;
        }
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>() ;
    }
    //getter
    public String getName() {
        return name;
    }
    
    // setter
    public void setName(String name) {
        this.name = name;
    }
    //getter 
    public boolean isReady() {
        return ready;
    }
    
    // setter
    public void setReady( boolean ready) {
        this.ready = ready;
    }
     //getter 
    public ArrayList<Item> getItems() {
        return items;
    }
    
    // setter
    public void setItems( ArrayList<Item> items) {
        this.items = items;
    }
    
    public void addItem(Item item) {
    this.items.add(item);
    }

    public String getStatusMessage() {
        if (ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total=0;
        for (int i=0; i<items.size(); i++){
            total+=items.get(i).getPrice();
        }
        return total;
    }

    public void display () {
        System.out.println("Customer Name: " + getName());
        for (int i=0; i<items.size(); i++){
            Item item=items.get(i);
            System.out.println( item.getName()+" - $"+item.getPrice() );
        }
        
    }


}