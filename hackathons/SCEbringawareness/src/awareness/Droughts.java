package awareness;

public class Droughts {
private int rand;
	
	public Droughts(int rand)
	{
		this.rand = rand;
	}
	
	public String information()
	{
		if (rand == 1)
		{
			return "July 2021 was the driest month on record in California since records began in 1895.";
		}
		else if (rand == 2)
		{
			return "100% of California is experiencing some degree of drought as of June 22, 2021.";
		}
		else if (rand == 3)
		{
			return "39.89% of the U.S. is in drought. This is as of June 22, 2021.";
		}
		else if (rand == 4)
		{
			return "From 1895 to 2010, in any given year, about 14% of the U.S. experienced moderate to severe droughts.";
		}
		else if (rand == 5)
		{
			return "The three longest drought episodes in the U.S. occurred in the 1930s, the 1950s, and the early 21st century.";
		}
		else
		{
			return "There are no drought more facts right now";
		}
	}
	
	public String howToHelp()
	{
		return "1. Avoid flushing the toilet when unnecessary. \n" + 
				"2. Take short showers instead of baths. \n" + 
				"3. Place a bucket in the shower to catch excess water and water the plants with that water.\n" + 
				"4. Contact the local water provider for more information and assistance.";
	}
	
	public String regionFacts(String str)
	{
		str = str.toLowerCase();
		String strReturn = "";
		if (str.equals("northern"))
		{
			strReturn += "- Lake Shasta in Northern CA is at 38% capacity as of July 2, 2021 "
					+ "(US Bureau of Reclamation)\n \n" + 
						"- On April 21, Gov. Gavin Newsom proclaimed a regional drought "
						+ "emergency for the Russian River \n watershed in Sonoma and Mendocino "
						+ "counties, where reservoirs are at record lows (Lake County News)\n \n" + 
						"- Over Memorial Day weekend in 2021, dozens of houseboats sat on cinder "
						+ "blocks at Lake Oroville in \n Northern CA because there wasn’t enough"
						+ " water to hold them (AP news)\n\n";
		}
		else if (str.equals("southern"))
		{
			strReturn += "- The water level of Lake Skinner in Southern CA is very low and "
					+ "causes people to be unable to use  \n the lake for recreation, for "
					+ "example, launching their boats via the launch ramps.\n \n" + 
					"- Big Bear Lake in Southern CA is experiencing water levels 13.5 feet below full capacity "
					+ "which \n dramatically affects all marinas because boat docks are pushed "
					+ "further onto the lake (NBC)\n\n";
		}
		else if (str.equals("bay area"))
		{
			strReturn += "- The Santa Clara Valley Water District oversees 10 reservoirs and "
					+ "they are all at less than 12% \n capacity (NBC)\n\n" + 
					"- The Stevens Creek Reservoir than flows through most of the Bay Area was at 18%"
					+ " capacity in May 2021.\n This causes people to be unable to enjoy their"
					+ " recreational activities. As of October 2021, the reservoir \n is closed to all boating"
					+ " because of the low water level.\n\n";
					
		}
		else if (str.equals("central"))
		{
			strReturn += "- Central California, which includes Fresno, Madera, Kings, Merced, and "
					+ "other counties, are in the \n “exceptional drought” range, which is one of "
					+ "the most severe levels of dry conditions (ABC)\n\n" + 
					"- The Central Valley farmers have already had their water resources reduced, "
					+ "but they could soon \n face some of the harshest water restrictions because "
					+ "of the drought (ABC)\n\n";
		}
		strReturn += "- The drought is hotter and drier than previous ones, meaning that water "
				+ "is evaporating faster. More \n than 1,500 reservoirs in California are 50% lower than they "
				+ "should be (ABC 10)";
		return strReturn;
	}

	public void nextRand()
	{
		rand +=1;
	}
	
	public int getRand()
	{
		return rand;
	}
	
}
