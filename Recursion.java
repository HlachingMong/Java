public class Recursion {
    static int data(int n){
        int product = 1;
        for(int i = 2; i<=n; i++){
            
            product *= i;
        }
        return product;
    }
    public static void main(String [] args){
        int x = 5;
        System.out.println(data(x));
    }
}
