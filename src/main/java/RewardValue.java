public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue, double milesValue) {
        this.cashValue = cashValue;
        this.milesValue = milesValue;
    }

    // Overloaded constructor for miles only
    public RewardValue(double milesValue) {
        this(milesValue * 0.0035, milesValue); // Call the main constructor with converted cash value
    }

    // Get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get miles value
    public double getMilesValue() {
        return milesValue;
    }
}
