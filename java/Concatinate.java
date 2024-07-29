import java.util.*;
public class Concatinate {
    public static void main(String args[]){
        String firstName="Sagar";
        String lastName="Nayek";
        String fullName= firstName + " " +lastName;
        System.out.println(fullName.length());
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
