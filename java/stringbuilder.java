public class stringbuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Sagar");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(1,'u');
        System.out.println(sb);
        sb.insert(0,'A');
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
    }
}
