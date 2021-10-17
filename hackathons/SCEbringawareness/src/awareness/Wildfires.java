package awareness;

public class Wildfires {
	private int rand;

	public Wildfires(int rand) {
		this.rand = rand;
	}

	public String information() {
		if (rand == 1) {
			return "5 of California's top 20 biggest wildfires occurred in 2020.";
		} else if (rand == 2) {
			return "There's a 17% increase from 2019 to 2020 in number of U.S. wildfires.";
		} else if (rand == 3) {
			return "2020 wildfires cost California 4.2 million acres of land.";
		} else if (rand == 4) {
			return "The 'Camp Fire' wildfire has an estimated loss of $10 billion, roughly $10.38 billion in 2020 value.";
		} else if (rand == 5){
			return "California is the most at-risk state in the U.S. for wildfires.";
		}
		else
		{
			return "There are no more wild fire facts anymore";
		}
	}

	public String howToHelp() {
		return "1. Donate money to organizations. Charity Navigator can be an good way to start."
				+ "\nThe local Humane Society, American Red Cross, and the United Way are good organizations to donate to.\n"
				+ "2. Donate food and/or clothing to victims. \n"
				+ "3. Offer your home as a free, temporary place to live.\n"
				+ "4. Foster a pet. Some families are forced to leave their pets behind when they evacuate.";
	}

	public String regionFacts(String str) {
		str = str.toLowerCase();
		String strReturn = "";
		if (str.equals("northern")) {
			strReturn += "- In 2019, the Kincade fire that raged for 11 days in Sonoma Country burned "
					+ "approximately 77,758 \n acres and destroyed 374 buildings. "
					+ "That’s about the size of 77,758 football fields!\n\n"
					+ "- Smoke from wildfires in Northern CA have triggered hazy skies for a large part "
					+ "of California, \n including the Bay Area, and deteriorating air quality, which "
					+ "could be dangerous for our health \n (ABC 7)\n\n";
		} else if (str.equals("southern")) {
			strReturn += "- When there is a wildfire in Southern California, the entire Los Angeles area "
					+ "is at risk. The scary \n thing is that the ENTIRE Los Angeles metro area and the "
					+ "millions that live there could be in danger \n (CNN)\n\n"
					+ "- In 2018, there were four different fires burning in the Los Angeles area and burned "
					+ "more than \n 116,000 acres. That’s more than 100,000 football fields combined! (CNN)\n\n"
					+ "- The Thomas fire that burned nearly 40 days in north Los Angeles was raging at a "
					+ "shocking pace \n when it burned. At one point, it spread over 31,000 acres in about "
					+ "nine hours. That’s about ONE ACRE \n PER SECOND! (CNN)\n\n";
		} else if (str.equals("bay area")) {
			strReturn += "- The wildfire that devastated Big Basin Redwoods State Park in August 2020 "
					+ "burned about 86,509 acres. \n That’s nearly three times the size of the city San "
					+ "Francisco! The visitor centers were burned down \n and the park is still under "
					+ "construction as of October 2021 (Mercury News)\n\n" + "- In 2020, people in the Bay Area"
					+ " experienced days where the skies were orange and even red, like a scene \n straight out of"
					+ " mars. How crazy is that! The cause of these abnormal skies were the wildfires."
					+ " The smoke \n and ash from the wildfires were so thick that it blocked sunlight out (CNN)\n\n";
		} else if (str.equals("central")) {
			strReturn += "- The drastic rise in extreme and exceptional drought conditions in Central CA "
					+ "only fuels the \n wildfires that occur. It is predicted that the rate and size of "
					+ "wildfires will not only continue to \n increase over the near future, but to increase "
					+ "dramatically (CSU Signal)\n\n" + "- Residents in Central Valley experience diminished "
					+ "air quality from the smokes of wildfires, for \n example, the KNP Complex that began in "
					+ "September 10 and has not been contained yet, as of October 15.\n\n";
		}
		strReturn += "- To prevent the spread of wildfires, PG&E shut down the power for customers "
				+ "across the counties \n when there are high speed winds.";
		return strReturn;
	}

	public void nextRand() {
		rand += 1;
	}
	
	public int getRand()
	{
		return rand;
	}

}
