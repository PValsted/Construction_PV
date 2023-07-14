
public class Mall extends Business {
	private double medianUnitSize;
	private int numRentedUnits, numParkingSpaces;
	
	//begin constructors
	
	public Mall () {
		super();
		numRentedUnits=0;
		medianUnitSize=0.0;
		numParkingSpaces=0;
	}//end empty constructor
	
	public Mall (String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		this.medianUnitSize=medianUnitSize;
		this.numParkingSpaces=numParkingSpaces;
		this.numRentedUnits=numRentedUnits;
		super.setProjectName(projectName);
		super.setCompleteAddress(completeAddress);
		super.setOccupancyGroup(occupancyGroup);
		super.setSubgroup(subgroup);
		super.setTotalSquareFeet(totalSquareFeet);
		super.setNumRentableUnits(numRentableUnits);
	}//end preferred constructor
	
	//end constructors
	
	public void draw() {
		System.out.println("Drawing code for Mall");
	} //end draw method
	
	public String displayData() {
		StringBuilder sb = new StringBuilder("=============== Mall ===============\n\n");
		sb.append("Project Name: " + getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "\n");
		sb.append("Number of Rentable Units: " + getNumRentableUnits() + "\n");
		sb.append("Number of Rented Units: " + getNumRentedUnits() + "\n");
		sb.append("Median Unit Size: " + getMedianUnitSize() + "\n");
		sb.append("Number of Parking Spots: " + getNumParkingSpaces() + "\n\n");
		sb.append("====================================\n");
		return sb.toString();
	}//end displayData method

	//begin getters and setters
	
	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	
	//end getters and setters

	@Override
	public String toString() {
		return "Mall [medianUnitSize=" + medianUnitSize + ", numRentedUnits=" + numRentedUnits + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + ", totalSquareFeet=" + totalSquareFeet + "]";
	}//end toString method
	
}
