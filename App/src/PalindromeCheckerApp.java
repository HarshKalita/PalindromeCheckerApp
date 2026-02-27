import java.util.*;
public class PalindromeCheckerApp {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int a=0,b=0;
        while(n!=0){
            a = n%10;
            b = b*10+a;
            n = n/10;
        }
        if(n==b){
            System.out.println(n + " is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
