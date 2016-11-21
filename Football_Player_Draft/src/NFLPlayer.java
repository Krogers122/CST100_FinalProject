/*
Football Draft Picker
Kevin Rogers
CST-100
November 13, 2016
Dr. Mark Lively
The final week’s assignment will be how to pick the NFL player 
with the best stats or your favorite team and add players to 
your very own roster. This program will allow the user to add 
and subtract players from their roster. The goal will also be 
to allow the user to search for players and cross reference 
stats using a defined interface.  
Page 1 (Main Menu)
View Your Roster
 Go to Search for players
Go to view players stats
Go to pick players
Go to Remove players from your roster	Page 2 (Roster)
View Your Roster
(Insert Favorite Team Here)	Page 3 (search)
Search for Players
Page 4 (stats)
View Player Stats	Page 5 (pick)
Pick your Player	Page 6 (remove)
Remove players from roster
*/
import java.util.Scanner;

class NFLPlayer {

	public static void main(String[] args) {
		System.out.println("NFL Players list");
		playerClass playerObject = new playerClass();
		playerObject.playerList();
		
	}
}