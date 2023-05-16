public class Swapping2Numbers{
    public static void main(String[] args){
        int a=10, b=20;
        System.out.println("Before Swapping values are"+a+" "+b);
        b = a+b-(a=b);
        System.out.println("After Swapping values are"+a+" "+b);
        
    }
}
