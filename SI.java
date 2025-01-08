import java.util.*;
public class SI{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int principle=sc.nextInt();
int rate=sc.nextInt();
int time=sc.nextInt();
double SI=(principle* rate*time)/100;
System.out.println("Simple intrest is equal to " + SI);
}
}