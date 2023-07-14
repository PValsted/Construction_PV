
public class Apartment extends Residential {

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	//begin constructors
	
	public Apartment() {
		super();
		numRentableUnits=0;
		avgUnitSize=0.0;
		parkingAvailable=false;
	}//end empty constructor
	
	public Apartment (String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		this.numRentableUnits=numRentableUnits;
		this.avgUnitSize=avgUnitSize;
		this.parkingAvailable=parkingAvailable;
		super.setProjectName(projectName);
		super.setCompleteAddress(completeAddress);
		super.setOccupancyGroup(occupancyGroup);
		super.setSubgroup(subgroup);
		super.setTotalSquareFeet(totalSquareFeet);
		super.setNumBedrooms(numBedrooms);
		super.setNumBathrooms(numBathrooms);
		super.setLaundryRoom(laundryRoom);
	}//end preferred constructor

	//end constructors
	
	public void draw() {
		System.out.println("Drawing code for Apartment");
	} //end draw method
	
	public String displayData() {
		StringBuilder sb = new StringBuilder("=============== Apartment ===============\n\n");
		sb.append("Project Name: " + getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "\n");
		sb.append("Number of Bedrooms: " + getNumBedrooms() + "\n");
		sb.append("Number of Bathrooms: " + getNumBathrooms() + "\n");
		sb.append("Has laundry room?: " + isLaundryRoom() + "\n");
		sb.append("Number of Rentable Units: " + getNumRentableUnits() + "\n");
		sb.append("Average Unit Size: " + getAvgUnitSize() + "\n");
		sb.append("Has parking?: " + isParkingAvailable() + "\n\n");
		sb.append("=========================================\n");
		return sb.toString();
	}//end displayData method
	
	//begin getters and setters
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	//end getters and setters
	
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup
				+ ", totalSquareFeet=" + totalSquareFeet + "]";
	} //end toString method
	
}
 