class cylinder{
    private int radius;
    private int height;

    public cylinder(int myRadius, int myHeight){
        radius = myRadius;
        height = myHeight;

    }
    

    public void setRadius(int r){
        this.radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int h){
        this.height = h;
    }
    public int getHeight(){
        return height;
    }
}
public class Exercise_on_Access_Modifiers_and_Constructors {
    public static void main(String [] args){
        cylinder c = new cylinder(12, 13);
        // c.setRadius(12);
        // c.setHeight(13);
        int l = c.getRadius();
        int n = c.getHeight();
        System.out.println(l);
        System.out.println(n);
    }
}
