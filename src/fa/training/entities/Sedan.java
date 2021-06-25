package fa.training.entities;

public class Sedan extends Car {

	private int length;
	
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	@Override
	double getSalePrice() {
		return super.getRegularPrice() * (length > 20 ? 0.95 : 0.9);
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	

}
