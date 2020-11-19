import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Klincan
 */

public class ProgramB {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);

int cases = scn.nextInt(); 

for (int x = 0; x < cases; x++)
	{
	
	int candidates = scn.nextInt();
	int total = 0;
	int index = 0;
	int maxAmount = 0;
	int winner = 0;
	ArrayList<Integer> numbers = new ArrayList<>();
	
	for (int i = 0; i < candidates; i++) 
		{
		int vote = scn.nextInt(); 
		numbers.add(vote); 
		total += vote; // total = total + vote
		}
	
	for (int i = 0; i < candidates; i++) 
		maxAmount = Math.max(maxAmount, numbers.get(i)); 
	
	for (int i = 0; i < candidates; i++) 
		if (numbers.get(i) == maxAmount)
			{
			index = i;
			winner++;
			}
	
	if (winner > 1)
		System.out.println("no winner"); 
	else
		{
		if (maxAmount > (total / 2))
			System.out.print("majority"); 
		else
			System.out.print("minority"); 
		
		System.out.println(" winner " + (index + 1)); 
		}
	}

scn.close();
}}
