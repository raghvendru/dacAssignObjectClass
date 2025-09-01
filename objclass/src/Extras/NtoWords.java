package Extras;
import java.util.*;

public class NtoWords {
    static String[] ones = {"","one","two","three","four","five","six","seven","eight","nine","ten",
                            "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
                            "eighteen","nineteen"};
    static String[] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    
    public static String con(int n) {
        if(n == 0) return "zero";
        return actualConver(n).trim().replaceAll("\\s+", " "); // ✅ clean spaces
    }
    
    public static String actualConver(int n) {
        if(n == 0) return "";
        if(n < 20) return ones[n];
        if(n < 100) return tens[n/10] + (n%10 != 0 ? " " + ones[n%10] : "");
        if(n < 1000) return ones[n/100] + " hundred " + actualConver(n%100);
        if(n < 100000) return actualConver(n/1000) + " thousand " + actualConver(n%1000);
        if(n < 10000000) return actualConver(n/100000) + " lakh " + actualConver(n%100000);
        return actualConver(n/10000000) + " crore " + actualConver(n%10000000);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            String ans = con(n);
            System.out.println("In words: " + ans);
        }
    }
}
