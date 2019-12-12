/********************************************
 * Class for data on endangered species
 ********************************************/
import java.util.Scanner;
class Species
{
  private String name;
  private int population;
  private double growthRate;
	
  public void readInput()
  {
	Scanner scan = new Scanner(System.in);
  	System.out.println("What is the species name?");
  	name = scan.nextLine();
	System.out.println("What is the population of the species?");
	population = scan.nextInt();
	System.out.println( "Enter growth rate (percent increase per year):");
	growthRate = scan.nextDouble();
  }

  public void writeOutput()
  {
	System.out.println("Name = " + name);
	System.out.println("Population = " + population);
	System.out.println("Growth rate = " + growthRate + "%");
  }

  public int projectedPopulation(int years)
  {
	double populationAmount = population;
	while ( years > 0 )
	{
	  populationAmount = (populationAmount + (growthRate / 100) 
	  	* populationAmount);

	  years--;
	}
	if (populationAmount > 0)
		return (int)populationAmount;
	else
		return 0;
  }

  public void set(String newName, int newPopulation, double newGrowthRate)
  {
	name = newName;
	population = newPopulation;
	growthRate = newGrowthRate;
  }

  public String getName()
  {
	return name;
  }

  public int getPopulation()
  {
	return population;
  }

  public double getGrowthRate()
  {
	return growthRate;
  }

  public boolean equals(Species otherObject)
  {
	return ((name.equalsIgnoreCase(otherObject.name))
		&& (population == otherObject.population)
		&& (growthRate == otherObject.growthRate));
  }
}
/********************************************
 * Class to demonstrate Species
 ********************************************/
public class SpeciesDemo
{
  public static void main(String[] args)
  {
	Species speciesOfTheMonth = new Species();
	int futurePopulation;
	
	System.out.println("Enter data on species of the Month:");
	speciesOfTheMonth.readInput();
	speciesOfTheMonth.writeOutput();
	
	futurePopulation = 
		speciesOfTheMonth.projectedPopulation(10);
	System.out.println("Projected population will be "
				+ futurePopulation);
	speciesOfTheMonth.set("Klingon ox", 10, 15);
	//speciesOfTheMonth.name = "Klingon ox";
	//speciesOfTheMonth.population = 10;
	//speciesOfTheMonth.growthRate = 15;
	System.out.println("The new Species of the Month:");
	speciesOfTheMonth.writeOutput();
	System.out.println("In ten years population will be "
		+ speciesOfTheMonth.projectedPopulation(10));
  }
}
