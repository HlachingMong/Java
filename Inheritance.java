class Base{
    public int x;
    public void setX(int i){
        this.x = i;
    }
    public int getX(){
        return x;
    }
    public void n(){
        System.out.println("Hlaching Mong Marma");
    }
}

class Derived extends Base{
    public int y;

    public void setY(int k){
        y = k;
    }
    public int getY(){
        return y;
    }
}
public class Inheritance {
    public static void main(String [] args){
        Base b = new Base();
        b.setX(21);
        int l = b.getX();
        b.n();
        System.out.println(l);

        Derived d = new Derived();
        d.n();
        d.setX(24);
        d.setY(25);
        int m = d.getX();
        int e = d.getY();
        System.out.println(m);
        System.out.println(e);
    }
    
}
