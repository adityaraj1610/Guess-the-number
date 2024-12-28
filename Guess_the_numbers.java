import java.util.Random;
import java.util.Scanner;

class Games{
    public int number;
    public int inputNumber;
    public int noOfGuesses =0;


    public int getnoOfGuesses(){
        return noOfGuesses;
    }
    public void setnoOfGuesses (int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }

    Games(){
        Random rand = new Random();
        this.number =rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.print("Guess the number: ");
        Scanner sc =new Scanner(System.in);
        inputNumber = sc.nextInt();

    }
    boolean IsCorrectNumber(){ 
        noOfGuesses++;  
        if ( inputNumber==number){
            System.out.format("Yess you guessed it right..!! it was %d\n, You gussed it in %d attempts ", number, noOfGuesses);
            return true;
        } else if ( inputNumber<number){
            System.out.println("Too Low...");
        }else if ( inputNumber>number){
            System.out.println("Too High...");
        }
        return false;
    }
}


public class Guess_the_numbers {
    public static void main(String[] args) {

        Games G= new Games();
        boolean b = false;
        while (!b){
        G.takeUserInput();
        b = G.IsCorrectNumber();
        
    }
}
    
}
