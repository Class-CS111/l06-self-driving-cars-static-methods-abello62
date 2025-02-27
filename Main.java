// When you are ready to have your work checked, change the value below from N to Y
// ReadyForSubmission=Y
// YOUR NAME: Alejandro Bello 
// COLLABORATORS: N/A
// DATE:02/26/2025  

public class Main //toolbox
{
	public static void main(String[] args) //method header
	{   //method body (is what's inside the curly brackets)
		System.out.println("My thoughts on the article are:");
		// Part 2: Invoking/calling method
		Main.printArticleAnswers(); // this will run the method below 
	}	

	// Part 1: Creating method definition
				// return type (Void) //method identifier (printArticleAnswers)
	public static void printArticleAnswers() //method header
	{ //method body
		System.out.println(" I believe that self-driving cars should prioritize the safety of " + 
		"the passenger due to the fact that the pedestrian more than likely is one in the wrong " + 
		"by jay walking or running infront of cars. If the self-driving car were to prioritize the " +  
		"pedestrian there's a higher chance a bigger accident may occur. ");
		System.out.println("The car should factor its surroundings and road conditions " +
		"because without those variables taken in consideration it may put a lot more lives in danger. ");
		System.out.println("The ones who should be deciding the algorithm for self-driving " +
		"cars should the government and the people, essentially having a meeting so everyone can " +
		"be in agreement of what the procedure should be for a self-driving vehicle. ");
	
	}
}