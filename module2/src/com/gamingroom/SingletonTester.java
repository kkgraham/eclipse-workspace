// Krystal-Anne Graham
// CS230
// January 21, 2024

package com.gamingroom;

// class to test singleton behavior
public class SingletonTester {

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
		
		// obtain local reference to the singleton instance
		GameService service = GameService.getService();
		
		// a simple for loop to print the games
		for (int i = 0; i < service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}

	}
	
}
