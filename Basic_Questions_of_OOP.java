class worker{
    int salary;
    private String name;

    public int salary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}



class ring{
    public void p1(){
        System.out.println("Hlaching Mong's Phone is Ringing");
    }
    public void p2(){
        System.out.println("Chinghlamong's phone is Ringing");
    }
}

public class Basic_Questions_of_OOP {
    public static void main(String [] args){
        worker e = new worker();
        e.salary = 10000;
        e.setName("Hlaching Mong Marma");
        System.out.println(e.salary());
        System.out.println(e.getName());

        ring r = new ring();
        r.p1();
        r.p2();

    }
    
}