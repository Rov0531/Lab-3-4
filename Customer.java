public class Customer {

    String name;
    int points;
    static int totalCustomers = 0;

    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
        totalCustomers++;
    }

    public Customer() {
        this.name = "Unknown";
        this.points = 0;
        totalCustomers++;
    }

    public void showAllowedRewards() {
        int rewards = points / 100;
        System.out.println(name + " can redeem " + rewards + " reward(s).");
    }
}
