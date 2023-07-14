
public class SingleFamilyHome extends Residential {

	private boolean garage;
	
	//begin constructors
	
	public SingleFamilyHome () {
		super();
		garage=false;
	}//end empty constructor
	
	public SingleFamilyHome(String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		this.garage=garage;
		super.setProjectName(projectName);
		super.setCompleteAddress(completeAddress);
		super.setOccupancyGroup(occupancyGroup);
		super.setSubgroup(subgroup);
		super.setTotalSquareFeet(totalSquareFeet);
		super.setNumBedrooms(numBedrooms);
		super.setNumBathrooms(numBathrooms);
		super.setLaundryRoom(laundryRoom);
	}//end preferred constructor

	public void draw() {
		System.out.println("Drawing code for SingleFamilyHome");
	} //end draw method

	public String displayData() {
		StringBuilder sb = new StringBuilder("=============== SingleFamilyHome ===============\n\n");
		sb.append("Project Name: " + getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "\n");
		sb.append("Number of Bedrooms: " + getNumBedrooms() + "\n");
		sb.append("Number of Bathrooms: " + getNumBathrooms() + "\n");
		sb.append("Has laundry room?: " + isLaundryRoom() + "\n");
		sb.append("Has garage?: " + isGarage() + "\n\n");
		sb.append("================================================\n");
		return sb.toString();
	}//end displayData method
	
	//begin getter and setter
	
	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
	//end getter and setter

	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup
				+ ", totalSquareFeet=" + totalSquareFeet + "]";
	}//end toString method
}
