package auctionsystem;
public class AuctionAppMain {
    public static void main(String[] args) {
        AuctionService service = new AuctionService();

        // Register users
        User buyer = new User(1, "Alice", "alice@example.com", 4.5, "Buyer");
        VerifiedSeller seller = new VerifiedSeller(2, "Bob", "bob@example.com", 4.8, "Seller", 10000.0, 2.5);

        // List users
        buyer.display();
        seller.display();

        // List items
        Item item1 = new Item(1, "Laptop", "Gaming Laptop", 500.0, seller, "Open");
        Item item2 = new Item(2, "Phone", "Smartphone", 200.0, seller, "Open");
        service.listItem(item1);
        service.listItem(item2);

        service.listItems();

        // Place bids
        service.placeBid(1, buyer, 550.0);
        service.placeBid(2, buyer, 250.0);

        // Close auctions
        service.closeAuction(1);
        service.closeAuction(2);

        // Declare winners
        service.winner(1);
        service.winner(2);

        // Generate invoices
        service.generateInvoice(1);
        service.generateInvoice(2);
    }
}
