class parent{
    public void name(){
        System.out.println("Parent Class");
    }

    public void name1(){
        System.out.println("Child Class1");
    }
}
class child extends parent{
    @Override                         // It will detect whether the method is override or not. If the method is not override than it will show error.
    public void name(){
        System.out.println("Child Class");
    }
    
    public void name2(){
        System.out.println("Child Class2");
    }
    

}
public class Dynamic_Method_Dispatch {
    public static void main(String [] args){
        // parent p = new parent();
        // p.name();

        // child c = new child();
        // c.name();

        parent p = new child();   // In this case, only the parent class methods can be accessible. The child class methods can't be accessible 
        p.name();
        p.name1();

        child c = new child();
        c.name();
      }

}
