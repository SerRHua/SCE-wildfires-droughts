package awareness;

import java.util.Scanner;

public class Scanning {
	private String region;
	private String help;
	Wildfires wildFire;
	Droughts drought;
	private Scanner s;

	public Scanning() {
		region = "";
		help = "";
		wildFire = new Wildfires(1);
		drought = new Droughts(1);

		s = new Scanner(System.in);
	}

	public void randomFact() {
		System.out.println("\nDid you know?");
		int rand = (int) (Math.random() + 0.5);
		if (wildFire.getRand() > 5 && drought.getRand() > 5) {
			System.out.println("No more facts to give at the moment");
		} else if (wildFire.getRand() > 5) {
			System.out.println(drought.information() + "\n");
			drought.nextRand();
		} else if (drought.getRand() > 5) {
			System.out.println(wildFire.information() + "\n");
			wildFire.nextRand();
		} else if (rand == 0) {
			System.out.println(wildFire.information() + "\n");
			wildFire.nextRand();
		} else {
			System.out.println(drought.information() + "\n");
			drought.nextRand();
		}
	}

	public void repeatFact() {
		System.out.println("Would you like another fact? \nPlease enter 'Yes' or 'No'");
		setHelp(s.nextLine());
		while (!help.toLowerCase().equals("yes") && !help.toLowerCase().equals("no")) {
			System.out.println("Please enter 'Yes' or 'No");
			setHelp(s.nextLine());
		}

		while (help.toLowerCase().equals("yes")) {
			randomFact();
			System.out.println("Would you like another fact? \nPlease enter 'Yes' or 'No'");
			setHelp(s.nextLine());
			while (!help.toLowerCase().equals("yes") && !help.toLowerCase().equals("no")) {
				System.out.println("Please enter 'Yes' or 'No");
				setHelp(s.nextLine());
			}
		}
	}

	public void askRegion() {
		System.out.println("\nEnter a region in California from the following: Northern, Bay Area, Central, Southern");

		setRegion(s.nextLine().toLowerCase());
		while (!region.equals("northern") && !region.equals("bay area") && !region.equals("central")
				&& !region.equals("southern")) {
			System.out.println("Please enter a region from the following: Northern, Bay Area, Central, Southern");
			setRegion(s.nextLine().toLowerCase());
		}
	}
	
	public void learnDroughtAndWildFire()
	{
		System.out.println("\nDo you want to learn about drought levels and wildfires in that region?");
		System.out.println("    Please enter 'Yes' or 'No'");
		setHelp(s.nextLine());
		while (!help.toLowerCase().equals("yes") && !help.toLowerCase().equals("no")) {
			System.out.println("Please enter 'Yes' or 'No'");
			setHelp(s.nextLine());
		}
		if (help.toLowerCase().equals("yes")) {
			System.out.println("\nYou will be provided with facts regarding the drought levels and wildfires in that region.");
			System.out.println("\nWildfire facts:");
			System.out.println(wildFire.regionFacts(region));
			System.out.println("\nDrought facts:");
			System.out.println(drought.regionFacts(region));
		} else if (help.toLowerCase().equals("no")) {
			System.out.println(
					"Drought levels and wildfires greatly impact our environment and society. Are you sure you don't want to learn more?");
			setHelp(s.nextLine().toLowerCase());
			while (!help.equals("yes") && !help.equals("no")) {
				System.out.println("Please enter 'Yes' or 'No'");
				setHelp(s.nextLine().toLowerCase());
			}
			if (help.toLowerCase().equals("yes")) {
				System.out.println("That's okay, maybe next time.");
			} else {
				System.out.println("You will be provided with facts regarding drought levels and wildfires");
				System.out.println("Wildfire facts:");
				System.out.println(wildFire.regionFacts(region));
				System.out.println("\nDrought facts:");
				System.out.println(drought.regionFacts(region));
			}
		}
	}
	
	public void helpDroughts()
	{
		System.out.println("\nWould you like to know how to get involved with helping with drought levels?");
		setHelp(s.nextLine().toLowerCase());
		while (!help.equals("yes") && !help.equals("no")) {
			System.out.println("Please enter 'yes' or 'no");
			setHelp(s.nextLine().toLowerCase());
		}
		if (help.equals("yes")) {
			System.out.println(drought.howToHelp());
		} else {
			System.out.println("That's okay!");
		}
	}
	
	public void helpWildFire()
	{
		System.out.println("\nWould you like to know how to help wildfire victims?");
		setHelp(s.nextLine().toLowerCase());
		while (!help.equals("yes") && !help.equals("no")) {
			System.out.println("Please enter 'yes' or 'no");
			setHelp(s.nextLine().toLowerCase());
		}
		if (help.equals("yes")) {
			System.out.println(wildFire.howToHelp());
		} else {
			System.out.println("That's okay!");
		}
	}

	public void setHelp(String str) {
		help = str;
	}

	public void setRegion(String str) {
		region = str;
	}
	
	public void close()
	{
		s.close();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to talk about wildfires and droughts?");
		String str = scan.nextLine().toLowerCase();
		while (!str.equals("yes") && !str.equals("no"))
		{
			System.out.println("Please enter 'yes' or 'no'");
			str = scan.nextLine().toLowerCase();
		}

		if (str.equals("yes"))
		{
			Scanning scanner = new Scanning();

			scanner.randomFact();
			scanner.repeatFact();
			scanner.askRegion();
			scanner.learnDroughtAndWildFire();
			scanner.helpDroughts();
			scanner.helpWildFire();
		}
		
		System.out.println("\nWould you like to play a game about droughts and wildfires?");
		str = scan.nextLine().toLowerCase();
		while (!str.equals("yes") && !str.equals("no"))
		{
			System.out.println("Please enter 'yes' or 'no'");
			str = scan.nextLine().toLowerCase();
		}
		if (str.equals("yes"))
		{
			FunProblems problem = new FunProblems(0, 100000);
			problem.problem();
			int waterPoured = 1000001;
			System.out.println("Please input an integer (for amount of water poured each day) that is less than 100,000");
			while (!scan.hasNextInt() && waterPoured > 100000)
			{
				if (scan.hasNextInt())
				{
					waterPoured = scan.nextInt();
				}
				else
				{
					str = scan.nextLine();
				}
				System.out.println("Please input an integer that is less than 100,000");
				
			}
			waterPoured = scan.nextInt();
			problem.setWaterPoured(waterPoured);
			problem.playGame();
			while (!problem.getCorrect())
			{
				System.out.println("\nWould you like to try again?");
				str = scan.nextLine().toLowerCase();
				while (!str.equals("yes") && !str.equals("no"))
				{
					System.out.println("Please enter 'yes' or 'no'");
					str = scan.nextLine().toLowerCase();
				}
				if (str.equals("yes"))
				{
					waterPoured = 100001;
					problem.problem();
					System.out.println("Please input an integer (for amount of water poured each day) that is less than 100,000");
					while (!scan.hasNextInt() && waterPoured > 100000)
					{
						if (scan.hasNextInt())
						{
							waterPoured = scan.nextInt();
						}
						else
						{
							str = scan.nextLine();
						}
						System.out.println("Please input an integer that is less than 100,000");
						
					}
					waterPoured = scan.nextInt();
					problem.setWaterPoured(waterPoured);
					problem.playGame();
				}
				else
				{
					break;
				}
			}
		}

	}
}
