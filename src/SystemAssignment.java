
public class SystemAssignment {
	
//Part A - 1. Declare class variables in line with UML specifications
	
		private String make;
		private String model;
		private int speed;
		private int memorySize; // in MB
		private double hardDiskSize; // in GB
		private double purchaseCost;
		
//Part A - 2. Implement methods in line with UML specifications
		
	 // a. The constructor initialises the make, model and processor speed of the system.

		public SystemAssignment (String makeIn, String modelIn, int speedIn){
			
			make=makeIn; // initialise values
			model=modelIn;
			speed=speedIn;
		}
		
	// b. Set memory size: +setMemory(int)

		public void setMemory(int memorySizeIn) {
			memorySize = memorySizeIn;	
		}
		
	// b1. create method to return set memory size 
		public int getMemory() {
			return memorySize;
		 }
		
	// c. Set hard disk size: +setHardDisk(double)
		
		public void setHardDiskSize(double hardDiskSizeIn) {
			hardDiskSize = hardDiskSizeIn;
		}
		
	// c1. create method to return set hard disk size
			public double getHardDiskSize() {
				return hardDiskSize;
			}

	// d. Set purchase cost: +setPurchaseCost(double) 
		
		public void setPurchaseCost(double purchaseCostIn) {
			purchaseCost = purchaseCostIn;
		}
		
	//d1. create method to return set purchase cost
		public double getPurchaseCost() {
			return purchaseCost;
		}
		
	// e. Get make: +getMake():String 
		
		public String getMake() {
			return make;
		}

	// f. Get model: +getModel():String
		
		public String getModel() {
			return model;
		}
		
	// g. Get processor speed: +getProcessorSpeed():int 
		
		public int getProcessorSpeed() {
			return speed;
		}
		
	// h. Display all the details of the system as a String: +displayDetails(): String 

		public String displayDetails() {
			
			return "System make = " + getMake() + '\n' +
					"System model = " + getModel() + '\n' +
					"Processor speed = " + getProcessorSpeed() + '\n' +
					"Memory size in MB = " + memorySize + '\n' +
					"Hard disk size in GB = " + hardDiskSize + '\n' +
					"Purchase cost = " + purchaseCost;
		}

	// i.  Check if hard disk size is below 2 GB: +checkHDStatus(): String 
		
		public String checkHDStatus() {
			
			if (this.hardDiskSize < 2) {
				
				return "Low"; // return "Low" if hard disk size is below 2 GB
				
			} else {
				
				return "OK"; // return "OK" otherwise
			}
		}
		
	// j. Check if the ram memory size is below 128 MB: +goodMemorySize(): boolean 
		
		public boolean goodMemorySize() {
			
			if (memorySize < 128) {
				
				return false; // returns false if memory smaller than 128 MB
				
			} else {
				
				return true; // returns true otherwise
			}
		}
		
	// k. +diagnoseSystem(): String	
		
		public String diagnoseSystem() {
			
			return "Hard disk size = " + checkHDStatus() + '\n' +  // call checkHDStatus to display HD size
					"Memory size OK = " + goodMemorySize(); // call goodMemorySize to display if memory size is OK
		}
		
// Part B - Create displaySystemProperties method using java System class
		
		public String displaySystemProperties() {
			
			return "Operating System Architecture: " + System.getProperty("os.arch") + '\n' +  //call relevant System class methods
					"Operating System Name: " + System.getProperty("os.name") + '\n' +
					"Operating System Version: " + System.getProperty("os.version") + '\n' +
					"User Account Name: " + System.getProperty("user.name") + '\n' + 
					"Java Version: " + System.getProperty("java.version");
			}
		
		//Method to provide message based on operating system
		public String osMessage () {
			
			if (System.getProperty("os.name") == "Windows 10") {
				return "Yay! Your os is Windows 10! :D "; // print positive message for Windows user
				
			}else if (System.getProperty("os.name") == "Linux") {
				return "Meh. Your os is Linux. :| "; //print neutral message for Linux user
				
			}else {
				return "Oh no! You are not a Windows10 or Linux user! :("; // print negative message otherwise
		}
	}

}// end of class
