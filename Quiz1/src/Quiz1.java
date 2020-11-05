import java.util.*;
public class Quiz1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("For Female, input your height in feet and inch " );
		System.out.println("For example, 5'3\", please enter 53 ");
		System.out.print("Feet : ");
		int femalefeet = in.nextInt();
		System.out.print("Inch : ");
		int femaleinch = in.nextInt(); 

		
		System.out.println("For Male, input your height in feet and inch ");
		System.out.println("For example, 6'2\", please enter 62 ");
		System.out.print("Feet : ");
		int malefeet = in.nextInt();
		System.out.print("Inch : ");
		int maleinch = in.nextInt();
		
		
		int femalefeettoinch = (femalefeet -5) *12;
		int femalesuminch = femalefeettoinch + femaleinch;
		int remainderfemaleinch = (femalesuminch *5);
		int idealfemaleweight = 40 + (remainderfemaleinch); 
		
		
		int malefeettoinch = (malefeet -5) *12;
		int malesuminch = malefeettoinch + maleinch;
		int remaindermaleinch = (malesuminch *6);
		int idealmaleweight = 50 + (remaindermaleinch); 
		
		System.out.println("The ideal weight for a female : " +idealfemaleweight +"kg");
		System.out.println("The ideal weight for a male : " +idealmaleweight +"kg");
		
		
		

	}

}
