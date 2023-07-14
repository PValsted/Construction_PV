
public class Application {

	public static void main(String[] args) {
		
		//Begin test of Building object
		
		Building tower=new Building();
		System.out.println(tower.toString()+"\n");
		
		Building tower1 = new Building("Tower", "500 City Avenue | Louisville, Kentucky 40241", "Storage", "S-2", 1000);
		System.out.println(tower1.toString());
		
		tower1.setProjectName("The Tower");
		System.out.println("\n" + tower1.getProjectName());
		
		tower1.setCompleteAddress("700 City Avenue | Louisville, Kentucky 40241");
		System.out.println(tower1.getCompleteAddress());
		
		tower1.setOccupancyGroup("Residential");
		System.out.println(tower1.getOccupancyGroup());
		
		tower1.setSubgroup("R-2");
		System.out.println(tower1.getSubgroup());
		
		tower1.setTotalSquareFeet(1500.0);
		System.out.println(tower1.getTotalSquareFeet() + "\n");
		
		System.out.println(tower1.displayData());
		
		//end test of Building object
		
		
		//begin test of Business object
		
		Business target=new Business();
		System.out.println(target.toString()+"\n");
		
		Business walmart=new Business("Walmart", "1500 Profit Plaza | Louisville, Kentucky 40241", "Business", "B", 1000, 5);
		System.out.println(walmart.toString());
		
		walmart.setNumRentableUnits(6);
		System.out.println("\n" + walmart.getNumRentableUnits()+ "\n");
		
		System.out.println(walmart.displayData());
		
		//end test of Business object
		
		//begin test of Residential object
		
		Residential housing=new Residential();
		System.out.println(housing.toString()+"\n");
		
		Residential housing1=new Residential("Crystal Heights", "300 Living Place | Louisville, Kentucky 40241", "Residential", "R-3", 3000, 2, 1, false);
		System.out.println(housing1.toString());
		
		housing1.setNumBedrooms(1);
		System.out.println(housing1.getNumBedrooms());
		
		housing1.setNumBathrooms(2);
		System.out.println(housing1.getNumBathrooms());
		
		housing1.setLaundryRoom(true);
		System.out.println(housing1.isLaundryRoom() + "\n");
		
		System.out.println(housing1.displayData());
		
		//end test of Residential object
		
		//begin test of Mall object
		
		Mall mall=new Mall();
		System.out.println(mall.toString()+"\n");
		
		Mall mall1=new Mall("Mall of Louisville", "99 Retail Boulevard | Louisville, Kentucky 40241", "Business", "B", 10000, 25, 21, 100.0, 1000);
		System.out.println(mall1.toString());
		
		mall1.setNumRentedUnits(24);
		System.out.println(mall1.getNumRentedUnits());
		
		mall1.setMedianUnitSize(150.0);
		System.out.println(mall1.getMedianUnitSize());
		
		mall1.setNumParkingSpaces(1200);
		System.out.println(mall1.getNumParkingSpaces()+ "\n");
		
		System.out.println(mall1.displayData());
		
		//end test of Mall object
		
		//begin test of Apartment object
		
		Apartment rent=new Apartment();
		System.out.println(rent.toString()+"\n");
		
		Apartment rent1=new Apartment("Venetian Tower", "4590 Living Place | Louisville, Kentucky 40241", "Residential", "R-1", 3000, 2, 1, false, 100, 50.0, false);
		System.out.println(rent1.toString());
		
		rent1.setNumRentableUnits(150);
		System.out.println(rent1.getNumRentableUnits());
		
		rent1.setAvgUnitSize(75.0);
		System.out.println(rent1.getAvgUnitSize());
		
		rent1.setParkingAvailable(true);
		System.out.println(rent1.isParkingAvailable()+"\n");
		
		System.out.println(rent1.displayData());
		
		//end test of Apartment object
		
		//begin test of SingleFamilyHome object
		
		SingleFamilyHome house=new SingleFamilyHome();
		System.out.println(house.toString()+"\n");
		
		SingleFamilyHome house1=new SingleFamilyHome("Family Home", "1010 Tulip Lane | Louisville, Kentucky 40241", "Residential", "R-2", 1500, 3, 2, true, false);
		System.out.println(house1.toString());
		
		house1.setGarage(true);
		System.out.println(house1.isGarage()+"\n");
		
		System.out.println(house1.displayData());
		
		//end test of SingleFamilyHome object
		
	}

}
