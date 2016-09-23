
class LongDistanceBill extends PhoneBill {
	private double callRate;

	public double getCallRate() {
		return callRate;
	}
	public void setCallRate(double callRate) {
		this.callRate = callRate;
	}
	public LongDistanceBill(double monthlyRate, double callRate) {
		super(monthlyRate);
		this.callRate= callRate;
	}
	public double calculateBill (int time){
		return (callRate * time + getMonthlyRate());
	}
}
