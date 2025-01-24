import java.util.Scanner;

class Str_compare {
    public static void main(String Args[]) {
        Scanner asw = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String S1 = asw.nextLine();
        System.out.print("Enter a String : ");
        String S2 = asw.nextLine();
        System.out.println( S1.equals(S2));
    }
}
