interface traits{
    int a = 21;
    void sound();
    void behavior();
}

interface color{
    void colorName();
}

class cat implements traits, color{
    public void colorName(){
        System.out.println("Grey");
    }
    public void sound(){                                  // We have to write public in method.
        System.out.println("Cat");
    }
    public void behavior(){
        System.out.println("ferocious");
    }
}

public class Interface {
    public static void main(String [] args){
        cat c = new cat();
        // c.a = 22;            //we can't change the data. Because in interface when we assign the data it is final. 
        System.out.println(c.a);
        c.colorName();
        c.sound();
        c.behavior();
    }
    
}
