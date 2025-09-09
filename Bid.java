package auctionsystem;
import java.util.Date;

public class Bid {
    private int bidId;
    private int itemId;
    private User bidder;
    private double amount;
    private Date time;

    public Bid(int bidId, int itemId, User bidder, double amount, Date time) {
        this.bidId = bidId;
        this.itemId = itemId;
        this.bidder = bidder;
        this.amount = amount;
        this.time = time;
    }

    public int getBidId() {
        return bidId;
    }
    public int getItemId() {
        return itemId;
    }
    public User getBidder() {
        return bidder;
    }
    public double getAmount() {
        return amount;
    }
    public Date getTime() {
        return time;
    }

    public void display() {
        System.out.println("Bid ID: " + bidId + ", Item ID: " + itemId + ", Bidder: " + bidder.getName() + ", Amount: " + amount);
    }
}
