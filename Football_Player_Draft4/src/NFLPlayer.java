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

/**
 * @author krogers122
 *
 */
public class NFLPlayer {

		protected String name;
		private String position;
		private int rankingScore;
		
		private int passing;
		private int rushing;
		private int receiving;
		private int kicking;
		private int fieldGoals;
		private int kickReturns;
		private int punting;
		private int sacks;
		private int scoring;
		private int touchdowns;
		private int tackles;
		private int interceptions;
		private int totalYards;
		
		private long quarterback;
		private long runningBack;
		private long wideReceiver;
		private long tightEnd;
		private long defensiveLineman;
		private long linebacker;
		private long kickoffKicker;
		private long kickReturner;
		private long punter;
		private long puntReturner;
		private long fieldGoalKicker;
		
		private boolean playersDrafted = false;
		private byte age;
		private byte jerseyNumber;
		private char favoritePlayer;
		private double weight;
		private float height;

protected static int playerRanking = 0;
protected static long playerPosition = 0;

static Scanner userInput = new Scanner(System.in);

public NFLPlayer(String name, String position, byte jerseyNumber, int rankingScore) {
	playerRanking++;
	
	System.out.println("Enter the name: \n");
	
	if (userInput.hasNextLine()){
		
		this.setName(userInput.nextLine());
			
	}
	//this.setFavoritePlayer();
	//this.setjerseyNumber();
	}
		
	


public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public int getPassing() {
	return passing;
}




public void setPassing(int passing) {
	this.passing = passing;
}




public int getRushing() {
	return rushing;
}




public void setRushing(int rushing) {
	this.rushing = rushing;
}




public int getReceiving() {
	return receiving;
}




public void setReceiving(int receiving) {
	this.receiving = receiving;
}




public int getKicking() {
	return kicking;
}




public void setKicking(int kicking) {
	this.kicking = kicking;
}




public int getFieldGoals() {
	return fieldGoals;
}




public void setFieldGoals(int fieldGoals) {
	this.fieldGoals = fieldGoals;
}




public int getKickReturns() {
	return kickReturns;
}




public void setKickReturns(int kickReturns) {
	this.kickReturns = kickReturns;
}




public int getPunting() {
	return punting;
}




public void setPunting(int punting) {
	this.punting = punting;
}




public int getSacks() {
	return sacks;
}




public void setSacks(int sacks) {
	this.sacks = sacks;
}




public int getScoring() {
	return scoring;
}




public void setScoring(int scoring) {
	this.scoring = scoring;
}




public int getTouchdowns() {
	return touchdowns;
}




public void setTouchdowns(int touchdowns) {
	this.touchdowns = touchdowns;
}




public int getTackles() {
	return tackles;
}




public void setTackles(int tackles) {
	this.tackles = tackles;
}




public int getInterceptions() {
	return interceptions;
}




public void setInterceptions(int interceptions) {
	this.interceptions = interceptions;
}




public int getTotalYards() {
	return totalYards;
}




public void setTotalYards(int totalYards) {
	this.totalYards = totalYards;
}




public long getQuarterback() {
	return quarterback;
}




public void setQuarterback(long quarterback) {
	this.quarterback = quarterback;
}




public long getRunningBack() {
	return runningBack;
}




public void setRunningBack(long runningBack) {
	this.runningBack = runningBack;
}




public long getWideReceiver() {
	return wideReceiver;
}




public void setWideReceiver(long wideReceiver) {
	this.wideReceiver = wideReceiver;
}




public long getTightEnd() {
	return tightEnd;
}




public void setTightEnd(long tightEnd) {
	this.tightEnd = tightEnd;
}




public long getDefensiveLineman() {
	return defensiveLineman;
}




public void setDefensiveLineman(long defensiveLineman) {
	this.defensiveLineman = defensiveLineman;
}




public long getLinebacker() {
	return linebacker;
}




public void setLinebacker(long linebacker) {
	this.linebacker = linebacker;
}




public long getKickoffKicker() {
	return kickoffKicker;
}




public void setKickoffKicker(long kickoffKicker) {
	this.kickoffKicker = kickoffKicker;
}




public long getKickReturner() {
	return kickReturner;
}




public void setKickReturner(long kickReturner) {
	this.kickReturner = kickReturner;
}




public long getPunter() {
	return punter;
}




public void setPunter(long punter) {
	this.punter = punter;
}




public long getPuntReturner() {
	return puntReturner;
}




public void setPuntReturner(long puntReturner) {
	this.puntReturner = puntReturner;
}




public long getFieldGoalKicker() {
	return fieldGoalKicker;
}




public void setFieldGoalKicker(long fieldGoalKicker) {
	this.fieldGoalKicker = fieldGoalKicker;
}




public boolean isPlayersDrafted() {
	return playersDrafted;
}




public void setPlayersDrafted(boolean playersDrafted) {
	this.playersDrafted = playersDrafted;
}




public byte getAge() {
	return age;
}




public void setAge(byte age) {
	this.age = age;
}




public byte getJerseyNumber() {
	return jerseyNumber;
}




public void setJerseyNumber(byte jerseyNumber) {
	this.jerseyNumber = jerseyNumber;
}




public char getFavoritePlayer() {
	return favoritePlayer;
}




public void setFavoritePlayer(char favoritePlayer) {
	this.favoritePlayer = favoritePlayer;
}




public double getWeight() {
	return weight;
}




public void setWeight(double weight) {
	this.weight = weight;
}




public float getHeight() {
	return height;
}




public void setHeight(float height) {
	this.height = height;
}




public static void main(String[] args) {
	System.out.println("NFL Players list");
	playerList Saints = new playerList ("Saints player list");
	
	Saints.addname("Drew Brees");
	Saints.addname("Kirk Cousins");
	Saints.addname("Matt Ryan");	
	 
	//playerList playerObject = new playerList();
	//playerObject.playerList();
	
	}
}
