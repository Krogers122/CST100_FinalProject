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

public class playerList extends NFLPlayer{


	
	public playerList (String name) {
		this.name = name;
		}
			
		private static NFLPlayer drewBrees;
		private static NFLPlayer kirkCousins;
		
		public playerList(String name, String position, byte jerseyNumber, int rankingScore) {
		super(name, position, jerseyNumber, rankingScore);
		
	}
		
			
	public static void playerObject(){
	
		NFLPlayer [] playerList = new NFLPlayer [20];
		
		playerList[0] = drewBrees;
		playerList[1] = kirkCousins;
		
		System.out.println("Your favorite player is " + playerList[0]);
		
		System.out.println("Player object");
		/*	public NFLPlayer(String name, String position, byte jerseyNumber, int rankingScore) {
			//playerRanking++;
			this.name = name;
			this.position = position;
			this.jerseyNumber = jerseyNumber;
			this.rankingScore = rankingScore;
	*/	
		System.out.println("Players list will appear hear");
	
	
	
	
	
	
	}


	void addname(String string) {
		// TODO Auto-generated method stub
		
	}	

}