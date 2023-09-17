package m5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)
    static Scanner scnr = new Scanner(System.in);
    static String userInput = "0";  // initializing userInput

    public static void main(String[] args) {
    	
    	//creating input scanner
    	Scanner scnr = new Scanner(System.in);
    	boolean needInput;

    	// initializing lists with test data
        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        while (userInput != "q") {
        	displayMenu();
        	needInput = true;
        	while (needInput) {
        		
        		// checking for valid inputs
        		try {
        			userInput = scnr.nextLine();
        			// checking for quitting application
        			if ("q".equals(userInput)) {
        				System.out.println("Qutting App");
        				System.out.println("Goodbye!");
        				System.exit(0);
        			}
        			// determining if input is valid
        			if ((!"1".equals(userInput)) & (!"2".equals(userInput)) & (!"3".equals(userInput)) & (!"4".equals(userInput)) & (!"5".equals(userInput)) & (!"6".equals(userInput))){
        				System.out.println("Invalid Selection");
        				needInput = true;
        			}
        			// input is no longer needed and is valid
        			else {
        				needInput = false;
        			}
        		}
        		// throwing away incorrect input
        		catch (InputMismatchException e){
        			scnr.nextLine();
        			System.out.println("Please try a new input");
        			needInput = true;
        		}
        	}
        	
        // switch case for menu input
        	switch(userInput) {
        	
        	// intake dog case
        	case "1":
        		System.out.println("Intaking new Dog");
        		System.out.println("");
        		intakeNewDog(scnr);
        		break;
        	
        	// intake monkey case
        	case "2":
        		System.out.println("Intaking new Monkey");
        		System.out.println("");
        		intakeNewMonkey(scnr);
        		break;
        	
        	// reserve animal
        	case "3":
        		System.out.println("Reserving animal");
        		System.out.println("");
        		reserveAnimal(scnr);
        		break;
        	
        	// printing list of all dogs
        	case "4":
        		System.out.println("Print a list of all dogs");
        		System.out.println("");
        		printAnimals();
        		break;
        	
        	// printing list of all monkeys
        	case "5":
        		System.out.println("Printing list of monkeys");
        		System.out.println("");
        		printAnimals();
        		break;
        	
        	// printing list of all non-reserved animals
        	case "6":
        		System.out.println("print list of all animals not reserved and fully trained");
        		System.out.println("");
        		printAnimals();
        		break;
        	}
        }
    } 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "in service", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Alice", "Capuchin", "female", "2", "33.7", "03-05-2019", "Africa", "in service", false, "United States", "12.3", "45.2", "50.6");
    	Monkey monkey2 = new Monkey("Olo", "Macaque", "male", "1", "23.5", "10-03-2020", "China", "intake", false, "United States", "10.2", "33.7", "41.3");
    	Monkey monkey3 = new Monkey("Sage", "Marmoset", "male", "3", "20.2", "08-31-2021", "Africa", "Phase II", true, "Canada", "9.3", "27.3", "30.5");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    }


    // intakeNewDog method
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String dogName = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(dogName)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
	
		System.out.println("What is the dog's breed?");
		String dogBreed = scnr.nextLine();
	
		System.out.println("What is the dog's Gender?");
		String dogGender = scnr.nextLine();
	
		System.out.println("What is the dog's age?");
		String dogAge = scnr.nextLine();
	
		System.out.println("What is the dog's weight?");
		String dogWeight = scnr.nextLine();
	
		System.out.println("What is the dog's Acquisition date?");
		String dogDate = scnr.nextLine();
	
		System.out.println("Where was the dog located?");
		String dogLocation = scnr.nextLine();
	
		System.out.println("What is the dog's training status?");
		String dogStatus = scnr.nextLine();
		
		System.out.println("Is the dog reserved?");
		boolean dogReserved = scnr.nextBoolean();
		
		System.out.println("What is the dog's in service country?");
		String inServiceCountry = scnr.next();
	
		Dog intakeNewDog = new Dog(dogName, dogBreed, dogGender, dogAge, dogWeight, dogDate, dogLocation, dogStatus, dogReserved, inServiceCountry);
		
		dogList.add(intakeNewDog);  // adds dog to the list
		
		System.out.println("Completed intake for dog, returning to main menu.");
		return;
    }


        // intakeNewMonkey
        public static void intakeNewMonkey(Scanner scanner) {
        		
        		System.out.println("What is the monkey's name?");
        		String monkeyName = scanner.next();
                for(Monkey monkey: monkeyList) {
                    if(monkey.getName().equalsIgnoreCase(monkeyName)) {
                        System.out.println("\n\nThis monkey is already in our system\n\n");
                        return; //returns to menu
                    }
                }
    		
        		System.out.println("What is the monkey's Species?");
        		String monkeySpecies = scnr.nextLine();
        		if ((!"Capuchin".equals(monkeySpecies)) & (!"Guenon".equals(monkeySpecies)) & (!"Macaque".equals(monkeySpecies)) & (!"Marmoset".equals(monkeySpecies)) & (!"Squirrel monkey".equals(monkeySpecies)) & (!"Tamarin".equals(monkeySpecies))) {
        			System.out.println("\n\nThis species is not accepted.\n\n");
        			return;
        		}
        
        		System.out.println("What is the monkey's Gender?");
        		String monkeyGender = scnr.nextLine();
    		
        		System.out.println("What is the monkey's age?");
        		String monkeyAge = scnr.nextLine();
    		
        		System.out.println("What is the monkey's weight?");
        		String monkeyWeight = scnr.nextLine();
    		
        		System.out.println("What is the monkey's Acquisition date?");
        		String monkeyDate = scnr.nextLine();
    		
        		System.out.println("Where was the monkey located?");
        		String monkeyLocation = scnr.nextLine();
    		
        		System.out.println("What is the monkey's training status?");
        		String monkeyStatus = scnr.nextLine();
        		
        		System.out.println("What is the monkey's in service country?");
        		String inServiceCountry = scnr.nextLine();
    		
        		System.out.println("What is the monkey's tail length?");
        		String monkeyTailLength = scnr.nextLine();
    		
        		System.out.println("What is the monkey's height?");
        		String monkeyHeight = scnr.nextLine();
    		
        		System.out.println("What is the monkey's body length?");
        		String monkeyBodyLength = scnr.nextLine();
        		
        		System.out.println("Is the monkey reserved?");
        		boolean reserved = scnr.nextBoolean();
        		
        		// creating instance of new monkey for list CHECK FOR ERRORS LATER
        		Monkey intakeMonkey = new Monkey(monkeyName, monkeySpecies, monkeyGender, monkeyAge, monkeyWeight, monkeyDate, monkeyLocation, monkeyStatus, reserved, inServiceCountry, monkeyTailLength, monkeyHeight, monkeyBodyLength);
    		
        		monkeyList.add(intakeMonkey);
        		
        		System.out.println("Completed intake for moneky, Returning to main menu.");
        		return;
        		
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            
        	
        	System.out.println("Enter the type of animal: Dog or Monkey");
            
            String userInput = scnr.nextLine();
            if (("Monkey".equals(userInput) || ("monkey".equals(userInput)))) {
            	System.out.println("Please enter in service country: ");
            	String userCountry = scnr.nextLine();
            	for (Monkey obj: monkeyList) {
            		if (obj.getInServiceLocation().equals(userCountry)) {
            			System.out.println(obj);
            			System.out.println("Would you like to reserve the animal?");
            			userInput = scnr.nextLine();
            			if (("Yes".equals(userInput) || ("yes".equals(userInput)))) {
            				obj.setReserved(true);
            				System.out.println("You have reserved the monkey. Returning to menu.");
            			}
            			else {
            				System.out.println("Not reserving animal. Returning to menu.");
            			}
            			return;
            		} else {
            			System.out.println("No monkey in that country. Returning to main menu."); // enters country with no monkey in service
            			return; 
            		}
            	}
            }
            else if (("Dog".equals(userInput) || ("dog".equals(userInput)))) {
                	System.out.println("Please enter in service country: ");
                	String userCountry = scnr.nextLine();
                	for (Dog obj: dogList) {
                		if (obj.getInServiceLocation().equals(userCountry)) {
                			System.out.println(obj);
                			System.out.println("Would you like to reserve the animal?");
                			userInput = scnr.nextLine();
                			if (("Yes".equals(userInput) || ("yes".equals(userInput)))) {
                				obj.setReserved(true);
                				System.out.println("You have reserved the dog. Returning to menu.");
                			}
                			else {
                				System.out.println("Not reserving animal. Returning to menu.");
                			}
                			return;
                		}
                		else {
                			System.out.println("No dog in that country. Returning to main menu."); // enters country with no dog in service
                			return; 
                		}
                	}
                }
            else {
            	System.out.println("Invalid entry. Returning to main menu.");
            	return;
            }
        }	


        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals() {
            
        	// printing all dogs and their status
        	if ("4".equals(userInput)) {
        		for (Dog obj: dogList) {
        			System.out.println(obj);
        		}
        		System.out.println("Returning to main menu.");
        	}
        	
        	// printing all monkeys and their status
        	else if ("5".equals(userInput)) {
        		for (Monkey obj: monkeyList) {
        			System.out.println(obj);
        		}
        		System.out.println("Returning to main menu.");
        	}
        	
        	// printing all animals that are available and fully trained
        	else if ("6".equals(userInput)) {
        		for (int i = 0; i < dogList.size(); ++i) {
        			if ((dogList.get(i).getReserved() == false) && dogList.get(i).getTrainingStatus().equals("in service")) {
        				System.out.println(dogList.get(i));
        				System.out.println("");
        				}
        		}
        		for (int i = 0; i < monkeyList.size(); ++i) {
        			if ((monkeyList.get(i).getReserved() == false) && monkeyList.get(i).getTrainingStatus().equals("in service")) {
        				System.out.println(monkeyList.get(i));
        				System.out.println("");
        			}
        			System.out.println("");
        		return;
        		}
        	}
        }
}


