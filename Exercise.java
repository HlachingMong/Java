import java.util.Scanner;

class game{
    private int num;

    public game(){
        num = (int)(Math.random()*10)+1;
    }
    // public void setNum(int i){
    //     num = i;
    // }
    public int getNum(){
        return num;
    }
}
// class game{
//     public game(){

//     }
// }
public class Exercise {
    public static void main(String [] args){
        // game g = new game();
        System.out.println("Welcome to guess the number game.");
        game g = new game();
        int b = g.getNum();
        System.out.println(b);
        
        int i = 0;
        for(;;){
            // boolean flag = false;
            System.out.println("Enter Number: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
            if(a==b){
                i++;
                System.out.println("You are right.");
                break;
            }
            else if(a > b ){
                i++;
                System.out.println("Your guessing number is greater than the number.");
                // if(!flag){
                //     System.out.println("Your guessing number is greater than the number.");
                //    flag = true;
                // }
                //continue;
                
            }else{
                i++;
                System.out.println("Your guessing number is smaller than the number.");   
                // if(!flag){
                //     System.out.println("Your guessing number is smaller than the number.");                 
                //     flag = true;
                // }
                //continue;
            }
            

        }
        System.out.println("Total numbers you have entered: " + i);
        
     
    }
}
