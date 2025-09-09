package auctionsystem;
public class User {
    protected int userId;
    protected String name;
    protected String email;
    protected double rating;
    protected String role; // Seller or Buyer

    public User(int userId, String name, String email, double rating, String role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.rating = rating;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public double getRating() {
        return rating;
    }
    public String getRole() {
        return role;
    }

    public void display() {
        System.out.println("User ID: " + userId + ", Name: " + name + ", Role: " + role);
    }
}
