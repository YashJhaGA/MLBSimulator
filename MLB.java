package MLBSimulator;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


import java.io.FileNotFoundException;
import java.io.IOException;
//Project by Yash Jha- 5th Period- APCS
//IMPORTANT INSTRUCTIONS & INFORMATION
//I made this program in Eclipse and it requires a Wins.dat file. I placed the file(Wins.dat) in the PROJECT FILE, NOT (SRC) or PACKAGE FOLDERS!
//This program simulates a randomized MLB Season and Post-Season
// What should be printed when "Run" is clicked, is first, a graphic with text showing the Winner of the World Series. 
// After this, if you go to the Compiler, It will show you(from top to bottom) the Regular Season Standings of all 30 teams with their Wins,Losses, and Win%.
// And then after that, all the Playoff Series are shown eventually leading to the World Series where one team is crowned the winner.


public class MLB extends JPanel{
	public static void main(String [] args) throws IOException {
		String filename = "Wins.dat"; // File which includes values ranging from 40 to 116 for the Wins of the team
		int row = 77;
		int [] randomWinArray = new int[77]; // Array to hold all the Wins
		Scanner reader = new Scanner(new File(filename)); // Reads the File 
		for(int i=0;i<row;i++) {
			randomWinArray[i] = reader.nextInt(); // Assigns each number to a position in the Array
		}
		double winPercentage = 0.0; // Win Percentage(A Statistic in which Wins are divided by Total Games(162))
	
		System.out.println("REGULAR SEASON STANDINGS-(WIN-LOSS) -->(Win Percentage)"); // Header of Data
	
		// American League EAST Regular Season Calculations
		String [] ALEAST = {"Toronto Blue Jays", "New York Yankees", "Boston Red Sox" , "Baltimore Orioles", "Tampa Bay Rays"}; // Team Names
		int ALElength = ALEAST.length; 
		for(int i = 0; i<ALElength; i++) { // Loop to Randomize the Order(In the end, 1st Position will be first, 5th Position is last)
			int r =(int)(Math.random() * (ALElength-1));
			String temp = ALEAST[r];
			ALEAST[r] = ALEAST[i];
			ALEAST[i] = temp;
		}
		int [] ALEastWins = {randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)]}; // Array with Randomized Number of Wins from the File of Wins.dat	
		   for (int i = 0; i < ALEastWins.length; i++) { // Loop to arrange the Wins in descending order. It links up with the String of Teams in Randomized Order
		        for (int j = 0; j < ALEastWins.length; j++) {
		            if (ALEastWins[i] >= ALEastWins[j]) {
		                int x = ALEastWins[i];
		                ALEastWins[i] = ALEastWins[j];
		                ALEastWins[j] = x;
		            }
		        }
		    }
	
		
		System.out.println("American League East Standings");
		System.out.println("------------------------------------");
		for(int i = 0; i<5; i++) { // Loop to print out the standings in the form[Team Name: Wins-Losses-->(Win Percentage)
			winPercentage = (double)ALEastWins[i]/162;
			System.out.printf(ALEAST[i] + ": "+ALEastWins[i]+"-"+(162-ALEastWins[i])+" -->(" +"%.3f)",winPercentage);
			System.out.println();
			
			
		}
		
		// American League CENTRAL 
		System.out.println();
		String [] ALCentral = {"Minnesota Twins", "Cleveland Indians", "Chicago White Sox" , "Detroit Tigers", "Kansas City Royals"};
		int ALClength = ALCentral.length;
		for(int i = 0; i<ALClength; i++) {
			int r =(int)(Math.random() * (ALClength-1));
			String temp = ALCentral[r];
			ALCentral[r] = ALCentral[i];
			ALCentral[i] = temp;
		}
		int [] ALCentralWins = {randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)]};
		   for (int i = 0; i < ALCentralWins.length; i++) {
		        for (int j = 0; j < ALCentralWins.length; j++) {
		            if (ALCentralWins[i] >= ALCentralWins[j]) {
		                int x = ALCentralWins[i];
		                ALCentralWins[i] = ALCentralWins[j];
		                ALCentralWins[j] = x;
		            }
		        }
		    }
	
		
		System.out.println("American League Central Standings");
		System.out.println("------------------------------------");
		for(int i = 0; i<5; i++) {
			winPercentage = (double)ALCentralWins[i]/162;
			System.out.printf(ALCentral[i] + ": "+ALCentralWins[i]+"-"+(162-ALCentralWins[i])+" -->(" +"%.3f)",winPercentage);
			System.out.println();
		}
		
		// American League WEST
		System.out.println();
		String [] ALWest = {"Houston Astros", "Seattle Mariners", "Texas Rangers" , "Los Angeles Angels", "Oakland Athletics"};
		int ALWlength = ALWest.length;
		for(int i = 0; i<ALWlength; i++) {
			int r =(int)(Math.random() * (ALWlength-1));
			String temp = ALWest[r];
			ALWest[r] = ALWest[i];
			ALWest[i] = temp;
		}
		int [] ALWestWins = {randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)]};
		   for (int i = 0; i < ALWestWins.length; i++) {
		        for (int j = 0; j < ALWestWins.length; j++) {
		            if (ALWestWins[i] >= ALWestWins[j]) {
		                int x = ALWestWins[i];
		                ALWestWins[i] = ALWestWins[j];
		                ALWestWins[j] = x;
		            }
		        }
		    }
	
		
		System.out.println("American League West Standings");
		System.out.println("------------------------------------");
		for(int i = 0; i<5; i++) {
			winPercentage = (double)ALWestWins[i]/162;
			System.out.printf(ALWest[i] + ": "+ALWestWins[i]+"-"+(162-ALWestWins[i])+" -->(" +"%.3f)",winPercentage);
			System.out.println();
			
		}
		
		// National League EAST 
				String [] NLEast = {"Philadelphia Phillies", "New York Mets", "Atlanta Braves" , "Washington Nationals", "Miami Marlins"};
				int NLElength = NLEast.length;
				for(int i = 0; i<NLElength; i++) {
					int r =(int)(Math.random() * (NLElength-1));
					String temp = NLEast[r];
					NLEast[r] = NLEast[i];
					NLEast[i] = temp;
				}
				int [] NLEastWins = {randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)]};
				   for (int i = 0; i < NLEastWins.length; i++) {
				        for (int j = 0; j < NLEastWins.length; j++) {
				            if (NLEastWins[i] >= NLEastWins[j]) {
				                int x = NLEastWins[i];
				                NLEastWins[i] = NLEastWins[j];
				                NLEastWins[j] = x;
				            }
				        }
				    }
			
				
				System.out.println("\nNational League East Standings");
				System.out.println("------------------------------------");
				for(int i = 0; i<5; i++) {
					winPercentage = (double)NLEastWins[i]/162;
					System.out.printf(NLEast[i] + ": "+NLEastWins[i]+"-"+(162-NLEastWins[i])+" -->(" +"%.3f)",winPercentage);
					System.out.println();
					
					
				}
				
				// National League CENTRNL 
				System.out.println();
				String [] NLCentral = {"Milwaukee Brewers", "Cincinnati Reds", "Chicago Cubs" , "Pittsburgh Pirates", "St.Louis Cardinals"};
				int NLClength = NLCentral.length;
				for(int i = 0; i<NLClength; i++) {
					int r =(int)(Math.random() * (NLClength-1));
					String temp = NLCentral[r];
					NLCentral[r] = NLCentral[i];
					NLCentral[i] = temp;
				}
				int [] NLCentralWins = {randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)]};
				   for (int i = 0; i < NLCentralWins.length; i++) {
				        for (int j = 0; j < NLCentralWins.length; j++) {
				            if (NLCentralWins[i] >= NLCentralWins[j]) {
				                int x = NLCentralWins[i];
				                NLCentralWins[i] = NLCentralWins[j];
				                NLCentralWins[j] = x;
				            }
				        }
				    }
			
				
				System.out.println("National League Central Standings");
				System.out.println("------------------------------------");
				for(int i = 0; i<5; i++) {
					winPercentage = (double)NLCentralWins[i]/162;
					System.out.printf(NLCentral[i] + ": "+NLCentralWins[i]+"-"+(162-NLCentralWins[i])+" -->(" +"%.3f)",winPercentage);
					System.out.println();
				}
				
				// National League WEST
				System.out.println();
				String [] NLWest = {"San Francisco Giants", "Colorado Rockies", "San Diego Padres" , "Los Angeles Dodgers", "Arizona Diamondbacks"};
				int NLWlength = NLWest.length;
				for(int i = 0; i<NLWlength; i++) {
					int r =(int)(Math.random() * (NLWlength-1));
					String temp = NLWest[r];
					NLWest[r] = NLWest[i];
					NLWest[i] = temp;
				}
				int [] NLWestWins = {randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)],randomWinArray[(int)(Math.random()*60)]};
				   for (int i = 0; i < NLWestWins.length; i++) {
				        for (int j = 0; j < NLWestWins.length; j++) {
				            if (NLWestWins[i] >= NLWestWins[j]) {
				                int x = NLWestWins[i];
				                NLWestWins[i] = NLWestWins[j];
				                NLWestWins[j] = x;
				            }
				        }
				    }
			
				
				System.out.println("National League West Standings");
				System.out.println("------------------------------------");
				for(int i = 0; i<5; i++) {
					winPercentage = (double)NLWestWins[i]/162;
					System.out.printf(NLWest[i] + ": "+NLWestWins[i]+"-"+(162-NLWestWins[i])+" -->(" +"%.3f)",winPercentage);
					System.out.println();
					
				}
				
				int d = 0;
				String NL1= "";
				String NL2= "";
				String NL3= "";
				
				if(NLEastWins[d] >= NLWestWins[d] && NLEastWins[d] >= NLCentralWins[d] && NLWestWins[d] >= NLCentralWins[d]) {
					NL1 = NLEast[d];
					NL2 = NLWest[d];
					NL3 = NLCentral[d];
				}
				else if(NLEastWins[d] >= NLWestWins[d] && NLEastWins[d] >= NLCentralWins[d] && NLCentralWins[d] >= NLWestWins[d]) {
					NL1 = NLEast[d];
					NL2 = NLCentral[d];
					NL3 = NLWest[d];
				}
				else if(NLCentralWins[d] >= NLWestWins[d] && NLCentralWins[d] >= NLEastWins[d] && NLEastWins[d] >= NLWestWins[d]) {
					NL1 = NLCentral[d];
					NL2 = NLEast[d];
					NL3 = NLWest[d];
				}
				else if(NLCentralWins[d] >= NLWestWins[d] && NLCentralWins[d] >= NLEastWins[d] && NLWestWins[d] >= NLEastWins[d]) {
					NL1 = NLCentral[d];
					NL2 = NLWest[d];
					NL3 = NLEast[d];
				}
				else if(NLWestWins[d] >= NLCentralWins[d] && NLWestWins[d] >= NLEastWins[d] && NLEastWins[d] > NLCentralWins[d]) { 
					NL1 = NLWest[d];
					NL2 = NLEast[d];
					NL3 = NLCentral[d];
				}
				else {
					NL1 = NLWest[d];
					NL2 = NLCentral[d];
					NL3 = NLEast[d];
				}
				
			//	System.out.println("\n#1 Seed: "+NL1 +"\n#2 Seed: "+NL2 + "\n#3 Seed: "+NL3);
				
				String NLWild1 = "";
				String NLWild2 = "";
				int e = 1;
				int f = 2;
				if(NLEastWins[e] >= NLWestWins[e] && NLEastWins[e] >= NLCentralWins[e] && NLEastWins[f] >= NLCentralWins[e] && NLEastWins[f] >= NLWestWins[e]) { // If National League East 2nd & 3rd Place are ranked 4th and 5th in the entirety of the National League
					NLWild1 = NLEast[e];
					NLWild2 = NLEast[f];
				}
				else if(NLEastWins[e] >= NLWestWins[e] && NLEastWins[e] >= NLCentralWins[e] && NLCentralWins[e] >= NLEastWins[f] && NLCentralWins[e] >= NLWestWins[e]) {
					NLWild1 = NLEast[e];
					NLWild2 = NLCentral[e];
				}
				else if(NLEastWins[e] >= NLWestWins[e] && NLEastWins[e] >= NLCentralWins[e] && NLWestWins[e] >= NLEastWins[f] && NLWestWins[e] >= NLCentralWins[e]) {
					NLWild1 = NLEast[e];
					NLWild2 = NLWest[e];
				}
				else if(NLCentralWins[e] >= NLEastWins[e] && NLCentralWins[e] >= NLWestWins[e] && NLCentralWins[f] >= NLEastWins[e] && NLCentralWins[f] >= NLWestWins[e]) {
					NLWild1 = NLCentral[e];
					NLWild2 = NLCentral[f];
				}
				else if(NLCentralWins[e] >= NLEastWins[e] && NLCentralWins[e] >= NLWestWins[e] && NLEastWins[e] >= NLCentralWins[f] && NLEastWins[e] >= NLWestWins[e]) {
					NLWild1 = NLCentral[e];
					NLWild2 = NLEast[e];
				}
				else if(NLCentralWins[e] >= NLEastWins[e] && NLCentralWins[e] >= NLWestWins[e] && NLWestWins[e] >= NLCentralWins[f] && NLWestWins[e] >= NLEastWins[e]) {
					NLWild1 = NLCentral[e];
					NLWild2 = NLWest[e];
				}
				else if(NLWestWins[e] >= NLEastWins[e] && NLWestWins[e] >= NLCentralWins[e] && NLWestWins[f] >= NLEastWins[e] && NLWestWins[f] >= NLCentralWins[e]) {
					NLWild1 = NLWest[e];
					NLWild2 = NLWest[f];
				}
				else if(NLWestWins[e] >= NLEastWins[e] && NLWestWins[e] >= NLCentralWins[e] && NLEastWins[e] >= NLWestWins[f] && NLEastWins[e] >= NLCentralWins[e]) {
					NLWild1 = NLWest[e];
					NLWild2 = NLEast[e];
				}
				else {
					NLWild1 = NLWest[e];
					NLWild2 = NLCentral[e];
				}

				
		//Calculations to rank the best teams in each division from 1 to 3.
		int a = 0;
		String AL1= "";
		String AL2= "";
		String AL3= "";
		
		if(ALEastWins[a] >= ALWestWins[a] && ALEastWins[a] >= ALCentralWins[a] && ALWestWins[a] >= ALCentralWins[a]) { // East 1st, West 2nd, Central 3rd
			AL1 = ALEAST[a];
			AL2 = ALWest[a];
			AL3 = ALCentral[a];
		}
		else if(ALEastWins[a] >= ALWestWins[a] && ALEastWins[a] >= ALCentralWins[a] && ALCentralWins[a] >= ALWestWins[a]) { // East 1st, Central 2nd, West 3rd
			AL1 = ALEAST[a];
			AL2 = ALCentral[a];
			AL3 = ALWest[a];
		}
		else if(ALCentralWins[a] >= ALWestWins[a] && ALCentralWins[a] >= ALEastWins[a] && ALEastWins[a] >= ALWestWins[a]) { // Central 1st, East 2nd, West 3rd
			AL1 = ALCentral[a];
			AL2 = ALEAST[a];
			AL3 = ALWest[a];
		}
		else if(ALCentralWins[a] >= ALWestWins[a] && ALCentralWins[a] >= ALEastWins[a] && ALWestWins[a] >= ALEastWins[a]) { // Central 1st, West 2nd, East 3rd
			AL1 = ALCentral[a];
			AL2 = ALWest[a];
			AL3 = ALEAST[a];
		}
		else if(ALWestWins[a] >= ALCentralWins[a] && ALWestWins[a] >= ALEastWins[a] && ALEastWins[a] > ALCentralWins[a]) { // West 1st, East 2nd, Central 3rd
			AL1 = ALWest[a];
			AL2 = ALEAST[a];
			AL3 = ALCentral[a];
		}
		else { // West 1st, Central 2nd, East 3rd
			AL1 = ALWest[a];
			AL2 = ALCentral[a];
			AL3 = ALEAST[a];
		}
		

		// Calculations to find out WILD CARD TEAMS
		String ALWild1 = "";
		String ALWild2 = "";
		int b = 1;
		int c = 2;
		if(ALEastWins[b] >= ALWestWins[b] && ALEastWins[b] >= ALCentralWins[b] && ALEastWins[c] >= ALCentralWins[b] && ALEastWins[c] >= ALWestWins[b]) { // If Wild Card 1 & 2 are from East
			ALWild1 = ALEAST[b];
			ALWild2 = ALEAST[c];
		}
		else if(ALEastWins[b] >= ALWestWins[b] && ALEastWins[b] >= ALCentralWins[b] && ALCentralWins[b] >= ALEastWins[c] && ALCentralWins[b] >= ALWestWins[b]) { // If Wild Card 1 is East and Wild Card 2 is Central
			ALWild1 = ALEAST[b];
			ALWild2 = ALCentral[b];
		}
		else if(ALEastWins[b] >= ALWestWins[b] && ALEastWins[b] >= ALCentralWins[b] && ALWestWins[b] >= ALEastWins[c] && ALWestWins[b] >= ALCentralWins[b]) { // If Wild Card 1 is East and Wild Card 2 is West
			ALWild1 = ALEAST[b];
			ALWild2 = ALWest[b];
		}
		else if(ALCentralWins[b] >= ALEastWins[b] && ALCentralWins[b] >= ALWestWins[b] && ALCentralWins[c] >= ALEastWins[b] && ALCentralWins[c] >= ALWestWins[b]) { // If Wild Card 1 & 2 are from the Central
			ALWild1 = ALCentral[b];
			ALWild2 = ALCentral[c];
		}
		else if(ALCentralWins[b] >= ALEastWins[b] && ALCentralWins[b] >= ALWestWins[b] && ALEastWins[b] >= ALCentralWins[c] && ALEastWins[b] >= ALWestWins[b]) { // If Wild Card 1 is from Central and Wild Card 2 is East
			ALWild1 = ALCentral[b];
			ALWild2 = ALEAST[b];
		}
		else if(ALCentralWins[b] >= ALEastWins[b] && ALCentralWins[b] >= ALWestWins[b] && ALWestWins[b] >= ALCentralWins[c] && ALWestWins[b] >= ALEastWins[b]) { // If Wild Card 1 is from Central and Wild Card 2 is West
			ALWild1 = ALCentral[b];
			ALWild2 = ALWest[b];
		}
		else if(ALWestWins[b] >= ALEastWins[b] && ALWestWins[b] >= ALCentralWins[b] && ALWestWins[c] >= ALEastWins[b] && ALWestWins[c] >= ALCentralWins[b]) { // If Wild Card 1 & 2 are from West
			ALWild1 = ALWest[b];
			ALWild2 = ALWest[c];
		}
		else if(ALWestWins[b] >= ALEastWins[b] && ALWestWins[b] >= ALCentralWins[b] && ALEastWins[b] >= ALWestWins[c] && ALEastWins[b] >= ALCentralWins[b]) { // If Wild Card 1 is from West and Wild Card 2 is East
			ALWild1 = ALWest[b];
			ALWild2 = ALEAST[b];
		}
		else { // If Wild Card 1 is West and Wild Card 2 is Central
			ALWild1 = ALWest[b];
			ALWild2 = ALCentral[b];
		}

		System.out.println("-----------------------------------------------------------------------");
		
		
		// PLAYOFF CALCULATIONS
	
		System.out.println("\n\n [MLB Postseason] \n");
		System.out.print("[American League Wild Card Match]");
		double wildMatch = Math.random();
		int wildGames = 0;
		String ALWCWin = "";
		if(wildMatch <.5) {
			System.out.print( ALWild1+" (1-"+wildGames+") "+ ALWild2);
			ALWCWin = ALWild1;
		}
		else {
			System.out.print( ALWild2+" (1-"+wildGames +") "+ALWild1);
			ALWCWin = ALWild2;
		}
		System.out.println();
				System.out.print("[National League Wild Card Match]");
				double NLwildMatch = Math.random();
				int NLwildGames = 0;
				String NLWCWin = "";
				if(NLwildMatch <.5) {
					System.out.print( NLWild1+" (1-"+NLwildGames+") "+ NLWild2);
					NLWCWin = NLWild1;
				}
				else {
					System.out.print( NLWild2+" (1-"+NLwildGames +") "+NLWild1);
					NLWCWin = NLWild2;
				}
				System.out.println();
		System.out.println();
		double ALseed1WC = Math.random();
		int ALseed1WCGames = (int)(Math.random()*3);
		String ALseed1WCWin = "";
		System.out.print("[American League Division Series #1]");
		if(ALseed1WC <= .65 ) {
			System.out.print( AL1+"  (3-"+ALseed1WCGames +") "+ALWCWin);
			ALseed1WCWin = AL1;
		}
		else {
			System.out.print( ALWCWin+"  (3-"+ALseed1WCGames +") "+AL1);
			ALseed1WCWin = ALWCWin;
		}
		
		double ALdivS = Math.random();
		int ALdivSGames = (int)(Math.random()*3);
		String ALdivSWin = "";
		System.out.println();
		System.out.print("[American League Division Series #2]");
		if(ALdivS <=.55) {
			System.out.print( AL2+"  (3-"+ALdivSGames +") "+AL3);
			ALdivSWin= AL2;
		}
		else {
			System.out.print(AL3+"  (3-"+ALdivSGames +") "+AL2);
			ALdivSWin = AL3;
		}
