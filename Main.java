import java.util.Scanner; 

/**
 * Tells you all the factors of the number inputed by the user and will keep telling the user to enter a positive integer if they enter a negative 
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input 
    Scanner input = new Scanner(System.in); 

    //declare variable for user number and count number
    int userNum; 
    int count = 1; 

    // create a do while statement for when the user inputs a positive or negative number  
    do{
      System.out.println("Please enter a positive integer to determine its factors:"); 

      userNum = input.nextInt(); 

    }while(userNum < 0); 

    //enter a line that will tell the user "The factors of the users number are the following" 
    System.out.println("The factors of " + userNum + " are:");


    // create while statement to find all factors of the user's number 
    while(userNum >= count){
      if(userNum % count == 0){
        System.out.println(count);
      }
      count = count + 1; 
      
    } 
  

    
  }
}
