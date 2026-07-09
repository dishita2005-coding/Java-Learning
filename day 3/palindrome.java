import java.util.Scanner;
public class Main{
public static void main (String[] args){
  
Scanner sc = new scanner (System.in);
System.out.println("Enter value of n: ");
int n = sc.nextInt();
int original = n;      // Save the original number
int reverse = 0;

while (n != 0) {
    int digit = n % 10;
    reverse = reverse * 10 + digit;
    n = n / 10;
}

if (reverse == original) {
    System.out.println("It is a palindrome number");
} else {
    System.out.println("It is not a palindrome number");
}
