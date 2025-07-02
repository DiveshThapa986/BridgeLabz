import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("elements:");
        int length = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            length++;
        }
        System.out.println(length);
    }
}
