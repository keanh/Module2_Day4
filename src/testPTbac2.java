import java.util.Scanner;

public class testPTbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        double a= scanner.nextDouble();
        System.out.println("Nhập b");
        double b=scanner.nextDouble();
        System.out.println("Nhập c");
        double c=scanner.nextDouble();

        Account account = new Account(a,b,c);
        System.out.println("Delta: " + account.getDiscriminant());
        if (account.getDiscriminant()>0){
            System.out.println("Root 1: " + account.getRoot1());
            System.out.println("Root 2: " + account.getRoot2());
        }else if (account.getDiscriminant() == 0){
            System.out.println("Root: " + account.getRoot());
        }else{
            System.out.println("The equation has no roots");
        }
    }
}
