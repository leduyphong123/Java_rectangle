import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.print("input width : ");
        width = scanner.nextFloat();

        System.out.print("input height : ");
        height = scanner.nextFloat();

        System.out.print("S = " + width * height);
    }
}