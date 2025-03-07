
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
if (num1 > num2)
 System.out.println("Number 1 is greater than number 2");
else if(num1 < num2)
 System.out.println("Number 2 is greater than number 1");
else
System.out.println("Both numbers are equal");
}}