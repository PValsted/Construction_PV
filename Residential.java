
public class Residential extends Building {

	protected int numBedrooms, numBathrooms;
	protected boolean laundryRoom=false;
	
	//begin constructors
	
	public Residential () {
		super();
		numBedrooms=0;
		numBathrooms=0;
		laundryRoom=false;
	}//end empty constructor
	
	public Residential (String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		this.numBedrooms=numBedrooms;
		this.numBathrooms=numBathrooms;
		this.laundryRoom=laundryRoom;
		super.setProjectName(projectName);
		super.setCompleteAddress(completeAddress);
		super.setOccupancyGroup(occupancyGroup);
		super.setSubgroup(subgroup);
		super.setTotalSquareFeet(totalSquareFeet);
	} //end preferred constructor
	
	//end constructors
	
	public void draw() {
		System.out.println("Drawing code for Residential");
	} //end draw method

	public String displayData() {
		StringBuilder sb = new StringBuilder("=============== Residential ===============\n\n");
		sb.append("Project Name: " + getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "\n");
		sb.append("Number of Bedrooms: " + getNumBedrooms() + "\n");
		sb.append("Number of Bathrooms: " + getNumBathrooms() + "\n");
		sb.append("Has laundry room?: " + isLaundryRoom() + "\n\n");
		sb.append("===========================================\n");
		return sb.toString();
	}//end displayData method
	
	//begin getters and setters
	
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}

	//end getters and setters
	
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", totalSquareFeet="
				+ totalSquareFeet + "]";
	}//end toString method
	
}
