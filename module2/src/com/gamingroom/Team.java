// Krystal-Anne Graham
// CS230
// January 21, 2024

package com.gamingroom;
import java.util.ArrayList;
import java.util.Iterator;


public class Team extends Entity {
	long id;
	String name;
	ArrayList<Player> players = new ArrayList<Player>();
	
	// constructor
	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Player addPlayer(String name) {
		
		Player player = new Player(id, name);
		
		Iterator<Player> playersIterator = players.iterator();

		// if found, simply return the existing instance
		while (playersIterator.hasNext()) {
			Player test = playersIterator.next(); {
			
				if (test.getName() == this.name) {
					player = test;
				}
				
				else {
					players.add(player);
				}
			}
			
		}
			// return the new/existing player object to the caller
			return player;
		}
	
	@Override
	public String toString() {
		return "Team [id=" + GameService.getNextTeamID() + ", name=" + name + "]";
	}
}
