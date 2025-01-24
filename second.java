import java.util.Scanner;
class second
{
    public static void main(String[] args) {
        Scanner asw = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        String A = asw.nextLine();
        System.out.print("Enter Your Age:");
        int B = asw.nextInt();
        System.out.println("My Name is:" + A);
        System.out.println("My Age is:" + B);
    }
}