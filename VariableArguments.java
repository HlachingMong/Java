public class VariableArguments {

    // static int sum(int a, int b){
    //     return a+b;
    // }

    // static int sum(int a, int b, int c){
    //     return a+b+c;
    // }

    static int sum(int...arr){   //(int...arr) available as int [] arr
        int num = 0;
        for(int a: arr){
            num += a;
        }
        return num;
    }
    public static void main(String [] args){
        System.out.println("Sum of 22 and 8 is: " + sum(22, 8));
        System.out.println("Sum of 22, 8 and 10 is: " + sum(22, 8, 10));
    }
}
