public class ManagementCompany {

	static final int MAX_PROPERTY = 5;
	static final int MGMT_WIDTH = 10;
	static final int MGMT_DEPTH = 10;
	private String ID;
	private double Fee;
	private String name;
	private Property[] properties;
	private Plot plot;
	

	public ManagementCompany() {
		this.name = "";
		this.ID = "";
		this.plot = new Plot();
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(String name, String taxID, double mgmFeePer) {
		this.name = name;
		this.ID = taxID;
		this.Fee = mgmFeePer;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int width, int depth) {
		this.name = name;
		this.ID = taxID;
		this.Fee = mgmFeePer;
		this.plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = new String(otherCompany.name);
		this.ID = new String(otherCompany.ID);
		this.Fee = otherCompany.Fee;
		this.plot = new Plot(otherCompany.plot);
		this.properties = new Property[otherCompany.properties.length];
		for (int count = 0; count < otherCompany.properties.length; count++) {
			this.properties[count] = new Property(otherCompany.properties[count]);
		}
	}

	public String getName() {
		return name;
	}

	public String getTaxID() {
		return ID;
	}

	public double getMgmFeePer() {
		return Fee;
	}

	public Plot getPlot() {
		return new Plot(plot);
	}
	
	public Property[] getProperties() {
		return properties;
	}

	public int addProperty(Property property) {
		int addProp = -1;
		if (property==null) 
		{
			addProp=-2;
		}
		if (!plot.encompasses(property.getPlot()))
		{
			addProp=-3;
		}

		for (int count = 0; count < properties.length; count++)
		{
			if (properties[count] != null) {
				if (properties[count].getPlot().overlaps(property.getPlot())) {
					addProp=-4;
				}
			} else {
				properties[count] = property;
				return count;
			}
		}
		return addProp;
	}

	public int addProperty(String name, String city, double rent, String owner) {
		Property property = new Property(name, city, rent, owner);
		return (addProperty(property));
	}

	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		return (addProperty(property));
	}

	public boolean isPropertiesFull() {
		boolean isPropFull = false;
		if (properties[MAX_PROPERTY - 1] != null) {
			return true;
		}
		return isPropFull;	
	}

	public Property getHighestRentPropperty() {
		int highest = 0;
		for (int count = 1; count < properties.length; count++) {
			if (properties[count]==null) {
				break;
			}
			if (properties[count].getRentAmount() > properties[highest].getRentAmount()) {
				highest = count;
			}
		}
		return properties[highest];
	}
	
	public int getPropertiesCount() {
		int count = 0;
		for (int count1 = 0; count1 < MAX_PROPERTY; count1++) {
			if (properties[count1]!=null) {
				count++;
			}
		}
		return count;
	}

	
	public boolean isMangementFeeValid() {
		boolean ManagementFeevalid = true;
		if (Fee > 100 || Fee < 0) {
			ManagementFeevalid = false;
		}
		else {
			ManagementFeevalid=true;
		}
		return ManagementFeevalid;
	}

	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}

	public double getTotalRent() {
		double totalRent = 0;
		for (int count = 0; count < properties.length; count++) {
			if (properties[count] == null) {
				break;
			}
			totalRent += properties[count].getRentAmount();
		}
		return totalRent;
	}

	public void removeLastProperty() {
		properties[getPropertiesCount()-1] =null;
	}

	public String toString() {

		String listOfProperties = "";
		for (int count = 0; count < MAX_PROPERTY; count++) {
			if (properties[count]==null) {
				break;
			}
			listOfProperties+="\n"+properties[count];
		}
		
		String listOfProperties1="List of properties for " + name + ", taxID: " + ID
				+ "\n______________________________________________________\n" + listOfProperties
				+ "______________________________________________________" + "\ntotal management Fee: "
				+ (getTotalRent()*Fee/100);
		
		return listOfProperties1;
	}
}