public class java {
    public static void main(String[] args) {

        System.out.println("Task 8");
        int num = -5;
        if (num > 0) {
            System.out.println("number is posetive");
        } else if (num < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("number is zero");
        }

        System.out.println("\ntask 9");
        int val = 7;
        if (val % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

        System.out.println("\ntask 10");
        int num1 = 12;
        int num2 = 45;
        int num3 = 23;
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("largest is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("largest is: " + num2);
        } else {
            System.out.println("largest is: " + num3);
        }

        System.out.println("\ntask 11");
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("year is leap year");
        } else {
            System.out.println("year is not leap year");
        }

        System.out.println("\ntask 12");
        int marks = 85;
        if (marks < 0 || marks > 100) {
            System.out.println("invalid");
        } else if (marks >= 90) {
            System.out.println("grade: A");
        } else if (marks >= 80) {
            System.out.println("grade: B");
        } else if (marks >= 70) {
            System.out.println("grade: C");
        } else if (marks >= 60) {
            System.out.println("grade: D");
        } else {
            System.out.println("grade: F");
        }

        System.out.println("\ntask 13");
        double d1 = 10.0;
        double d2 = 2.0;
        char op = '/';

        switch (op) {
            case '+':
                System.out.println("result: " + (d1 + d2));
                break;
            case '-':
                System.out.println("result: " + (d1 - d2));
                break;
            case '*':
                System.out.println("result: " + (d1 * d2));
                break;
            case '/':
                if (d2 == 0) {
                    System.out.println("error divison by zero");
                } else {
                    System.out.println("result: " + (d1 / d2));
                }
                break;
            default:
                System.out.println("unknow operator");
                break;
        }
    }
}
