import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter length:" );
        System.out.println("Enter breadth:" );
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        System.out.println("length is " + length);
        System.out.println("breadth is  "+ breadth);
        double area = length * breadth;
        System.out.println("The area is: "+area);


    }
}
