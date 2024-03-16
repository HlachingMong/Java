public class code {
    void test(int a, String b){
        System.out.println("My id is: " + a);
        System.out.println("My name: " + b);
    }
    public static void main(String [] args){
        int id = 21;
        String name = "Hlaching Mong Marma";
        code c = new code();
        c.test(id, name); 

    }
}
