abstract class pack{
    public void m(){
        System.out.println("Hutao");
    }
    abstract public void no();
    abstract public void name();
    
}


class chat extends pack{
    public void name(){                                //If you don't override the abstract method from the child class, then you have to make the class abstract, otherwise, it will show error.        
    System.out.println("xiao");
    }

    public void no(){
        System.out.println("H");
    }
}

class chat2 extends pack{
   

    public void name(){
        System.out.println("H");
    }
    public void no(){
        System.out.println("xiao");
    }


    public void m(){
        System.out.println("Hlaching Mong");
    }
}

public class Abstract_Class_and_Method {
    public static void main(String [] args){
        // parent p = new parent();                             // We can't create object of abstract class.
        // p.name();


    // child c1 = new child();
    // c1.no();

     chat2 c = new chat2();
    //  c.no();
     c.name();
     c.no();
     c.m();
}
}