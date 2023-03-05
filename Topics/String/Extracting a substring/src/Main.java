import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt() + 1;
        System.out.println(name.substring(first, second));
    }
}
