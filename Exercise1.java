import java.util.Scanner;

class Game1{
    int num;
    int uNum;
    //int noOfGuesses;
    int n = 0;
 
    public Game1(){
        num = (int)(Math.random()*10)+1;
        System.out.println(num);
    }

    public void takeUserInput(){
        System.out.println("Guess The Number:");
        Scanner s = new Scanner(System.in);
        uNum = s.nextInt();
    }

    // public void isCorrectNumber(){
        
    //     n++;
    //     if(num==uNum){
    //         System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", num, n);
    //         //System.out.println("You have guessed the Right number");
    //     }else if(num>uNum){
    //         System.out.println("You have guessed the less number of the actual number");
    //     }else {
    //         System.out.println("You have guessed the big number of the actual number");
    //     }
    //     }
    // }

    public void setNumbOfGuesses(int n){
        this.n = n;
 }

 public int getNumbOfGuesses(){
     return n;
 }

 boolean isCorrectNumber(){
        
        n++;
        if(num==uNum){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", num, n);
            return true;
            //System.out.println("You have guessed the Right number");
        }else if(num>uNum){
            System.out.println("You have guessed the less number of the actual number");
        }else {
            System.out.println("You have guessed the big number of the actual number");
        }
        return false;
        }
    }

    

public class Exercise1 {
    public static void main(String [] args){
        Game1 g = new Game1();
        boolean b = false;
        while(!b){
            g.takeUserInput();
          b = g.isCorrectNumber();

        }
        
        //g.setNumbOfGuesses();
        //System.out.println(g.getNumbOfGuesses());
    }
    
}
