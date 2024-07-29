public class patte{
    public static void main(String args[]){
        int n = 10;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("10 ");
                } else {
                    System.out.print("11 ");
                }
            }
            System.out.println();
        }
    }
}