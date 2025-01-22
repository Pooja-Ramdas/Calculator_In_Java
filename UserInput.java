import java.util.*;
public class UserInput {
    int[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the first operand: ");
        int first = sc.nextInt();
        System.out.println("Enter the value of the second operand: ");
        int second = sc.nextInt();
        int arr[] = new int[2];
        arr[0] = first;
        arr[1] = second;
        return arr;
    }
}
