package awareness;

import java.util.ArrayList;
import java.util.Scanner;

public class FunProblems {

	private int waterPoured;
	private ArrayList<String> dayOfWeek;
	private int waterLeft;
	private boolean correct;

	public FunProblems(int waterPoured, int waterLeft) {

		this.waterPoured = waterPoured;
		this.waterLeft = waterLeft;
		correct = false;
		dayOfWeek = new ArrayList<String>();

		dayOfWeek.add("Monday");
		dayOfWeek.add("Tuesday");
		dayOfWeek.add("Wednesday");
		dayOfWeek.add("Thursday");
		dayOfWeek.add("Friday");
		dayOfWeek.add("Saturday");
		dayOfWeek.add("Sunday");

	}

	public void problem() {
		System.out.println("Problem #1: Uh Oh! There is a wildfire burning nearby."
				+ " You have one week to put out the wildfire.\n"
				+ "            You have 100,000 gallons of water. You use 100 gallons per day for"
				+ "daily tasks, such as \n            showering, drinking, cooking. You need to have"
				+ " at least 10,000 gallons of water at the \n            end of the week or else there"
				+ " will be a drought. Also, you need to put equal amounts of \n            "
				+ "water into the fire each day and put out the fire within a week. How many gallons of water \n            "
				+ "do you put into the fire each day so that we don't get a drought?"
				+ "(Assume that the \n            fire starts burning on Sunday) Provide your answer as a whole number.");

	}

	public void playGame() {
		// if not a number then do something

		for (int i = 0; i < dayOfWeek.size(); i++) {
			waterLeft = waterLeft - (waterPoured + 100);
			System.out.println("On " + dayOfWeek.get(i) + ", you have " + waterLeft + " gallons of water remaining");
			
			if (waterLeft < 10000) {
				System.out.println("Uh Oh! There is a drought now. Try using less water to put out the fire.");
				break;
			}

		}
		if (waterLeft > 10001) {
			System.out.println("You can put more water into the fire each day. Try again :)");
		}
		if(waterLeft == 10001) {
			correct = true;
			System.out.println("\nGood Job! You got the correct answer. \nLesson: If we reduced the amount of water we use each day, then we"
					+ " would be able \nto conserve and have more water to put out the wildfires. Reducing the amount of water"
					+ " we use can also \nhelp us prevent a drought. You can start conserving water by simply taking shorter"
					+ " showers.");
		}
		
		// hint: 100000 = 10000 + 100(7) + x(7)
		//answer: 12757
		
		waterLeft = 100000;//reset game just in case if player wants to try again
	}
	
	public void setWaterPoured(int waterPoured)
	{
		this.waterPoured = waterPoured;
	}
	
	public boolean getCorrect()
	{
		return correct;
	}
}

