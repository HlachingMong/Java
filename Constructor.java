class Employee1{
    private int id;
    private String name;

    public Employee1(int myId, String myName){   // constructor part.  constructor name should be same as class name.
                                                  // There can be multiple construcxtor in class
        id = myId;
        name = myName;
    }

    public Employee1(){
        id = 21;
        name = "Hlaching";
    }

    // public void setId(int i){
    //     id  = i;
    // }
    public int getId(){
        return id;
    }
    // public void setName(String n){
    //     name = n;
    // }
    public String getName(){
        return name;
    }
}
public class Constructor {
    public static void main(String [] args){
        Employee1 e = new Employee1(21, "Hlaching Mong");      //By writing data in object 
        // e.setId(21);
        // e.setName("Hlaching Mong Marma");
        System.out.println(e.getId());
        System.out.println(e.getName());
    }
}
