

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
