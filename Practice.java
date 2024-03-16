abstract class prac{
    public void name(){
        System.out.println("Hlaching Mong Marma");
    }
    
    abstract public void n();
    
    
}

class go extends prac{
    public void name(){
        System.out.println("Hlaching Mong");
    }

    public void n(){
        System.out.println("Hlaching ");
    }
}
public class Practice {
    public static void main(String [] args){
        go p1 = new go();
        p1.name();
        p1.n();

    }
    
}