package auctionsystem;
import java.util.*;

public class AuctionService {
    private List<Item> items = new ArrayList<>();
    private List<Bid> bids = new ArrayList<>();
    private int bidCounter = 1;

    public void listItem(Item item) {
        items.add(item);
        System.out.println("Item listed: " + item.getTitle());
    }

    public void listItems() {
        System.out.println("Listing all items:");
        for (Item item : items) {
            item.display();
        }
    }

    public void placeBid(int itemId, User bidder, double amount) {
        placeBid(itemId, bidder, amount, 0.0);
    }

    // Overloaded method with maxAutoBid (ignored for simplicity)
    public void placeBid(int itemId, User bidder, double amount, double maxAutoBid) {
        Item item = getItemById(itemId);
        if (item != null && item.getState().equals("Open")) {
            if (amount >= item.getBasePrice()) {
                Bid bid = new Bid(bidCounter++, itemId, bidder, amount, new Date());
                bids.add(bid);
                System.out.println("Bid placed: " + amount + " by " + bidder.getName());
            } else {
                System.out.println("Bid too low for item: " + item.getTitle());
            }
        } else {
            System.out.println("Cannot place bid. Item not found or closed.");
        }
    }

    public void closeAuction(int itemId) {
        Item item = getItemById(itemId);
        if (item != null) {
            item.setState("Closed");
            System.out.println("Auction closed for item: " + item.getTitle());
        }
    }

    public void winner(int itemId) {
        Item item = getItemById(itemId);
        if (item != null) {
            Bid highest = null;
            for (Bid bid : bids) {
                if (bid.getItemId() == itemId) {
                    if (highest == null || bid.getAmount() > highest.getAmount()) {
                        highest = bid;
                    }
                }
            }
            if (highest != null) {
                System.out.println("Winner for " + item.getTitle() + ": " + highest.getBidder().getName() + " with bid " + highest.getAmount());
            } else {
                System.out.println("No bids placed for item: " + item.getTitle());
            }
        }
    }

    public void generateInvoice(int itemId) {
        Item item = getItemById(itemId);
        if (item != null) {
            Bid highest = null;
            for (Bid bid : bids) {
                if (bid.getItemId() == itemId) {
                    if (highest == null || bid.getAmount() > highest.getAmount()) {
                        highest = bid;
                    }
                }
            }
            if (highest != null) {
                System.out.println("Invoice for " + item.getTitle() + ":");
                System.out.println("Seller: " + item.getSeller().getName());
                System.out.println("Buyer: " + highest.getBidder().getName());
                System.out.println("Amount: " + highest.getAmount());
            } else {
                System.out.println("No invoice generated. No bids for " + item.getTitle());
            }
        }
    }

    private Item getItemById(int itemId) {
        for (Item item : items) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null;
    }
}
