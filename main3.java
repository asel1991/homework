public class main3 {
    public static void main(String[] args) {

        System.out.println("task 14");
        int n14 = 15;
        System.out.println("numbers 1 to N:");
        for (int i = 1; i <= n14; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("revers order:");
        for (int i = n14; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\ntask 15");
        int num15 = 4827;
        int temp15 = num15;
        int sum15 = 0;
        while (temp15 > 0) {
            sum15 += temp15 % 10;
            temp15 /= 10;
        }
        System.out.println("sum of digits for " + num15 + " is: " + sum15);

        System.out.println("\ntask 16");
        int n16 = 20;
        long fact = 1;
        for (int i = 1; i <= n16; i++) {
            fact *= i;
        }
        System.out.println("factorial of " + n16 + " is: " + fact);

        System.out.println("\ntask 17");
        int num17 = 7;
        int count17 = 1;
        System.out.println("multiplication table for " + num17 + ":");
        do {
            System.out.println(num17 + " * " + count17 + " = " + (num17 * count17));
            count17++;
        } while (count17 <= 10);

        System.out.println("\ntask 18");
        int num18 = 29;
        boolean isprime = true;
        if (num18 <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i <= num18 / 2; i++) {
                if (num18 % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        if (isprime) {
            System.out.println(num18 + " is prime number");
        } else {
            System.out.println(num18 + " is not prime number");
        }

        System.out.println("all primes from 1 to 50:");
        for (int i = 2; i <= 50; i++) {
            boolean check = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("\ntask 19");
        int n19 = 15;
        long first = 0;
        long second = 1;
        System.out.println("first " + n19 + " fibonaci numbers:");
        for (int i = 1; i <= n19; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();

        System.out.println("\ntask 20");
        int rows = 5;
        System.out.println("star pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("number patern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
