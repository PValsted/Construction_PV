
public class Business extends Building {
	protected int numRentableUnits;
	
	//begin constructors
	
	public Business () {
		super();
		numRentableUnits=0;
	}//end empty constructor
	
	public Business (String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numRentableUnits) {
		this.numRentableUnits=numRentableUnits;
		super.setProjectName(projectName);
		super.setCompleteAddress(completeAddress);
		super.setOccupancyGroup(occupancyGroup);
		super.setSubgroup(subgroup);
		super.setTotalSquareFeet(totalSquareFeet);
	}//end preferred constructor
	
	//end constructors
	
	public void draw() {
		System.out.println("Drawing code for Business");
	} //end draw method
	
	public String displayData() {
		StringBuilder sb = new StringBuilder("=============== Business ===============\n\n");
		sb.append("Project Name: " + getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "\n");
		sb.append("Number of Rentable Units: " + getNumRentableUnits() + "\n\n");
		sb.append("========================================\n");
		return sb.toString();
	}//end displayData method
	
	//begin getter and setter
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	//end getter and setter
	
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup
				+ ", totalSquareFeet=" + totalSquareFeet + "]";
	} 
	
	//end toString method
		
}
