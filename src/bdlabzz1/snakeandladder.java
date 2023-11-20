package bdlabzz1;

public class snakeandladder {
	
	// now we make a function for Dice number
    static int Dice(){
        int roll = (int) (Math.random()*100) % 6 + 1;
        return roll;
    }

	public static void main(String[] args) {
		// welcome message
        System.out.println("welcome to the game of snake and ladders");

        // adding player one
        int Pos_Player1 = 0;
        System.out.println("welcome player one. Your starting position will be " + Pos_Player1);
     
        // now we will call the function of the dice 
        int Dice1 = Dice();
        System.out.print("the dice is rolled and the player position is:" + Dice1);
            
	}

}
