package com.isika.adau.virtualhouse;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Home {
	Address address;
	List<Room> rooms = new ArrayList<Room>();

	public Home (Address address) {
		this.address = address;

	}
	
	public void addRoom(Room room) {
		this.rooms.add(room);
	}
	
	public String getDescription() {
		String description =  "This house is " + this.getArea() + " square meters, ";
		description += "located " + this.address.getFormattedAddress();
		return description;
	}
	
	public int getArea() {
		int totalArea = 0;
		
		for (Room room: this.rooms) {
			totalArea += room.getArea();
		}
		return totalArea;
	}
	
	public int getNumberOfRooms( ) {
		return this.rooms.size();
	}

}
