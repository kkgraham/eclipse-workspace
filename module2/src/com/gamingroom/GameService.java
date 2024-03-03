// Krystal-Anne Graham
// CS230
// January 21, 2024

package com.gamingroom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// singleton game instance
public class GameService {

	// list of active games
	private static List<Game> games = new ArrayList<Game>();

	// holds the current gameID
	private static long nextGameId = 1;
	
	// holds the current playerID
	private static long nextPlayerId = 1;
	
	// holds the current teamId
	private static long nextTeamId = 1;

	// creates singleton instance
	// The purpose of a signleton classes to ensure there is only one instance
	// of the class. They have high control over the use of their class, 
	// ensuring classes that do not need access to the code don't while
	// making sure there are no unnecessary instances being made.
	private static GameService instance = null;

	// Construct a new game instance
	private GameService(){}
	
	// return the game instance (new or existing)
	public static GameService getService() {
		// checking to see if instance is new
		if (instance == null) {
			instance = new GameService();
			
			// notifying of game creation
			System.out.println("Game service created!");
		}
		
		// notifying game already exists
		else {
			System.out.println("Ooops! That game already exists.");
		}
		
		// returning game
		return instance;
	}
	 
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// if found, simply return the existing instance
		if(getGame(name) != null) {
			game = getGame(name);
		}
				
		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
			return game;
	}

	// returns game at specified index
	public Game getGame(int index) {
		return games.get(index);
	}
	
	// returns game instance with ID
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		Iterator<Game> gamesIterator = games.iterator();
		
		//
		while (gamesIterator.hasNext()) {
			
			// sets iterator
			Game gameService = gamesIterator.next();
			
			if (gameService.getId() == (id)) {
				return game;
			}
		}
		return game;
	}

	// returns game with specified name
	public Game getGame(String name) {

		
		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same id
		// Using an iterator design creates a block of code that can move
		// through the different parts of a list without exposing the code
		// to the underlying pieces of code. It is simply designed and usually
		// easy to read.
		for (int i = 0; i < getGameCount(); i++) {
			if (games.get(i).getName() == name) {
				game = games.get(i);
			}
		}
		// if found, simply assign that instance to the local variable
		return game;
	}

	// returns current number of games
	public static int getGameCount() {
		return games.size();
	}
	
	// returns next id for player
	public static long getNextPlayerID() {
		return nextPlayerId++;
	}
	
	// returns next id for team
	public static long getNextTeamID() {
		return nextTeamId++;
	}
}
