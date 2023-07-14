
public class Building {
	protected String projectName=null, completeAddress=null, occupancyGroup=null, subgroup=null;
	protected double totalSquareFeet;
	
	//begin constructors
	
	public Building () {
		projectName="";
		completeAddress="";
		occupancyGroup="";
		subgroup="";
		totalSquareFeet=0.0;
	} //end empty constructor
	
	public Building (String projectName, String completeAddress, String occupancyGroup, String subgroup, double totalSquareFeet) {
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
		this.totalSquareFeet=totalSquareFeet;
	} //end preferred constructor
	
	//end constructors
	
	public void draw() {
		System.out.println("Drawing code for Building");
	} //end draw method
	
	public String displayData() {
		StringBuilder sb = new StringBuilder("=============== Building ===============\n\n");
		sb.append("Project Name: " + getProjectName() + "\n");
		sb.append("Address: " + getCompleteAddress() + "\n");
		sb.append("Square Feet: " + getTotalSquareFeet() + "\n");
		sb.append("Occupancy Group: " + getOccupancyGroup() + "\n");
		sb.append("Occupancy Subgroup: " + getSubgroup() + "\n\n");
		sb.append("========================================\n");
		return sb.toString();
	} //end displayData method
	
	//begin getters and setters
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	//end getters and setters
	
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + ", totalSquareFeet=" + totalSquareFeet + "]";
	} //end toString method
	
}
