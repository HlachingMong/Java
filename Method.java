public class Method {
    // If we don't create object to call the method. Then we have to write (static) int the method 
    static int sum(int x, int y){
        int c;
        if(y>x){
            c = x+y;
        }
        else{
            c = y-x;
        }
        return c;
    }
// If we create object to call the method. Then we don't need to write static in the method.
     int test(int x, int y){
        int c;
        if(y>x){
            c = x-y;
        }
        else{
            c = y+x;
        }
        return c;
    }

    public static void main(String [] args){
        int a = 5;
        int b = 15;

        //int d = sum(a, b);
        System.out.println(sum(a, b));

        //Method invocation using object creation
        Method m = new Method();
        int v = 6;
        int f = 4;
        int a1 = m.test(v, f);
        System.out.println(a1);

    }
}