System.out.println("");
				double NLseed1WC = Math.random();
				int NLseed1WCGames = (int)(Math.random()*3);
				String NLseed1WCWin = "";
				System.out.print("[National League Division Series #1]");
				if(NLseed1WC <= .65 ) {
					System.out.print( NL1+"  (3-"+NLseed1WCGames +") "+NLWCWin);
					NLseed1WCWin = NL1;
				}
				else {
					System.out.print( NLWCWin+"  (3-"+NLseed1WCGames +") "+NL1);
					NLseed1WCWin = NLWCWin;
				}
				
				double NLdivS = Math.random();
				int NLdivSGames = (int)(Math.random()*3);
				String NLdivSWin = "";
				System.out.println();
				System.out.print("[National League Division Series #2]");
				if(NLdivS <=.55) {
					System.out.print( NL2+"  (3-"+NLdivSGames +") "+NL3);
					NLdivSWin= NL2;
				}
				else {
					System.out.print(NL3+"  (3-"+NLdivSGames +") "+NL2);
					NLdivSWin = NL3;
				}
				
				System.out.println("\n");
		double ALCS = Math.random();
		int ALCSGames = (int)(Math.random()*4);
		String ALCSWin = "";
		System.out.print("[American League Championship Series]");
		if(ALCS <=.5) {
			System.out.print( ALseed1WCWin+"  (4-"+ALCSGames +") "+ALdivSWin);
			ALCSWin= ALseed1WCWin; 
		}
		else {
			System.out.print( ALdivSWin+" (4-"+ALCSGames +") "+ALseed1WCWin);
			ALCSWin= ALdivSWin;
		}
