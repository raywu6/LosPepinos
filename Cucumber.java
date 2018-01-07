// LosPepinos (Kerwin Chen, Raymond Wu, Jerry Ye)
// APCS1 pd1
// 2018-01-06

/*

This is the Cucumber superclass. It defines the properties of any Cucumber.

The String variable name will hold the descriptive name of the Cucumber species.

The int variable nutrition will hold the amount of nutrition the Cucumber has. The amount of nutrition will help determine the value of the Cucumber.

The int variable ripeDuration will hold the amount of time it takes for a Cucumber to fully grow, in weeks. This will help determine the toString name of the Cucumber.

The int variable value will hold the value of the Cucumber. This is what the Cucumber can be sold for after if it is harvested.

*/


public class Cucumber
{

    private String name;
    private int nutrition, ripeDuration;
    private int value;
    
    public void grow()
    {
	ripeDuration -= 1;
	value += nutrition;
    }
	
    public int getNutrition()
    { return nutrition; }

    public int getRipeDuration()
    { return ripeDuration; }

    public int getValue()
    { return value; }
    
    public String toString()
    { return name + getRipeDuration(); }
}
    
