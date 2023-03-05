import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = num / 100;
        int num2 = (num/10) % 10;
        int num3 = num % 10;
        // System.out.println(num1 + "" + num2 + "" + num3);
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }
}