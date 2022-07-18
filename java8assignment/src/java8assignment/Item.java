package java8assignment;

public class Item {
	
	    int itemid;
	    String item_name,category_name;
	    double price ;
	    String date_of_manufacturing, date_of_expiring;
	    public int getItemid() {
	        return itemid;
	    }
	    public void setItemid(int itemid) {
	        this.itemid = itemid;
	    }
	    public String getItem_name() {
	        return item_name;
	    }
	    public void setItem_name(String item_name) {
	        this.item_name = item_name;
	    }
	    public String getCategory_name() {
	        return category_name;
	    }
	    public void setCategory_name(String category_name) {
	        this.category_name = category_name;
	    }
	    public double getPrice() {
	        return price;
	    }
	    public void setPrice(double price) {
	        this.price = price;
	    }
	    public String getDate_of_manufacturing() {
	        return date_of_manufacturing;
	    }
	    public void setDate_of_manufacturing(String date_of_manufacturing) {
	        this.date_of_manufacturing = date_of_manufacturing;
	    }
	    public String getDate_of_expiring() {
	        return date_of_expiring;
	    }
	    public void setDate_of_expiring(String date_of_expiring) {
	        this.date_of_expiring = date_of_expiring;
	    }
	    protected Item(int itemid, String item_name, String category_name, double price, String date_of_manufacturing,
	            String date_of_expiring) {
	        super();
	        this.itemid = itemid;
	        this.item_name = item_name;
	        this.category_name = category_name;
	        this.price = price;
	        this.date_of_manufacturing = date_of_manufacturing;
	        this.date_of_expiring = date_of_expiring;
	    }
	    public Item() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    @Override
	    public String toString() {
	        return "Item [itemid=" + itemid + ", item_name=" + item_name + ", category_name=" + category_name + ", price="
	                + price + ", date_of_manufacturing=" + date_of_manufacturing + ", date_of_expiring=" + date_of_expiring
	                + "]";
	    } 

	    
	}
