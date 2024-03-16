interface geo{
    void zhongli();
    void chiori();
}

interface electro extends geo{
    void raiden();
    void yae();
}

class anemo implements electro{
    public void raiden(){
        System.out.println("Raiden Shougun");
    }
    public void yae(){
        System.out.println("Yae Miko");
    }
    public void zhongli(){
        System.out.println("Zhongli");
    }
    public void chiori(){
        System.out.println("Chiori");
    }
    
}
public class Interface_in_Inheritance {
    public static void main(String [] args){
        anemo a = new anemo();
        a.raiden();
        a.yae();
        a.zhongli();
        a.chiori();
}
}
