import java.util.*;
public class CelToFah{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int temp_in_celsius= sc.nextInt();
Double temp_in_fahrenheit=(double) (temp_in_celsius * 9/5)+32;
System.out.print("temperature in Fahrenheit = " + temp_in_fahrenheit);
}
}
