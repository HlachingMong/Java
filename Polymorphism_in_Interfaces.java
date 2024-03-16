interface MyCamera2{
    void takeSnap();
    void recordVideo();

    private void t(){
        System.out.println("Private");
    }
    default void name(){
        t();
        System.out.println("Default");
    }
}

interface MyWifi2{
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void cellNumber(int number){
        System.out.println("Calling " + number);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWifi2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Video Recording");
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}

public class Polymorphism_in_Interfaces {
    public static void main(String [] args){
        MyCamera2 c = new MySmartPhone2();
        c.takeSnap();
        c.recordVideo();
        //c.connectToNetwork("Hlaching Mong Marma");
        System.out.println("..........");
        MySmartPhone2 ms = new MySmartPhone2();
        ms.takeSnap();
        ms.recordVideo();
        ms.connectToNetwork("Hlaching Mong");
    }
}
