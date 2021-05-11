package com.isika.adau.virtualhouse;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class VirutalHomeTests {
	private Home home;
	private Room room;
	
	@BeforeEach
	void instanciateHome( ) {
		Address address = new Address(100, "Rue du renard", 26354, "Jolieville");
		home = new Home(address);
	}
	
	@BeforeEach
	void instanciateRoom() {
		room = new Room(25, "kitchen");
	}

	
	@Test
	void testEmptyHomeCreation() {		
		// THEN
		Assertions.assertNotNull(home);		
	}
	
	@Test
	void testEmptyHomeGetDescription() {
		// GIVEN
		String expectedDescription = "This house is 0 square meters, located 100 Rue du renard 26354 Jolieville";
		
		// WHEN
		String realDescription = home.getDescription();
		
		// THEN
		Assertions.assertNotNull(home);
		Assertions.assertEquals(expectedDescription, realDescription);
	}
	
	@Test
	void testRoomCreation() {		
		// THEN
		Assertions.assertNotNull(room);
	}
	
	
	@Test
	void testRoomDescription() {
		// GIVEN
		String expectedDescription = "This kitchen is 25 square meters.";
		
		// WHEN
		String realDescription = room.getDescription();
		
		// THEN
		Assertions.assertEquals(expectedDescription, realDescription);
	}
	
	@Test
	void testAddSingleRoomToHome() {
		// GIVEN	
		int expectedNumberOfRoom = 1;
		int expectedArea = 25;
		
		// WHEN
		home.addRoom(room);
		
		
		// THEN
		Assertions.assertEquals(expectedNumberOfRoom, home.getNumberOfRooms());
		Assertions.assertEquals(expectedArea, home.getArea());
	}
	
	@Test
	void addMultipleRoomsToHome() {
		// GIVEN
		Room living = new Room(35, "living room");
		
		int expectedNumberOfRoom = 2;
		int expectedArea = 25 + 35;
		
		// WHEN
		home.addRoom(room);
		home.addRoom(living);
		
		
		// THEN
		Assertions.assertEquals(expectedNumberOfRoom, home.getNumberOfRooms());
		Assertions.assertEquals(expectedArea, home.getArea());
	}
	
	
	@Test
	void addMultipleRoomsWithNegativeAreaToHome() {
		// WHEN 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			@SuppressWarnings("unused")
			Room room = new Room(-25, "kitchen");
			});
	  }	

	
	@Test
	void add100RoomsToHome() {
		// GIVEN		
		int expectedNumberOfRoom = 100;
		int expectedArea = 0;

		
		// WHEN
		for (int i = 0; i < expectedNumberOfRoom; i++) {
			Room room = new Room(1, "kitchen");
			
			home.addRoom(room);
			expectedArea += 1;
			
		}
		
		// THEN
		Assertions.assertEquals(expectedNumberOfRoom, home.getNumberOfRooms());
		Assertions.assertEquals(expectedArea, home.getArea());
	}
}
