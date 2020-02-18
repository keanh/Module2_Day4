import java.util.Scanner;

public class testRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều rộng");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Diện tích: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());
        System.out.println("Chỉ số của hcn: " + rectangle.display());
    }
}

