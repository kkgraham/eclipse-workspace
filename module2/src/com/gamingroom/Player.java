// Krystal-Anne Graham
// CS230
// January 21, 2024

package com.gamingroom;

import java.util.ArrayList;

/**
 * A simple class to hold information about a player
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a player is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Player extends Entity {
	long id;
	String name;
	ArrayList<Team> players;
	
	// constructor with identifier and name
	public Player(long id, String name) {
		this.id = id;
		this.name = name;
		players = new ArrayList<Team>();
	}

	// return the id
	public long getId() {
		return id;
	}

	// return the name
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Player [id=" + GameService.getNextPlayerID() + ", name=" + name + "]";
	}
}
