/*
Football Draft Picker
Kevin Rogers
CST-100
November 20, 2016
Dr. Mark Lively

Create the NFLPlayer class and add its properties.
Include player statistics found on the NFL website.
Use the variable types learned so far to create the player properties.
*/

public class playerClass extends NFLPlayer{

	public playerClass(){
				
	}
	
	public static void playerClass() {
	System.out.println("Players list will appear hear");
	NFLPlayer drewBrees = new playerClass();
	NFLPlayer kirkCousins = new playerClass();
	
	NFLPlayer [] playerList = new NFLPlayer [20];
	
	playerList[0] = drewBrees;
	playerList[1] = kirkCousins;
	
	System.out.println("Your favorite player is " + playerList[0]);
	
	
	
	}	

}
