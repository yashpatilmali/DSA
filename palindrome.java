import java.util.Scanner;
public class palindrome {
    public static void main (String[] args ){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int temp = n ,rev=0;

        while (n!=0){
            rev = n % 10 + rev * 10;
             n = n/10;



        }
        System.out.println(temp==rev ? "palindrome": "not palindrome");



    }
    
}
