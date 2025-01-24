import java.util.Scanner;
class arithmetic 
{
public static void main(String args[])
{
Scanner asw = new Scanner(System.in);
System.out.print("Enter a Number:");
int A = asw.nextInt();
System.out.print("Enter a Number:");
int B = asw.nextInt();
System.out.println("The Sum is:" +(A+B));
System.out.println("The Sum is:" + (A-B));
System.out.println("The Sum is:" + (A*B));
System.out.println("The Sum is:" +(A/B));
}
}

