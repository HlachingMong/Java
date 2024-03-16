interface MyCamera{
    void takeSnap();
    void recordVideo();

    private void t(){
        System.out.println("Private");
    }
    default void name(){
        t();                                     // By using default we can implement method inside interface. We can also implement private method and call it using default method.
        System.out.println("Default");
    }
}

interface MyWifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellphone{
    void cellNumber(int number){
        System.out.println("Calling " + number);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellphone implements MyCamera, MyWifi{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording");
    }

    public String [] getNetworks(){
        System.out.println("Getting List of Networks");
        String [] networkList = {"Harry vai", "Hlaching Mong", "Xiao"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }

    // public void name(){
    //                                       // By using default we can implement method inside interface. We can also implement private method and call it using default method.
    //     System.out.println("We Can Override default method from the interface");
    // }


}
public class Interfaces_Example_and_Default_Methods {
    public static void main(String [] args){
        MySmartPhone sm = new MySmartPhone();
        sm.cellNumber(1850220494);
        sm.takeSnap();
        sm.recordVideo();
       sm.connectToNetwork("Hlaching");
       sm.name();

       String [] ar = sm.getNetworks();
       for(String item : ar){
        System.out.println(item);
       }
    }
}
