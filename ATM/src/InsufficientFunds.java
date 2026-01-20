public class InsufficientFunds extends RuntimeException {
    public InsufficientFunds(int requested, int available) {
        super("There is not enough money on the card. Requested: " + requested + ", available: " + available);
    }
}
