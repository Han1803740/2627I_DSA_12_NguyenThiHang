import java.util.*;
public class Countingsort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] result = new int[100];

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            result[num]++;
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(result[i] + " ");
        }
    }
}