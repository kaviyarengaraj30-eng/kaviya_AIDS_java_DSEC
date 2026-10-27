
public class main {
    public static void main(String[] args) {
        int a[] = {0, 5, 0, 8, 3, 0};
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                j++;
            }
        }

        while (j < a.length) {
            a[j] = 0;
            j++;
        }

        System.out.println("Array after moving zeros:");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

public class main {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int key = 30;

        int low = 0;
        int high = a.length - 1;
        int pos = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key) {
                pos = mid;
                break;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (pos != -1) {
            System.out.println("Found at index - " + pos);
        } else {
            System.out.println("Not found");
        }
    }
}

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int max = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        max = a[0];

        for (int i = 1; i < 5; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Max = " + max);

        sc.close();
    }
}
