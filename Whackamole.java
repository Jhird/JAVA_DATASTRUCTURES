/*In this assignment we will simulate a variant of the 
classic whack-a-mole game.
Create a class called WhackAMole.

It contains three integer instance variables called score,
molesLeft, and attemptsLeft. Make one more instance 
variable called moleGrid which is a 2-dimensional 
array of chars.


We will also have you create the following methods 
in this class.


WhackAMole(int numAttempts, int gridDimension) - 
Constructor for the game, specifies total number of 
whacks allowed, and the grid dimension. After reading 
through the assignment, make sure to initialize the 
moleGrid with the appropriate character.


boolean place(int x, int y) – Given a location, place a 
mole at that location. Return true if you can. 
(Also update number of moles left.)            


void whack(int x, int y) -  Given a location, 
take a whack at that location. If that location 
contains a mole, the score, number of attemptsLeft, 
and molesLeft is updated. If that location does not contain 
a mole, only attemptsLeft is updated.


void printGridToUser() – Print the grid without 
showing where the moles are. For every spot that has 
recorded a “whacked mole,” print out a W, or * otherwise.


void printGrid() -  Print the grid completely. 
This is effectively dumping the 2d array on the screen. 
The places where the moles are should be printed as an 
‘M’. The places where the moles have been whacked should
be printed as a ‘W’. The places that don’t have a mole
should be printed as *.


Putting it all together - main method
In order to play this game you need to create a main 
method. 
Begin by creating a 10 by 10 grid where you randomly 
place the moles. Place a total of 10 moles.
Now allow the user (remember how to use Scanner?) to
enter the x and y coordinates of where they would like
to take a whack. Tell them they have a maximum of 50
attempts to get all the moles. 
At any point in the game, they can input coordinates 
of -1, -1 in order to indicate that they are giving up.
If the user gives up they get to see the entire grid.  
The game ends if the user is able to uncover all the
moles or if the user runs out of attempts.*/


// Import libraries and Packages
import java.util.*;

// Initialize WhackAMole class
class WhackAMole{
    int score;
    int molesLeft;
    int attemptsLeft;
    int dimension;
    char moleGrid[][]; // M = mole, E = empty, W = whacked mole

    // CONSTRUCTOR
    WhackAMole(int numAttempts, int gridDimension){
        attemptsLeft = numAttempts;
        score = 0;
        dimension = gridDimension;
        moleGrid = new char[dimension][dimension];
        molesLeft = (numAttempts-2) * 2;

        // Initialize moleGrid with all E's
        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                moleGrid[i][j] = 'E';
            }
        }
    }

    // PLACE
    boolean place(int x, int y){
        if (molesLeft == 0){
            System.out.println("Don't have any moles left!");
            return false;
        }
        else if (moleGrid[x][y] == 'M' || moleGrid[x][y] == 'W'){
            System.out.println("Can't place mole here!");
            return false;
        }
        else{
            moleGrid[x][y] = 'M';
            molesLeft = molesLeft - 1;
            System.out.println("Mole has been placed successfully!");
            return true;
        }
        
    }

    // WHACK
    void whack(int x, int y){
        if (moleGrid[x][y]=='M'){
            System.out.println("You've whacked this mole. GOOD JOB!");
            score = score + 1;
            attemptsLeft = attemptsLeft - 1;
            molesLeft = molesLeft - 1;
            moleGrid[x][y] = 'W';
        }
        else{
            attemptsLeft = attemptsLeft - 1;
        }
        if (attemptsLeft == 0){
            System.out.println("You've run out of attempts. GAME OVER");
        }
    }

    //PRINT 
    void printGridToUser(){
        for (int i = 0; i < dimension; i++) {
            System.out.println(" ");
            for (int j = 0; j < dimension; j++){
                if (moleGrid[i][j] != 'W'){
                    System.out.print('*');
                }
                else{
                    System.out.print(moleGrid[i][j]);
                }
            }
        }
        System.out.println(" ");
    }

    //PRINT GRID
    void printGrid(){
        for (int i = 0; i < dimension; i++) {
            System.out.println(" ");
            for (int j = 0; j < dimension; j++){
                System.out.print(moleGrid[i][j]);
            }
        }
        System.out.println(" ");
    }

    // MAIN
    public static void main(String[] args){

        WhackAMole game = new WhackAMole(4, 3);
        game.place(0,0);
        game.place(1,1);
        game.place(2,2);
        game.place(2,0);
        System.out.println("Attempts left: " + game.attemptsLeft);
        game.printGridToUser();
        game.whack(0,0);
        game.printGridToUser();
        game.whack(1,1);
        game.printGridToUser();
        game.whack(2,2);
        game.printGridToUser();
        game.whack(0,1);
        game.printGridToUser();
        game.whack(0,2);
        game.printGrid();

/*
        while (game.attemptsLeft > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a row to whack");
            int row = scanner.nextInt();
            System.out.println("Please enter a column to whack");
            int col = scanner.nextInt();
            game.whack(row, col);
            game.printGridToUser();
        }
*/

    }

}