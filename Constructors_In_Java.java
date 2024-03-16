class Base1{
    Base1(){
        System.out.println("I am a Base class Constructor");
    }
    Base1(int n){
        System.out.println("Base1 number is: " + n);
    }
}

class Derived1 extends Base1{
    Derived1(){
        
        System.out.println("I am a Derived class Constructor");
    }
    Derived1(int n){
        super(21);
        System.out.println("Derved number is: " + n);
    }
}

class ChildOfDerived1 extends Derived1{
    ChildOfDerived1(){
        System.out.println("I am a Child of Derived1 Class");
    }

    ChildOfDerived1(int n){
        super(22);
        System.out.println("Child of Derived number is: " + n);
    }
}
public class Constructors_In_Java {
    public static void main(String [] args){
        // Base1 b = new Base1();
        //Derived1 d = new Derived1();
        ChildOfDerived1 c = new ChildOfDerived1(23);
    }
    
}
