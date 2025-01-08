import java.util.*;
public class Volume{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int height=sc.nextInt();
int radius=sc.nextInt();
double volume=3.14* (radius*radius)*height;
System.out.println("Volume of the cylinder is " + volume);
}
}
