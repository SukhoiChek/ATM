public class NotEnoughBanknotes extends RuntimeException {
    public NotEnoughBanknotes(int amount) {
        super("Not enough banknotes for sum: " + amount);
    }

}
