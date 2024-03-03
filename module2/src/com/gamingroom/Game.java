// Krystal-Anne Graham
// CS230
// January 21, 2024

package com.gamingroom;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Game extends Entity {
	long id;
	String name;
	private static List<Team> teams = new ArrayList<Team>();
	

	// constructor with id and name
	public Game(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Team addTeam(String name) {
		
		Team team = new Team(id, name);
		Iterator<Team> teamsIterator = teams.iterator();

		// if found, simply return the existing instance
		while (teamsIterator.hasNext()) {
			Team test = teamsIterator.next(); {
			
				if (test.getName() != null) {
					team = test;
				}
				
				else {
					teams.add(test);
				}
			}
		}
			// return the new/existing team object to the caller
			return team;
		}

	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}
}