System.out.println("");
double NLCS = Math.random();
				int NLCSGames = (int)(Math.random()*4);
				String NLCSWin = "";
				System.out.print("[National League Championship Series]");
				if(NLCS <=.5) {
					System.out.print( NLseed1WCWin+"  (4-"+NLCSGames +") "+NLdivSWin);
					NLCSWin= NLseed1WCWin; 
				}
				else {
					System.out.print( NLdivSWin+" (4-"+NLCSGames +") "+NLseed1WCWin);
					NLCSWin= NLdivSWin;
				}
				System.out.println("\n\n");
				System.out.print("[WORLD SERIES]");
				double WorldSeries = Math.random();
				int wsGames = (int)(Math.random()*4);
				String WSWin = "";
				if(WorldSeries<=.5) {
					System.out.print( ALCSWin+" (4-"+wsGames +") "+NLCSWin);
					WSWin = ALCSWin;
				}
				else {
					System.out.print( NLCSWin+" (4-"+wsGames +") "+ALCSWin);
					WSWin = NLCSWin;
				}
				
					JFrame frame = new JFrame();
				    frame.getContentPane().add(new MLB());
				    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				    frame.setSize(1200,200);
				    frame.setBackground(Color.RED);
				    frame.setVisible(true);
				    Graphics g = frame.getGraphics(); // Graphics g
				    winner(g,WSWin); 
				    
	}
	
	public static void winner(Graphics g, String Winner) {
	    int fontSize = 50;
	    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
	    g.setColor(Color.BLACK);
	     
	    g.drawString(Winner+" win the WORLD SERIES!", 100, 100);
	}
}
				
