// Krystal-Anne Graham
// CS230
// January 21, 2024

package com.gamingroom;

// application start
public class ProgramDriver {
	
	// Main Method
	public static void main(String[] args) {
		
		
		// Obtain reference to the singleton instance
		GameService service = GameService.getService();
		
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);
	
		Team team1 = game1.addTeam("Team 1");
		System.out.println(team1);
		Team team2 = game1.addTeam("Team 2");
		System.out.println(team2);
		
		Player player1 = team1.addPlayer("Player 1");
		System.out.println(player1);
		Player player2 = team1.addPlayer("Player 2");
		System.out.println(player2);
		
		// Uses SingletonTester class to check for only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
		
	}
}
