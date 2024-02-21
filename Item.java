class Item {
    private String name;
    private double price;
    private int index ;
    public Item (String name,double price ) {
        // setting the color attribute to the value from the color parameter
        this.name = name;
        this.price = price;
        }
    //getter
    public String getName() {
        return name;
    }
    
    // setter
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    
    // setter
    public void setPrice( double price) {
        this.price = price;
    }
     //getter
    public int getIndex() {
        return index;
    }
    
    // setter
    public void setIndex(int index) {
        this.index = index;
    }
}


