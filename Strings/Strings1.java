import java.util.*;

public class Strings1{
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz@1234");

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(str);
        System.out.println(str2);


        String fullName = "Tony Stark";
        System.out.println(fullName.length());

        String firstName = "Shradha";
        String lastName = "Khapra";
        fullName = firstName + " " + lastName;
        System.out.println(fullName + "\nis this");
        System.out.println(fullName.charAt(0));

        printletters(fullName);

    }
}