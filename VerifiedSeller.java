package auctionsystem;
public class VerifiedSeller extends User {
    private double limit;
    private double fee;

    public VerifiedSeller(int userId, String name, String email, double rating, String role, double limit, double fee) {
        super(userId, name, email, rating, role);
        this.limit = limit;
        this.fee = fee;
    }

    public double getLimit() {
        return limit;
    }
    public double getFee() {
        return fee;
    }

    @Override
    public void display() {
        System.out.println("Verified Seller ID: " + userId + ", Name: " + name + ", Limit: " + limit + ", Fee: " + fee);
    }
}
