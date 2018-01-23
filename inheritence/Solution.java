import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.*/
       String firstName;
    /*   @param lastName - A string denoting the Person's last name.*/
       String lastName;
    /*   @param id - An integer denoting the Person's ID number.*/
       int id,total=0,i=0,size;
    /*   @param scores - An array of integers denoting the Person's test scores.
    */ int[] scores;

    String grade;
    // Write your constructor here
    Student(String firstName,String lastName,int id,int[] testScores)
    {
       super(firstName,lastName,id); 
        scores=new int[testScores.length];
        scores=testScores;
        size=testScores.length;
    }
       
    /*	
    *   Method Name: calculate*/
   String calculate()
    { 
    while(size>0)
    { 
        total=total+scores[i];
        size--;
        i++;
    }
     float average=total/i;       
     if((average>=90)&&(average<=100))
     {
         grade="O";
     }
     else if((average>=80)&&(average<90))
     {
         grade="E";
     }
     else if((average>=70)&&(average<80))
     {
         grade="A";
     }
     else if((average>=55)&&(average<70))
     {
         grade="P";
     }
     else if((average>=40)&&(average<55))
     {
          grade="D";
     }
     else if(average<40)
     {
          grade="T";
     }
    // Write your method here
       return grade;
    }
}
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}