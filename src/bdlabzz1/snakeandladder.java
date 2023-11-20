package bdlabzz1;

public class snakeandladder {
	
	// now we make a function for Dice number
    static int Dice(){
        int roll = (int) (Math.random()*100) % 6 + 1;
        return roll;
    }

	public static void main(String[] args) {
		// we are creating this variables so that it will help us in checking conditions
        final int No_Play = 0;
        final int Is_Snake = 1;
        final int Is_Ladder = 2;
        final int winning_pos = 100;
        
		// welcome message
        System.out.println("welcome to the game of snake and ladders");

        // adding player one
        int Pos_Player1 = 0;
        System.out.println("welcome player one. Your starting position will be " + Pos_Player1);
     
        // now we will call the function of the dice 
        int Dice1 = Dice();
        System.out.print("the dice is rolled and the player position is:" + Dice1);
        
     // we will keep rolling the dice until we get winning position 
        while(Pos_Player1 != winning_pos){
        
            // now adding the checks on the game
            int check = (int) (Math.random() * 100) % 3;
            switch (check) {
                case No_Play:
                    System.out.println("Player1 has got no ladder or snake " + Pos_Player1);
                    Pos_Player1 = Pos_Player1 + Dice();
                    break;

                case Is_Snake:
                    System.out.println("player1 has got snake");
                    Pos_Player1 = Pos_Player1 - Dice();
                    System.out.println("new position of player 1 will be " + Pos_Player1);
                    break;
            
                case Is_Ladder:
                    System.out.println("player one has got ladder");
                    Pos_Player1 = Pos_Player1 + Dice();
                    System.out.println("new position of player one will be " + Pos_Player1);
                    break;
                
            }
            // if the position go below 0 then we will shift it to 0 again
            if(Pos_Player1<0){
                Pos_Player1 = 0;
            }           
        }
            
	}

}
