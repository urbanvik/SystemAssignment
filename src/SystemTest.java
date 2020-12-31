import java.util.Scanner;

public class SystemTest {

	public static void main(String[] args) {
		
// Part A testing
		
		System.out.println("*** PART A  - Testing ***"); //for clarity on section testing
		System.out.println(""); //create space

		//Create a mySystem, mySystem2 and mySystem3 objects with different values
		SystemAssignment mySystem = new SystemAssignment("Make1", "Model1", 150);
		SystemAssignment mySystem2 = new SystemAssignment("Make2", "Model2", 20);
		SystemAssignment mySystem3 = new SystemAssignment("Make3", "Model3", 1000);
		
		//set memory size in MB and check for higher, lower and equal to 128 MB to check goodMemorySize method
		mySystem.setMemory(500); 
		mySystem2.setMemory(1);
		mySystem3.setMemory(128); 
		
		//set purchase cost of My System
		mySystem.setPurchaseCost(1500);
		mySystem2.setPurchaseCost(1200);
		mySystem3.setPurchaseCost(800);
		
		//set hard disk size in GB for higher, lower and equal to 2 GB to test checkHDStatus method
		mySystem.setHardDiskSize(12);
		mySystem2.setHardDiskSize(0);
		mySystem3.setHardDiskSize(2);
		
		//Display details of the System and test individual get methods
		System.out.println("1. The following tests the get methods:");
		System.out.println("System make: " + mySystem.getMake());
		System.out.println("System model: " + mySystem.getModel());
		System.out.println("Processor speed: " + mySystem.getProcessorSpeed());
		System.out.println("Memory size in MB: " + mySystem.getMemory());
		System.out.println("Purchase cost: " + mySystem.getPurchaseCost());
		System.out.println("Hard disk size in GB: " + mySystem.getHardDiskSize());
		
		System.out.println(""); // create space
		
		//Test displayDetails method
		System.out.println("2. The following tests the displayDetails method for each 3 system:");
		System.out.println(">Details of System 1: ");
		System.out.println(mySystem.displayDetails()); //display system 1 details
		System.out.println(""); // create space
		System.out.println(">Details of System 2: ");
		System.out.println(mySystem2.displayDetails());//display system 2 details
		System.out.println(""); // create space
		System.out.println(">Details of System 3: ");
		System.out.println(mySystem3.displayDetails());//display system 3 details
		System.out.println(""); // create space
		
		//Test check HD status method
		System.out.println("3. The following tests the checkHDStatus method: ");
		System.out.println("Is hard disk size OK or low for System 1? >> " + mySystem.checkHDStatus());
		System.out.println("Is hard disk size OK or low for System 2? >> " + mySystem2.checkHDStatus());
		System.out.println("Is hard disk size OK or low for System 3? >> " + mySystem3.checkHDStatus());
		System.out.println(""); // create space
		
		//Test memory size method
		System.out.println("4. The following tests the goodMemorySize method: ");
		System.out.println("Is memory size smaller than 128 MB for System 1? >> " + mySystem.goodMemorySize());
		System.out.println("Is memory size smaller than 128 MB for System 2? >> " + mySystem2.goodMemorySize());
		System.out.println("Is memory size smaller than 128 MB for System 3? >> " + mySystem3.goodMemorySize());
		System.out.println(""); // create space
		
		//Test diagnose System method
		System.out.println("5. The following tests the diagnoseSystem method for all 3 System objects: ");
		System.out.println(">System 1 diagnosis: ");
		System.out.println(mySystem.diagnoseSystem()); // diagnose system 1
		System.out.println(">System 2 diagnosis: ");
		System.out.println(mySystem2.diagnoseSystem()); // diagnose system 2
		System.out.println(">System 3 diagnosis: ");
		System.out.println(mySystem3.diagnoseSystem()); // diagnose system 3
		System.out.println(""); // create space
		
// Part B testing
		
		System.out.println("*** PART B  - Testing ***");
		System.out.println(""); //create space
		
		//test displaySystemProperties method
		System.out.println("The following tests the display system properties method in Part B. ");
		System.out.println(mySystem.displaySystemProperties());
		System.out.println(""); // create space
		
		//test osMessage method
		System.out.println(mySystem.osMessage());
		System.out.println(""); // create space

	
// Part C - Creating a textual menu
	
	 SystemAssignment mySystem4 = new SystemAssignment("Part", "C", 200); // create and initialise new system object
	 
	 char response; // declare variable for user input
	 
	 Scanner sc = new Scanner(System.in); // user input prompt
	 
	 System.out.println(""); // create space
	 System.out.println("*** Part C - Contextual Menu Options ***"); 
	 System.out.println(""); // create space

	 do // create loop for menu
	 { 
		 //Menu options
		 System.out.println("Option 1 - Print System Details");
		 System.out.println("Option 2 - Display System Properties");
		 System.out.println("Option 3 - Diagnose System");
		 System.out.println("Option 4 - Set Details"); 
		 System.out.println("Choice 5 – Quit the program "); 
		 System.out.println("Please select one of the following options (1-5): ");
		 
		 response = sc.next().charAt(0);
		 System.out.println(""); // create space
		 
		 switch(response) // switch between menu option based on user input
		 {
		 
		 case '1' : System.out.println(mySystem4.displayDetails()); // print system details
		 			System.out.println("You can set your details under menu Option 4!"); //direct user to option 4 to update nil values
		 			System.out.println(""); // create space
		 			break;
		 			
		 case '2' : System.out.println(mySystem4.displaySystemProperties()); //print system properties
		 			System.out.println(mySystem4.osMessage()); // print message for os system
		 			System.out.println(""); // create space
		 			break;
		 			
		 case '3' : System.out.println(mySystem4.diagnoseSystem()); // print system diagnosis
		 			System.out.println(""); // create space
					break;	
					
		 case '4' : System.out.println("Please enter the hard disk size in GB: "); // prompt user to enter HD size
		 			mySystem4.setHardDiskSize(sc.nextDouble()); // set HD size to user input
		 			
		 			System.out.println("");// create space
		 			
		 			System.out.println("Please enter the memory size in MB: "); // prompt user to enter memory size
		 			mySystem4.setMemory(sc.nextInt()); // set memory size to user input
		 
		 			System.out.println("");// create space
		 			
		 			System.out.println("Please enter the purchase price: ");
		 			mySystem4.setPurchaseCost(sc.nextDouble()); // set price to user input
		 			
		 			System.out.println("");// create space
		 			
		 			System.out.println("You can view your entered details under menu Option 1! ");
		 			System.out.println("");// create space
					break;	
					
		 case '5' : System.out.println("*** Program exited ***"); // Exit program
		 			System.out.println(""); // create space
					break;	
					
		 default: System.out.println("Please enter a valid option between 1-5! "); //default message if incorrect entry
		 }
		 
	 } while (response != '5'); // repeat menu loop until option '5' is selected 
	 
	}
	
}// end of test class
