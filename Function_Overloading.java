public class Function_Overloading {
    static void num(int [] arr){
        arr[1] = 55;
    }
    public static void main(String [] args){
        int [] arr ={11, 22, 33, 44};
        num(arr);
        System.out.println(arr[1]);
    }
}
