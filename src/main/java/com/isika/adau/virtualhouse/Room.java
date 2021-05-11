package com.isika.adau.virtualhouse;

public class Room {
	int squareMeter;
	String roomName;
	
	public Room(int squareMeter, String roomName) {
		if (squareMeter <= 0) {
			throw new IllegalArgumentException("squareMeter should be positive");
		}
		
		this.squareMeter = squareMeter;
		this.roomName = roomName;
	}
	
	public String getDescription() {
		return "This " + this.roomName + " is " + this.squareMeter + " square meters.";
	}
	
	public int getArea() {
		return this.squareMeter;
	}
	
	public int getAreaFromDatabase() {
		// Connection to a remote database
		
		// Check if element exist
		
		// Get the element
		
		// Return the needed column
		
		return 1;
	}

}
