import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("size: ");
            int n = sc.nextInt();
            System.out.print("k: ");
            int k = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("k largest element:" +arr[k]);
    }
}
