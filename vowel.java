import java.util.Scanner;
public class vowel {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a character : ");
        char ch = 'a';
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("the character is a vowel :"+ch);
        }
     }
}
