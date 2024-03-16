class List{
    int id;
    String name;
    public void details(){
        System.out.println("Your id is: " + id);
        System.out.println("Your name is: " + name + "\n");
    }
}


public class Creating_Custom_Class {
    
    public static void main(String [] args){


        List L = new List();
        List H = new List();

        L.id = 21;
        L.name ="Hlaching Mong Marma";

        H.id =23;
        H.name = "Chinghlamong Marma";
        L.details();
        H.details();

        String n = "Hlaching Mong Marma";
        System.out.println(n);
    }
    
}
     