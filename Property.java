public class Property {

	private String propName; 
	private String propCity; 
	private double propRent; 
	private String propOwner;
	private Plot plot;

	
	public Property() {
		propName = "";
		propCity = "";
		propRent = 0;
		propOwner = "";
		this.plot = new Plot(0, 0, 1, 1);
	}

	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propName = propertyName;
		this.propCity = city;
		this.propRent= rentAmount;
		this.propOwner = owner;
	}

	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width,
			int depth) {
		this.propName = propertyName;
		this.propCity = city;
		this.propRent= rentAmount;
		this.propOwner = owner;
		this.plot = new Plot(x, y, width, depth);
	}

	
	public Property(Property p) {
		this.propName = p.propName;
		this.propCity = p.propCity;
		this.propOwner = p.propOwner;
		this.propRent = p.propRent;
		this.plot = p.plot;
	}

	
	public String getCity() {
		return propCity;
	}

	public void setCity(String city) {
		this.propCity = city;
	}
	
	public String getOwner() {
		return propOwner;
	}


	public void setOwner(String owner) {
		this.propOwner = owner;
	}

	
	public String getPropertyName() {
		return propName;
	}

	public void setPropertyName(String propertyName) {
		this.propName = propertyName;
	}

	
	public double getRentAmount() {
		return propRent;
	}
	
	public void setRentAmount(double rentAmount) {
		this.propRent = rentAmount;
	}

	public void setPlot(int x, int y, int width, int depth) {
		this.plot = new Plot(x, y, width, depth);
	}

	
	public Plot getPlot() {
		return plot;
	}

	
	public String toString() {
		String str1 = "Property Name: " + propName + "\n" + "Located in: " 
	+ propCity + "\n" + "Belonging to: " + propOwner
				+ "\n" + "Rent Amount: " + propRent + " ";
		return str1;
	}

}