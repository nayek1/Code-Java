import java.util.*;
public class sum {
    public static int calculateSum(int a,int b,int c){
        int Sum = a+b+c;
        return Sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int Sum=calculateSum(a,b,c);
        System.out.println(Sum);
    }
}
