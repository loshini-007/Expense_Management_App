package auctionsystem;
public class Item {
    private int itemId;
    private String title;
    private String description;
    private double basePrice;
    private User seller;
    private String state;

    public Item(int itemId, String title, String description, double basePrice, User seller, String state) {
        this.itemId = itemId;
        this.title = title;
        this.description = description;
        this.basePrice = basePrice;
        this.seller = seller;
        this.state = state;
    }

    public int getItemId() {
        return itemId;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public User getSeller() {
        return seller;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public void display() {
        System.out.println("Item ID: " + itemId + ", Title: " + title + ", Base Price: " + basePrice + ", State: " + state);
    }
}
