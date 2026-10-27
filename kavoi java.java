

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;

        int n = 4;

        System.out.println("Enter value:");
        int value = sc.nextInt();

        System.out.println("Enter index (0 to " + n + "):");
        int pos = sc.nextInt();

        if (pos < 0 || pos > n || n == a.length) {
            System.out.println("Invalid insertion");
        } else {
            for (int i = n; i > pos; i--) {
                a[i] = a[i - 1];
            }

            a[pos] = value;
            n++;

            System.out.println("Array after insertion:");

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }

        sc.close();
    }
}

public class Main {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};

        a[1] = 99;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
public class main {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int n = 5;
        int pos = 2;

        for (int i = pos; i < n - 1; i++) {
            a[i] = a[i + 1];
        }

        n--;

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
public class main {
    public static void main(String[] args) {
        int a[] = {40, 10, 30, 20, 50};
        int key = 20;
        int pos = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                pos = i;
                break;
            }
        }

        System.out.println("Position = " + pos);
    }
}
