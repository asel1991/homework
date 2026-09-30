public class main {
    public static void main (String[] args) {
        
        System.out.println("task 1");
        int a = 15;
        int b = 4;
        System.out.println("a = " + a + " b = " + b);
        System.out.println("sum: " + (a + b));
        System.out.println("difrense: " + (a - b));
        System.out.println("multply: " + (a * b));
        System.out.println("divison: " + (a / b));
        System.out.println("remander: " + (a % b));

        System.out.println("\ntask 2");
        int num1 = 7;
        int num2 = 2;
        System.out.println("int 7 / 2 = " + (num1 / num2));

        double d1 = 7.0;
        double d2 = 2.0;
        System.out.println("double 7.0 / 2.0 = " + (d1 / d2));
        System.out.println("difrense: int drops the fraction and gets 3, double counts precise 3.5");

        System.out.println("\ntask 3");
        int x = 5;
        System.out.println("start x = " + x);
        System.out.println("x++: " + (x++));
        System.out.println("++x: " + (++x));
        System.out.println("x--: " + (x--));
        System.out.println("--x: " + (--x));

        System.out.println("\ntask 4");
        int n = 20;
        System.out.println("start n = " + n);
        n += 5;
        System.out.println("after += 5 -> " + n);
        n -= 3;
        System.out.println("after -= 3 -> " + n);
        n *= 2;
        System.out.println("after *= 2 -> " + n);
        n /= 4;
        System.out.println("after /= 4 -> " + n);
        n %= 3;
        System.out.println("after %= 3 -> " + n);

        System.out.println("\ntask 5");
        int age = 25;
        double salary = 5000.0;
        System.out.println("age > 18 and salary > 4000 : " + (age > 18 && salary > 4000));
        System.out.println("age < 18 or salary > 4000 : " + (age < 18 || salary > 4000));
        System.out.println("not (age == 25) : " + (!(age == 25)));

        System.out.println("\ntask 6");
        int p = 12;
        int q = 10;
        
        int and = p & q;
        int or = p | q;
        int xor = p ^ q;
        int not = ~p;

        System.out.println("p & q = " + and + " in binry: " + Integer.toBinaryString(and));
        System.out.println("p | q = " + or + " in binry: " + Integer.toBinaryString(or));
        System.out.println("p ^ q = " + xor + " in binry: " + Integer.toBinaryString(xor));
        System.out.println("~p = " + not + " in binry: " + Integer.toBinaryString(not));

        System.out.println("\ntask 7");
        System.out.println("8 << 2 = " + (8 << 2));
        System.out.println("8 >> 1 = " + (8 >> 1));
        System.out.println("-16 >>> 28 = " + (-16 >>> 28));

        int first = 15;
        int second = 42;
        int max = (first > second) ? first : second;
        System.out.println("bigger number from " + first + " and " + second + " is: " + max);
    }
}