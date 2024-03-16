class Employee{
    private int id;
    private String name;    // You can't access this private data type from another class  

    public int getId(){
        return id;
    }
    public void setId(int i){    // that's why I have to use this method to take input id from another class
        this.id = i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
}
public class Access_Modifiers {
    public static void main(String [] args){
        Employee e = new Employee();
        e.setId(21);
        e.setName("Hlaching Mong");
        System.out.println(e.getId());
        System.out.println(e.getName());

    }
    
}
