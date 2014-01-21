package loop.model;

import java.util.ArrayList;

public class Looper
{
	public ArrayList<String> graveNameList;
	
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheNameList();
	}

	
	private void fillTheNameList()
	{
		graveNameList.add("John Edward Rich");
		graveNameList.add("Roxie Nelson Rich");
		graveNameList.add("Arthur G Cushing");
		graveNameList.add("Mary A. Cushing");
		graveNameList.add("Stig Mikael Stenfors");
		graveNameList.add("Devvin D. Kraatz");
		graveNameList.add("Sisko Anita Stenfors");
		graveNameList.add("James V. Wood");
		graveNameList.add("Valora C. Wood");
		graveNameList.add("Alfred Limb");
		graveNameList.add("Sarah Limb");
		graveNameList.add("Karen L. England");
		graveNameList.add("William Olsen");
		graveNameList.add("Edith G. Olsen");
		graveNameList.add("Mary Etta Blair");
		graveNameList.add("Samuel L. Spencer");
		graveNameList.add("Blanche L. Johnson");
		graveNameList.add("Mother");
		graveNameList.add("Harold E. Nichols");
		graveNameList.add("Ruth G. Nichols");
	}
	
	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
	}
	
	public String LoopTestOne()
	{
		String loopResult = "";
		int timesLooped = 0;

		for (int loopCounter = 0; loopCounter < 10; loopCounter += 2)
		{
			loopResult += loopCounter + ", ";
			timesLooped++;
		}

		loopResult += "\nThe loop executed " + timesLooped + " times";

		return loopResult;
	}

	public String LoopTestTwo()
	{
		String loopResult = "";
		int outerLoopTimes = 0;
		int timesLooped = 0;
		for (int weeks = 0; weeks < 52; weeks++)
		{
			for (int hours = 0; hours < 24; hours++)
			{
				for (int outerLoop = 0; outerLoop < 60; outerLoop++)
				{
					for (int loopCounter = 0; loopCounter < 60; loopCounter++)
					{
						// loopResult += loopCounter + ", ";
						timesLooped++;
					}
					outerLoopTimes++;
				}
			}
		}

		loopResult += "\nThe loop executed " + timesLooped + " times";

		return loopResult;
	}

	public String LoopTestThree()
	{
		String loopResult = "";
		int outerLoopTimes = 0;
		int timesLooped = 0;

			for (int FiftyCent = 0; FiftyCent < 2; FiftyCent++)
			{
				for (int dimes = 0; dimes < 5; dimes++)
				{
					for (int nickles = 0; nickles < 2; nickles++)
					{
						for (int pennies = 0; pennies < 5; pennies++)
						{
							// loopResult += loopCounter + ", ";
							timesLooped++;
						}
						outerLoopTimes++;
					}
				}
			}

		loopResult += "\nThe loop executed " + timesLooped + " times";

		return loopResult;
	}
	
	public String LoopTestFour()
	{
		String loopResult = "";
		int outerLoopTimes = 0;
		int timesLooped = 0;

			for (int megabyte = 0; megabyte < 1024; megabyte++)
			{
				for (int kilobyte = 0; kilobyte < 1024; kilobyte++)
				{
					for (int bytes = 0; bytes < 1024; bytes++)
					{
						for (int bit = 0; bit < 8; bit++)
						{
							// loopResult += loopCounter + ", ";
							timesLooped++;
						}
						outerLoopTimes++;
					}
				}
			}

		loopResult += "\nThe loop executed " + timesLooped + " times";

		return loopResult;
	}
}
